import java.util.ArrayList;
import java.util.List;

public class SubscriptionManager {
    private List<Subscription> subscriptions = new ArrayList<>();

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
        // Save to database
    }

    public void removeSubscription(Subscription subscription) {
        subscriptions.remove(subscription);
        // Remove from database
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }
}
