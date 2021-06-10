package com.company;

import java.security.Timestamp;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Zad2 {
    public static void main(String[] args) {
        Random r = new Random();


        var ints = r.ints(10000, 0, 1000).toArray();


        Thread bubbleThread = new Thread(()->{
            int[] tmpArr = ints.clone();
            LocalTime start = LocalTime.now();
            bubbleSort(tmpArr);
            System.out.println("Bubble sort " + Duration.between(start,LocalTime.now()).getNano() + "ns");

        });
        Thread streamThread = new Thread(()->{
            Integer[] tmpArr = Arrays.stream(ints).boxed().toArray(Integer[]::new);
            Comparator<Integer> comparator = Comparator.comparingInt(Integer::intValue);

            LocalTime start = LocalTime.now();
            Arrays.sort(tmpArr,comparator);
            System.out.println("Comparator " + Duration.between(start,LocalTime.now()).getNano() + "ns");
        });


        bubbleThread.start();
        streamThread.start();



    }
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
