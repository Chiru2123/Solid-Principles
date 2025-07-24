interface Notifier {
    void sendNotification(String message);
}

class SmsNotifier implements Notifier {
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}

class DependencyInversionPrinciple {
    private Notifier notifier;

    public DependencyInversionPrinciple(Notifier notifier) {
        this.notifier = notifier;
    }

    public void alertUser() {
        notifier.sendNotification("Your OTP is 123456");
    }

    public static void main(String[] args) {
        Notifier sms = new SmsNotifier();
        DependencyInversionPrinciple alert = new DependencyInversionPrinciple(sms);
        alert.alertUser();
    }
}
