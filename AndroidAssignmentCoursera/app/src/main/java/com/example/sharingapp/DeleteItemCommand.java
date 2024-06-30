package com.example.sharingapp;

import android.content.Context;

public class DeleteItemCommand extends Command{
    private Item item;
    private ItemList  itemList;
    private Context context;

    public DeleteItemCommand(Item item, ItemList itemList, Context context) {
        this.item = item;
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public void execute() {
        itemList.deleteItem(item);
        setIsExecuted(itemList.saveItems(context));
    }
}
