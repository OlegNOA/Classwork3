package com.company;

public class Main3 {

    public static void main(String[] args){
        int[] array = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0;i<array.length;i++) {

            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println("Main 3: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "-" + array[i]);
        }
    }
}

