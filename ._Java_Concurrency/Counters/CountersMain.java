package Counters;

import static java.lang.Thread.sleep;

public class CountersMain {

    public static void main(String[] args) throws InterruptedException {
        //ClassicalCounter counter = new ClassicalCounter(); //intantiate
        //SynchronizedCounter counter = new SynchronizedCounter();
        AtomicCounter counter = new AtomicCounter();

        Thread threadOne = new Thread()  {
            public void run() {
                for (int i = 0; i <1000; i++) {
                    counter.increment(); //I want to increment 1000 times
                }
            }
        };

        Thread threadTwo = new Thread()  {
            public void run() {
                for (int i = 0; i <1000; i++) {
                    counter.increment(); //I want to increment 1000 times
                }
            }
        };

        Thread threadThree = new Thread()  {
            public void run() {
                for (int i = 0; i <1000; i++) {
                    counter.increment(); //I want to increment 1000 times
                }
            }
        };

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        sleep(1000); // delete
        System.out.println(counter.getCounter());

    }
}
