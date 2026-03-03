public class PlanItem {
    String title;
    int daysUntil;
    int estimatedHours;
    boolean completed;

    PlanItem(String title, int daysUntil, int estimatedHours) {
        this.title          = title;
        this.daysUntil      = daysUntil;
        this.estimatedHours = estimatedHours;
        this.completed      = false;
    }

    void markCompleted() {
        completed = true;
        System.out.println(title + " is completed!");
    }

    String getUrgency() {
        if (completed)      return "Done";
        if (daysUntil <= 1) return "URGENT";
        if (daysUntil <= 3) return "Medium";
        return "Low";
    }

    String getCategory() {
        return "General";
    }

    void display() {
        System.out.println("[" + getCategory() + "] " + title);
        System.out.println("  Days until: " + daysUntil + " | Hours needed: " + estimatedHours + " | Urgency: " + getUrgency() + " | Done: " + completed);
    }
}