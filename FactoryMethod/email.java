package FactoryMethod;

public class email implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Hello from EMAIL....");
    }
}
