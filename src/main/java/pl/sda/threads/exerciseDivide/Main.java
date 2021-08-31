package pl.sda.threads.exerciseDivide;

import java.util.ArrayList;
import java.util.List;

/*
Napisz program, który równolegle znajdzie liczby parzyste w dwóch
przedziałach: 1000-2000 oraz 14300-17800 .
 */
public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            List<Integer> list1= new ArrayList<>();
            for(int i=1000; i<2000;i++){
                if(i%2==0)
                    list1.add(i);
            }
            System.out.println(list1);
        });

        Thread thread2 = new Thread(() -> {
            List<Integer> list1= new ArrayList<>();
            for(int i=14300; i<17800;i++){
                if(i%2==0)
                    list1.add(i);
            }
            System.out.println(list1);
        });

        thread1.start();
        thread2.start();


    }
}
