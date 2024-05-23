import java.util.Timer;
import java.util.TimerTask;

public class WebsiteMonitor {
    private SubscriptionManager subscriptionManager;

    public WebsiteMonitor(SubscriptionManager subscriptionManager) {
        this.subscriptionManager = subscriptionManager;
    }

    public void startMonitoring() {
        Timer timer = new Timer();
        timer.schedule(new MonitorTask(), 0, 60000); // Check every minute
    }

    class MonitorTask extends TimerTask {
        @Override
        public void run() {
            for (Subscription subscription : subscriptionManager.getSubscriptions()) {
                checkForUpdate(subscription);
            }
        }

        private void checkForUpdate(Subscription subscription) {
            // Logic to check for website update
            // If update detected:
            NotificationService.notifyUser(subscription);
        }
    }
}
