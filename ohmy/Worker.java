package ohmy;

public class Worker<Integer> {

    int data;
    Worker<Integer> next;

    public Worker(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("Worker %d", data);
    }
}
