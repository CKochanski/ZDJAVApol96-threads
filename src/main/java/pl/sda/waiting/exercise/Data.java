package pl.sda.waiting.exercise;

public class Data {
    private boolean isTransfer = false;
    private String data = "";

    public synchronized void sendData(String data) throws InterruptedException {
        while(isTransfer) {
            System.out.println("Czekamy na odbiór danych.");
            wait();
        }
        isTransfer = true;
        this.data = data;
        notifyAll();
    }

    public synchronized void receiveData() throws InterruptedException {
        while(!isTransfer) {
            System.out.println("Czekamy na wysłanie danych.");
            wait();
        }
        System.out.println(data);
        isTransfer = false;
        notifyAll();
    }
}
