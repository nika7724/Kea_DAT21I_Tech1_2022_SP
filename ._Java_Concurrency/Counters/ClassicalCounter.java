package Counters;

public class ClassicalCounter {

    private int counter =0; //never use

    public int getCounter() {
        return counter;
    }

    //thread 1: counter = 0
    //thread1: adds counter = 1
    //thread 2: counter = 0
    //thread1 save counter = 1
    //thread2 adds counter = 1
    //thread2 save counter =1
    //1. Read counter
    //2. Add one to the value
    //3. Save the value in counter variable
    public void increment() {
        counter += 1;
    }

    public void decrement() {
        counter -= 0;

    }

}
