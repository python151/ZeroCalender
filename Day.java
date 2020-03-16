import java.util.ArrayList;

public class Day {
    public int dayOfWeek, dayOfMonth, dayOfYear, month;

    public ArrayList<Task> agenda = new ArrayList<Task>();

    public Date getDate() {
        return new Date(dayOfMonth, month);
    }

    public void addTask(Task t) {
        agenda.add(t);
    }

}