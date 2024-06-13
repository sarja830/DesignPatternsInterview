package main.listeners;

public class EmailEventListener implements EventListener {
    @Override
    public void update(String content) {
        System.out.println("updating email listener"+content);
    }
}
