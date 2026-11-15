package sim;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1, "befejezni ezt", false);
        Task task2 = new Task(2, "befejezni ezt is", false);
        Task task3 = new Task(3, "befejezni ezt is", true);
        TaskList list1 = new TaskList();

        list1.taskAdder(task1);
        list1.taskAdder(task2);
        list1.taskAdder(task3);

        list1.taskLister(list1.getTasksToDo());

        list1.setTaskDone(task3);
        list1.taskLister(list1.getTasksToDo());
    }
}