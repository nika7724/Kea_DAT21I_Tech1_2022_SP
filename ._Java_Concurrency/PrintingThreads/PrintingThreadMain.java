package PrintingThreads;

public class PrintingThreadMain {

    public static void main(String[] args) throws InterruptedException {
   PrintingThread printingThreadOne = new PrintingThread("Good to be here today said Zaland");
   PrintingThread printingThreadTwo = new PrintingThread("12324242424");
   PrintingThread printingThreadThree = new PrintingThread("/&¤##¤¤%¤&¤&%/%/%/%¤%¤");

   printingThreadOne.start();
   printingThreadTwo.start();
   printingThreadThree.start();
    }
}
