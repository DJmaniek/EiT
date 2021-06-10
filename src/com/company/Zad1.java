package com.company;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Zad1 {

    public static void main(String[] args) {


        Thread thread1 = new Thread( () -> {
            LocalTime start = LocalTime.now();
            ArrayList evens = new ArrayList<Integer>();
            for (Integer i = 1000;i<=2000;i+=2){
                evens.add(i);
            }
            System.out.println("1000 - 2000 " + Duration.between(start,LocalTime.now()).getNano() + "ns\n" + evens);

        });


        Thread thread2 = new Thread( () -> {
            LocalTime start = LocalTime.now();
            ArrayList evens = new ArrayList<Integer>();
            for (Integer i = 14300;i<=17800;i+=2){
                evens.add(i);
            }
            System.out.println("14300 - 17800 " + Duration.between(start,LocalTime.now()).getNano() + "ns\n" + evens);
        });

        thread1.start();
        thread2.start();





    }
}
