public class Assignment extends PlanItem {

    Assignment(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    String getCategory() {
        return "Assignment";
    }

    @Override
    String getUrgency() {
        if (completed)      return "Done";
        if (daysUntil <= 2) return "URGENT";
        if (daysUntil <= 5) return "Medium";
        return "Low";
    }

    @Override
    void display() {
        System.out.println("[" + getCategory() + "] " + title);
        System.out.println("  Days until: " + daysUntil + " | Hours needed: " + estimatedHours + " | Urgency: " + getUrgency() + " | Done: " + completed);
    }
}