public class NotificationService {
    public static void notifyUser(Subscription subscription) {
        User user = subscription.getUser();
        String channel = subscription.getNotificationChannel();

        if ("email".equalsIgnoreCase(channel)) {
            sendEmail(user.getEmail(), "Website Update", "The website " + subscription.getUrl() + " has been updated.");
        }
        // Add other notification channels as needed
    }

    private static void sendEmail(String to, String subject, String body) {
        // Implement email sending logic
        System.out.println("Sending email to " + to + " with subject " + subject);
    }
}
