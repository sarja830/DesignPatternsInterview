package main;
import java.util.*;
import main.listeners.EventListener;

public class Publisher {

    private  HashMap<Event, List<EventListener>> customers;

    public Publisher()
    {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> {
            customers.put(event, new ArrayList<>());
        });
    }

    void subscribe(EventListener eventListeners, Event event)
    {
        customers.get(event).add(eventListeners);
    }
    void unsubscribe(Event event, EventListener eventListener)
    {
        customers.get(event).remove(eventListener);

    }
    void notify(Event eventType  )
    {
        for(EventListener e: customers.get(eventType))
            e.update(String.valueOf(eventType));
    }


}
