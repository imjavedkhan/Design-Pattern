package FactoryMethod;

public class NotificationFactory {

    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        return switch (channel.toUpperCase()) {
            case "SMS" -> new sms();
            case "EMAIL" -> new email();
            case "PUSH" -> new push();
            default -> throw new IllegalArgumentException("Unknown channel " + channel);
        };
    }

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("sms");
        notification.notifyUser();
    }

}
