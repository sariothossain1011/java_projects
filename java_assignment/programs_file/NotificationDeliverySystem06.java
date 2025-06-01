interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    private String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void send(String message) {
        System.out.println("Sending EMAIL to " + emailAddress + ": " + message);
    }
}

class SMSNotification implements Notification {
    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void send(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}

class PushNotification implements Notification {
    private String deviceToken;

    public PushNotification(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public void send(String message) {
        System.out.println("Sending PUSH notification to device " + deviceToken + ": " + message);
    }
}

public class NotificationDeliverySystem06 {
    public static void main(String[] args) {
        Notification email = new EmailNotification("2024100010092@seu.edu.bd");
        Notification sms = new SMSNotification("+8801881286290");
        Notification push = new PushNotification("Token_123");

        Notification[] notifications = { email, sms, push };

        System.out.println("--- Notification Delivery ---");
        for (Notification n : notifications) {
            n.send("This is a system alert!");
        }
    }
}
