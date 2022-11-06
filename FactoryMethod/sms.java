package FactoryMethod;

public class sms implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Hello from SMS....");
    }
}
