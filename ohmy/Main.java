package ohmy;

//import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ListWorkers workers = new ListWorkers();
        workers.addLast(1);
        workers.addLast(24);
        workers.addLast(76);
        workers.addFirst(13);
        workers.addFirst(43);
        workers.addFirst(69);

        // Iterator<Integer> iterator = workers.iterator(); ////Долго
        // while (iterator.hasNext()) {
        //// System.out.println(iterator.next());
        // }

        for (Integer integer : workers) { ////// iterator
            System.out.println(integer);
        }

        /**
         * //для себя, прикольное удаление
         * 
         * LinkedList<Integer> workers2 = getRandomList();
         * ListIterator<Integer> iterator = list.listIterator(); //ListIterator -
         * previous, add, set
         * //while (iterator.hasNext()) {
         * //int item = iterator.next():
         * //if (item >= 27) {
         * //iterator.remove();
         * //}
         * 
         * list.removeIf(item -> item >=27); //// вау! самый быстрый, говорят
         * }
         * 
         * // и сюда
         * 
         * public static LinkedList<Integer> getRandomList() {
         * LinkedList<Integer> workers2 = new LinkedList<>();
         * for (int i = 0; i < 100; i++) {
         * list.add((int) Math.round(Math.random() * 256))
         * }
         * return workers2;
         * }
         */

         for(int i: Range.fromTo(0, 10)) {
            System.out.println(i);
         }
    }

    private static class Range implements Iterable<Integer> {   //прикольно, даже не коллекция
        int start;
        int end;

        public static Range fromTo(int from, int to) {
            return new Range(from, to);
        }

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);
        }

        class Iterator implements java.util.Iterator<Integer> {

            int current;

            public Iterator(int current) {
                this.current = current;

            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;//
            }
        }
    }
}
