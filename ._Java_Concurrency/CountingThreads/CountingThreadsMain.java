package CountingThreads;

public class CountingThreadsMain {
    public static void main(String[] args) throws InterruptedException {

CountingThread countingThreadOne = new CountingThread();
        CountingThread countingThreadTwo = new CountingThread();
        CountingThread countingThreadThree = new CountingThread();

        countingThreadOne.setPriority(Thread.MAX_PRIORITY);
        countingThreadTwo.setPriority(Thread.MAX_PRIORITY);
        countingThreadThree.setPriority(Thread.MAX_PRIORITY);

countingThreadOne.start();
        countingThreadTwo.start();
        countingThreadThree.start();
    }
}
