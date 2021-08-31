package pl.sda.threads;

import java.util.Random;

public class WhileThread extends Thread{
    Random random = new Random();
    int x = 1;
    @Override
    public void run() {
        while (x <= 10){
        System.out.println(random.nextInt());
        x++;}
    }

}
