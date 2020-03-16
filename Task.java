public class Task {
    public String name, description;
    public int difficulty;

    public Task(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public void setDescription(String d) {
        this.description = d;
    }
}