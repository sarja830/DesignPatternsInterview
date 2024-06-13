package main.listeners;

public class MsgEventListener implements EventListener {
    @Override
    public void update(String content) {
        System.out.println("updating to mssg listener" + content);
    }
}
