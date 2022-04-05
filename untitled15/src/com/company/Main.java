package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[25];
        Random rnd = new Random();

        for (int i = 0;i<array.length;i++){
            array[i] = rnd.nextInt(26);
            System.out.println(array[i] + " ");
        }

        //max
        int max = array[0];
        for (int i = 0;i< array.length;i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Max is: " + max);

        //min
        int min = array[0];
        for (int i = 0;i< array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Min is: " + min);
    }
}
