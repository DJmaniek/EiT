package lab4;

import Lab2.Task;
import Lab2.taskCategory;

public interface TaskManager {
    Task addTask(Task t);
    void removeTask(Task t);
    Task[] getAllTasks();
    Task getTaskByName(String taskName);
    public static final Task [] tasks = { //podalem konkretne przechowywane wartosci, aczkolwiek mozna dodac tutaj pusta tablice za pomoca "public static final Task [] tasks = new Task[10];"
            new Task("Bieganie", "Przebiec 10km", taskCategory.NEW),
            new Task("Czytanie", "Przeczytac ksiazke", taskCategory.DONE),
            new Task("Pływanie", "isc poplywac",taskCategory.NEW),
            new Task("Cwiczenie", "Pojsc na silownie", taskCategory.IN_PROGRESS),
            new Task("Szachy", "Zagrac w szachy",taskCategory.DONE),
            new Task("Gotowanie", "Ugotowac obiad", taskCategory.NEW),
            new Task("Sprzatanie", "Posprzatac dom", taskCategory.IN_PROGRESS),
            new Task("Spotkanie", "Spotkac sie ze znajomymi", taskCategory.DONE),
            new Task("Nauka", "Nauczyc sie programowania", taskCategory.NEW),
            new Task("Programowanie", "Zrobic zadanie na programowanie", taskCategory.IN_PROGRESS),

    };

}
