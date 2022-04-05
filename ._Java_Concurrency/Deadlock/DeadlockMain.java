package Deadlock;

public class DeadlockMain {

    public static void main(String[] args) throws InterruptedException {
        final String lockOne = "I am lock one"; // final= other people can't change
        final String lockTwo = "I am lock two";

        Thread threadOne = new Thread() {
            public void run() {
                synchronized (lockOne) {
                    System.out.println("I am thread1 I got lock 1");
                    synchronized (lockTwo) {
                        System.out.println("I am thread2 I got lock 2");
                    }
                }
            }
        };


        Thread threadTwo = new Thread() {
            public void run() {
                synchronized (lockTwo) {
                    System.out.println("I am thread2 I got lock 2");
                    synchronized (lockOne) {
                        System.out.println("I am thread1 I got lock 1");
                    }
                }
            }
        };
        threadOne.start();
        threadTwo.start();
    }
}
