package com.practice;

import java.util.Arrays;

public class array {

    public static void main(String args[]){

//        array initialization

        int[] a1 = new int[5];
        int[] a2 = {10,20,30,60};

//        check length

        System.out.println("Print the length: "+a1.length);

        System.out.println("Print the length: "+a2.length);

//        access element of the array

        System.out.println("Element of the array is: " +a2[2]);

//        iteration of the elements

        System.out.println("contains of a2 are: ");
        for (int i=0; i<a2.length; ++i){
            System.out.println(" "+a2[i]);
        }

        System.out.println("contains of a2 are: ");
        for (int item:a2){
            System.out.println(" "+item);
        }


        //modify element

        a2[2]=100;

        //sorting array

        Arrays.sort(a2);

    }


}
