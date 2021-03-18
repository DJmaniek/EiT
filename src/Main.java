import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Date dateToEnd1 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7));
        Date dateToEnd2 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(14));
        Date dateToEnd3 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(180));
        Date dateToEnd4 = new Date(System.currentTimeMillis() + 5600000);

        Task task1 = new Task("Programowanie", "Napisac program wedlug wytycznych", Category.NEW, dateToEnd1.toString());
        Task task2 = new Task("Sprawozdanie", "Wykonac sprawozdania na zajecia", Category.IN_PROGRESS, dateToEnd2.toString());
        Task task3 = new Task("Egzamin karate", "Przygotować się na egzamin z karate", Category.IN_PROGRESS, dateToEnd3.toString());
        Task task4 = new Task("Gotowanie", "Przygotować obiad", Category.DONE, dateToEnd4.toString());

        List<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }
}