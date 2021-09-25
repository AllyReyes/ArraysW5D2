package com.company;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        int largest;
        {
            //Write a program to sum all the values of a given Array in Java.
            //////////////
//        2.What is the output?
//        double[ ] exampleArray = {1,5,6,5,4,1};
//        double maximum = examplesArray[0];
//        int index = 0;
//        for (int i = 1; i<exampleArray.length>; i++){
//            if (exampleArray[ i ] > maximum) {
//                maximum = exampleArray[ i ];
//                index = i;
//            }}
//        System.out.println(index);


//     PART 1: nums in Array (5)
            int[] arr = new int[]{7, 3, 9, 1, 6};
            int sum = 0;
            int i;
            for (i = 0; i < arr.length; i++) ;
            sum += arr.length;
            System.out.println(sum);


            //Asks what is the output of this, cannot get it to run to find out
            double[] exampleArray = {1, 5, 6, 5, 4, 1};
            double maximum = exampleArray[0];
            int i;
            int index = 0;
            for (int = 1; i < exampleArray.length >; i++) {
                    if (exampleArray[i] > maximum) {
                        maximum = exampleArray[i];
                        index = i;
                    }
                }
            System.out.println(index);



            }
        }

    //Write a public static method called "toPower" that takes in as parameters
    //two integers called size and power. The method should return an array of size
    // "size" with each array index raised to the value of "power." So, for example,
    // if we passed in "size = 4" and "power = 2" to the "toPower," the method should
    // return the following result: [0,1,4,9].
    public static double[] toPower(int size, int power) {
        double [] force = new double[0];
//        int i;
        for(int i=0; i<size; i++){
            double [] valueOf;
            force [i] = Math.pow(valueOf[(4)], valueOf[(2)]);
        }
        return force;

        //Close? Maybe, but no cigar
    }

}