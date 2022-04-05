package Clock;

public class ClockMain {

    public static void main(String[] args) {
ClockThread clockThreadOne = new ClockThread();
ClockThread clockThreadTwo = new ClockThread();
ClockThread clockThreadThree = new ClockThread();

clockThreadOne.setName("Clock1");
clockThreadTwo.setName("Clock2");

clockThreadOne.start();
clockThreadTwo.start();

    }
}
