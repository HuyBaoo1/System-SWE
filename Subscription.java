public class Subscription {
    private User user;
    private String url;
    private String frequency; // e.g., "daily", "hourly"
    private String notificationChannel; // e.g., "email"

    // Constructors, getters, and setters
    public Subscription(User user, String url, String frequency, String notificationChannel) {
        this.user = user;
        this.url = url;
        this.frequency = frequency;
        this.notificationChannel = notificationChannel;
    }

    public User getUser() {
        return user;
    }

    public String getUrl() {
        return url;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getNotificationChannel() {
        return notificationChannel;
    }
}
