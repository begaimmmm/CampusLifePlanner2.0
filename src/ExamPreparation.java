public class ExamPreparation extends PlanItem {

    ExamPreparation(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    String getCategory() {
        return "Exam Prep";
    }

    @Override
    String getUrgency() {
        if (completed)      return "Done";
        if (daysUntil <= 3) return "URGENT";
        if (daysUntil <= 7) return "Medium";
        return "Low";
    }

    @Override
    void display() {
        System.out.println("[" + getCategory() + "] " + title);
        System.out.println("  Days until: " + daysUntil + " | Hours needed: " + estimatedHours + " | Urgency: " + getUrgency() + " | Done: " + completed);
    }
}
