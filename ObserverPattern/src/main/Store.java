package main;

public class Store {
    private Publisher notificationService;
    public Publisher getNotificationService() {
        return notificationService;
    }
    Store(Publisher notificationService)
    {
        this.notificationService = notificationService;
    }
    public void notifyCustomers(Event event)
    {
        notificationService.notify(event);
    }


}
