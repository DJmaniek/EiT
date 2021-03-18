import java.util.Date;
import java.lang.System;

public class Task {
    Date DataZ = new Date(System.currentTimeMillis());
        private String taskName;
        private String taskDescription;
        private Category taskCategory;
        private String taskDateTimeStop;
        private String taskDateTimeStart = DataZ.toString();

    public Task (String taskName, String taskDescription, Category taskCategory, String taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
    }
    public String toString() {
        return "Name: " + taskName + ", Description: " + taskDescription + ", Category: " + taskCategory.name() +
                ", Time start: " + taskDateTimeStart + ", Time stop: " + taskDateTimeStop;
    }
}