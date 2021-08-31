package pl.sda.waiting.exercise;

public class Data {
    private boolean isTransfer = true;
    private String data = "";

    public synchronized void sendData(String data) throws InterruptedException {
        while(!isTransfer) {
            System.out.println("Czekamy na odbiór danych.");
            wait();
        }

        isTransfer = false;
        this.data = data;
        notifyAll();
    }

    public synchronized void receiveData() throws InterruptedException {
        while(isTransfer) {
            System.out.println("Czekamy na wysłanie danych.");
            wait();
        }

        System.out.println(data);
        isTransfer = true;
        notifyAll();
    }
}
