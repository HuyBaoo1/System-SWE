public class Main {
    public static void main(String[] args) {
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        WebsiteMonitor monitor = new WebsiteMonitor(subscriptionManager);
        monitor.startMonitoring();
    }
}
