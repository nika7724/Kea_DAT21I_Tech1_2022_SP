package CountingThreads;

public class CountingThread extends Thread {
    //todo Create a threead that counts to 100
    public void run() {
        for(int i = 0; i<100; i++) {
            System.out.println(i);
        }
    }
}
