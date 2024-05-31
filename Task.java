package IndividualAssignment1;

public class Task {
    private String title, description;
    boolean completed;
    // Constructor to initialize a task with a title and description.
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;  //Tasks are incomplete by default
    }
    // Getter method to retrieve the title of the task.
    public String getTitle() {
        return title;
    }
    // Getter method to retrieve the description of the task.
    public String getDescription() {
        return description;
    }
    // Getter method to check if the task is completed.
    public boolean isCompleted() {
        return completed;
    }
    // Method to mark the task as completed.
    public void markCompleted() {
        this.completed = true;
    }
    public String toString() {
        return "Task{" +
                "Title:'" + title + '\'' +
                ", Description:'" + description + '\'' +
                ", Completed=" + completed +
                '}';
    }
}

