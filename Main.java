public class Main {
    public static void main(String[] args) {
        Day d = new Day();

        d.month = 3;
        d.dayOfMonth = 15;

        d.addTask(new Task("Coding", 8));
        d.addTask(new Task("Watching TV", 3));

        for (Task task : d.agenda) {
            System.out.println(task.name);
        }

        Year y = new Year();

        y.setDay(d.getDate(), d);
        
        y.showYear();
        
    }
}