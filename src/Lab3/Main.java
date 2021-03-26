package Lab3;

import Lab2.Task;
import Lab2.taskCategory;

public class Main {
    public static void main(String[] args) {
        Task zad1 = new Task("Gotowanie", "Ugotowac obiad", taskCategory.DONE);
        Subtask zad2 = (Subtask) new Task("Nauka", "Pouczyc sie programowania", taskCategory.IN_PROGRESS);
        Task zad3 = (Task) new Object();
        Subtask zad4 = (Subtask) new Object();
    }
    public void getDetailInfo(Object o){
    };
}