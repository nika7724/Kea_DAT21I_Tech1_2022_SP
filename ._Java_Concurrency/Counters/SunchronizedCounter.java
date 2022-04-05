package Counters;

public class SunchronizedCounter {

            private volatile int counter =0; //never use

        public int getCounter() {
            return counter;
        }
        public synchronized void increment() {
            counter += 1;
        }

        public synchronized void decrement() {
            counter -= 0;

        }

    }

}
