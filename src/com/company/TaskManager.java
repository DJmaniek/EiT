package lab4;

import Lab2.Task;
import Lab2.taskCategory;

public interface TaskManager {
    Task addTask(Task t);
    void removeTask(Task t);
    Task[] getAllTasks();
    Task getTaskByName(String taskName);
    public static final Task [] tasks = {
            new Task("Bieganie", "Przebiec 3k w 30min", taskCategory.NEW),
            new Task("Czytanie", "Przeczytac artukół w internecie", taskCategory.DONE),
            new Task("Cwiczenie", "Poćwiczyć programowanie", taskCategory.IN_PROGRESS),
            new Task("Szachy", "Zagrac w szachy z kolegami",taskCategory.DONE),
            new Task("Gotowanie", "Ugotowac posiłek na pare dni", taskCategory.NEW),
            new Task("Sprzatanie", "Posprzatac samochod", taskCategory.IN_PROGRESS),
            new Task("Nauka", "Nauczyc sie czegoś porzytecznego", taskCategory.NEW),
            new Task("Programowanie", "Zrobic zadanie na programowanie", taskCategory.IN_PROGRESS),

    };

}
