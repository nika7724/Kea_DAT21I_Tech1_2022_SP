package PrintingThreads;

public class PrintingThread extends Thread {
    //todo Make PrintingThread take a string('sentence') and print out each char of that sentence
    String sentence;
    final static String lock = "I am a lock"

    public PrintingThread(String sentence) {
        this.sentence = sentence;

    }
        public void run() {

        System.out.println(Thread.currentThread().getName() + " is running");

        synchronized (lock){
    for(int i =0; i<sentence.length(); i++) {
        System.out.println(sentence.charAt(i));
    }
    System.out.println();
    }
}
