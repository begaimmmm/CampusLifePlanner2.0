import java.util.ArrayList;

public class CampusLifePlanner {
    public static void main(String[] args) {


        ArrayList<PlanItem> planner = new ArrayList<>();

        planner.add(new Assignment("Java Homework", 2, 3));
        planner.add(new Assignment("Math Problem Set", 5, 2));
        planner.add(new ExamPreparation("Physics Exam", 3, 6));
        planner.add(new ExamPreparation("History Exam", 10, 4));
        planner.add(new ClubEvent("Chess Club Meeting", 1, 2));
        planner.add(new ClubEvent("Volunteer Day", 4, 3));


        System.out.println(" Campus Planner ");
        System.out.println();
        for (PlanItem item : planner) {
            item.display();
            System.out.println();
        }

        // Mark one item as completed
        System.out.println(" Completing an item ");
        System.out.println();
        planner.get(0).markCompleted();
        System.out.println();
        planner.get(0).display();
        System.out.println();

        // Total remaining hours
        System.out.println(" Summary ");
        System.out.println();

        int totalHours = 0;
        for (PlanItem item : planner) {
            if (!item.completed) {
                totalHours += item.estimatedHours;
            }
        }
        System.out.println("Total hours remaining: " + totalHours + "h");

        // Most urgent item
        PlanItem mostUrgent = null;
        for (PlanItem item : planner) {
            if (!item.completed) {
                if (mostUrgent == null || item.daysUntil < mostUrgent.daysUntil) {
                    mostUrgent = item;
                }
            }
        }
        System.out.println("Most urgent: " + mostUrgent.title + " (in " + mostUrgent.daysUntil + " days)");
    }
}