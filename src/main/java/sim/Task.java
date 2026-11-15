package sim;

public class Task {

    private int number;
    private String taskName;
    private boolean isDone;

    public Task(int number, String taskName, boolean isDone) {
        this.number = number;
        this.taskName = taskName;
        this.isDone = isDone;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return taskName + ", is it Done: " + (isDone ? "Yes" : "No");
    }
}
