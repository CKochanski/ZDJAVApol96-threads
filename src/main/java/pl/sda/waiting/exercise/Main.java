package pl.sda.waiting.exercise;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data();

        Thread sendThread = new Thread(new Sender(data));
        Thread receiveThread = new Thread(new Receiver(data));

        sendThread.start();
        receiveThread.start();

        sendThread.join();
        receiveThread.join();
    }
}
