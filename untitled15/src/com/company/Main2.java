package com.company;

public class Main2 {

    public static void main(String[] args){
        int[] array = new int[] {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0;i<array.length;i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println("Main 2:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "-" + array[i]);
        }


    }
}
