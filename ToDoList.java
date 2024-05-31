package IndividualAssignment1;

// ToDoList Class
public class ToDoList {
    // reference to the head of the linked list
    private Node head;
    //Method to add a new task to the to do list
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // Method to mark a task as completed based on its title.
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task with title \"" + title + "\" not found.");
    }
    // Method to display the list of tasks in the to-do list.
    public void viewToDoList() {
        Node current = head;
        if (current == null) {
            System.out.println("To-Do list is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

// Main Class to test the To-Do List application
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Adding tasks to the to-do list
        toDoList.addToDo(new Task("do assignments", "discrete math, OOP, database"));
        toDoList.addToDo(new Task("study for final", "discrete math by Kenneth Rosen"));
        toDoList.addToDo(new Task("Exercise", "Go to the gym"));
        // Viewing the to-do list
        System.out.println("Initial To-Do List:");
        toDoList.viewToDoList();
        // Marking a task as completed
        toDoList.markToDoAsCompleted("study for final");
        // Viewing the to-do list after marking a task as completed
        System.out.println("\nTo-Do List after marking 'study for final' as completed:");
        toDoList.viewToDoList();
    }
}