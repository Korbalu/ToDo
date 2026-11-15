package sim;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskList {

    private List<Task> tasksToDo = new ArrayList<>();
    private List<Task> tasksDone = new ArrayList<>();

    public TaskList() {
    }

    public void taskAdder(Task taskToAdd) {
        tasksToDo.add(taskToAdd);
    }

    public void taskRemover(Task taskToRemove) {
        Iterator<Task> iter = this.tasksDone.iterator();
        while (iter.hasNext()) {
            if (taskToRemove.equals(iter.next())) {
                iter.remove();
                return;
            }
        }
    }
    public void setTaskDone(Task taskToMove){
        taskMover(taskToMove, this.tasksToDo, this.tasksDone);
    }
    public void  setTaskToDo(Task taskToMove){
        taskMover(taskToMove, this.tasksDone, this.tasksToDo);
    }
    private void taskMover(Task taskToMove, List<Task> listFrom, List<Task> listTo) {
        Iterator<Task> iter = listFrom.iterator();
        while (iter.hasNext()) {
            if (taskToMove.equals(iter.next())) {
                iter.remove();
                listTo.add(taskToMove);
                return;
            }
        }
    }

    public void taskLister(List<Task> listTolist) {
        for (Task task : listTolist) {
            System.out.println(task);
        }
    }

    public List<Task> getTasksToDo() {
        return List.copyOf(tasksToDo);
    }

    public List<Task> getTasksDone() {
        return List.copyOf(tasksDone);
    }
}
