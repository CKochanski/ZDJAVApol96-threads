package pl.sda.waiting.exercise;

public class Sender implements Runnable {
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                data.sendData("Message " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
