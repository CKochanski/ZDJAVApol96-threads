package pl.sda.synchronization;

public class Pair {

    private int key;
    private int value;

    public synchronized void incrementKey() {
        key++;
    }

    public synchronized void incrementValue() {
        value++;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }


}
