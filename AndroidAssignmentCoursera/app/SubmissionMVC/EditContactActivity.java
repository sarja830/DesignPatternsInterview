package com.example.sharingapp;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Editing a pre-existing contact consists of deleting the old contact and adding a new contact with the old
 * contact's id.
 * Note: You will not be able contacts which are "active" borrowers
 */
public class EditContactActivity extends AppCompatActivity implements Observer {

    private ContactList contact_list = new ContactList();
    private ContactListController contactListController = new ContactListController(contact_list);
    private Contact contact;
    private ContactController contactController;

    private EditText email;
    private EditText username;
    private Context context;


    private boolean on_create_update = false;
    private int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        context = getApplicationContext();
        contact_list.loadContacts(context);

        Intent intent = getIntent();
        int pos = intent.getIntExtra("position", 0);

        contact = contact_list.getContact(pos);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);

        username.setText(contact.getUsername());
        email.setText(contact.getEmail());
    }

    public void saveContact(View view) {

        String email_str = email.getText().toString();

        if (email_str.equals("")) {
            email.setError("Empty field!");
            return;
        }

        if (!email_str.contains("@")) {
            email.setError("Must be an email address!");
            return;
        }

        String username_str = username.getText().toString();
        String id = contact.getId(); // Reuse the contact id


        // Check that username is unique AND username is changed (Note: if username was not changed
        // then this should be fine, because it was already unique.)
        if (!contact_list.isUsernameAvailable(username_str) && !(contact.getUsername().equals(username_str))) {
            username.setError("Username already taken!");
            return;
        }

        Contact updated_contact = new Contact(username_str, email_str, id);

        boolean success = contactListController.editContact(contact, updated_contact, context);
        if (!success) {
            return;
        }
        // End EditContactActivity
        finish();
    }

    public void deleteContact(View view) {

        boolean success = contactListController.deleteContact(contact, context);
        if (!success) {
            return;
        }

        // End EditContactActivity
        finish();
    }


    @Override
    public void update() {

        if (on_create_update) {

            contact = contactListController.getContact(pos);
            contactController = new ContactController(contact);

            username = (EditText) findViewById(R.id.username);
            email = (EditText) findViewById(R.id.email);

            // Update the view
            username.setText(contactController.getUsername());
            email.setText(contactController.getEmail());
        }
    }
}