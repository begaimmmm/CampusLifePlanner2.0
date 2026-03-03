public class ClubEvent extends PlanItem {

    ClubEvent(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    String getCategory() {
        return "Club Event";
    }

    @Override
    String getUrgency() {
        if (completed)      return "Done";
        if (daysUntil <= 1) return "URGENT";
        if (daysUntil <= 2) return "Medium";
        return "Low";
    }

    @Override
    void display() {
        System.out.println("[" + getCategory() + "] " + title);
        System.out.println("  Days until: " + daysUntil + " | Hours needed: " + estimatedHours + " | Urgency: " + getUrgency() + " | Done: " + completed);
    }
}
