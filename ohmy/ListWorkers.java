package ohmy;

import java.util.Iterator;

public class ListWorkers implements Iterable<Integer> {

    int size = 0;
    private Worker start;
    private Worker end;

    void addLast(int data) {
        Worker<Integer> nextWorker = new Worker<>(data);
        Worker currentWorker = start;


        if (start == null) {
            start = nextWorker;
            end = nextWorker;
        } else {
            while (currentWorker.next != null) {
                currentWorker = currentWorker.next;
            }
            currentWorker.next = nextWorker;
        }
        size += 1;
    }

    void addFirst(int data) {
        {
            Worker<Integer> nextWorker = new Worker<>(data);
            Worker currentWorker = end;


            if (end == null) {
                start = nextWorker;
                end = nextWorker;
            } else {
                nextWorker.next = start;
                start = nextWorker;
            }
        }
        size += 1;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            Worker<Integer> iterateWorker = start;
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public Integer next() {
                int value = iterateWorker.getData();
                iterateWorker = iterateWorker.next;
                index++;
                return value;
            }
        };
    }
}