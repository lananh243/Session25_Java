package bai5;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();

        Observer emailSubscriber = new EmailSubscriber("lananh@example.com");
        Observer smsSubscriber = new SmsSubscriber("0123456789");

        notificationSystem.registerObserver(emailSubscriber);
        notificationSystem.registerObserver(smsSubscriber);

        notificationSystem.notifyObservers("Thông báo mới từ hệ thống!");

        notificationSystem.removeObserver(emailSubscriber);
        notificationSystem.notifyObservers("Thông báo quan trọng!");
    }
}
