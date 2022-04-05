package Clock;

public class ClockThread extends Thread {

    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName()":");
        }
    }

}
