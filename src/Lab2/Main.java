package Lab2;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date dateToEnd1 = new Date(System.currentTimeMillis() + 5600000);
        Date dateToEnd2 = new Date(System.currentTimeMillis() + 93400000);
        Date dateToEnd3 = new Date(System.currentTimeMillis() + 32709000);
        Task task1 = new Task("Przygotowywanie zadania", "zrobic zadanie", taskCategory.NEW, dateToEnd1.toString());
        Task task2 = new Task("Czytanie", "Przeczytac ksiazke", taskCategory.IN_PROGRESS, dateToEnd2.toString());
        Task task3 = new Task("Pisanie", "Napisac do kolegi", taskCategory.DONE, dateToEnd3.toString());
        Date dateToEnd4 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90));
        Task task4 = new Task("Bieganie", "Przebiec 20km", taskCategory.NEW, dateToEnd4.toString());

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

