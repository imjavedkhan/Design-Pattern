package FactoryMethod;

public class push implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Hello from Push...");
    }
}
