package IndividualAssignment1;

public class Node {
        Task task;//reference to a task
        Node next;//reference to the next node in the linked list
        // Constructor to initialize a node with a task.
        public Node(Task task) {
            this.task = task;
            this.next = null;  // Next node is null by default
        }
    }

