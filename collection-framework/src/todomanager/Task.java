package todomanager;

public record Task(int id, String description) implements Comparable<Task> {

    @Override
    public int compareTo(Task t) {
        return id-t.id();
    }


}
