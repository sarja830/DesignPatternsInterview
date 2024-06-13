package main;

import main.listeners.EmailEventListener;
import main.listeners.EventListener;
import main.listeners.MsgEventListener;

public class Main {
    public static void main(String[] args)
    {
        Store store = new Store(new Publisher());

        EventListener rohan =  new EmailEventListener();
        EventListener shrishti =  new EmailEventListener();
        EventListener tilak =  new EmailEventListener();
        EventListener janki =  new EmailEventListener();
        EventListener a = new MsgEventListener();
        EventListener a1 = new EmailEventListener();
        EventListener a2 = new EmailEventListener();
        EventListener a3 = new EmailEventListener();
        store.getNotificationService().subscribe(rohan,Event.PRODUCT_RESTOCK);
        store.getNotificationService().subscribe(shrishti,Event.PRODUCT_RESTOCK);
        store.getNotificationService().subscribe(janki,Event.PRODUCT_RESTOCK);
        store.getNotificationService().subscribe(tilak,Event.PRODUCT_RESTOCK);
        store.getNotificationService().subscribe(a,Event.PRODUCT_NEW_STOCK);
        store.getNotificationService().subscribe(a1,Event.PRODUCT_NEW_STOCK);
        store.getNotificationService().subscribe(a2,Event.PRODUCT_NEW_STOCK);
        store.getNotificationService().subscribe(a3,Event.PRODUCT_NEW_STOCK);
        store.notifyCustomers(Event.PRODUCT_RESTOCK);
        store.notifyCustomers(Event.PRODUCT_NEW_STOCK);
        store.notifyCustomers(Event.PRODUCT_NEW_STOCK);

    }
}