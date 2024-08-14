package com.tutorials.coreJava.codeSignal.programs;

import java.util.Arrays;
import java.util.OptionalInt;

public class AdjacentProductArray {

    public static void main(String []args){

        int[] initialAry = new int[]{2,3,4,5,6,7}; //print the index of elements whoose proudct is the max value
       int length = initialAry.length;
        int[] multiplyAry = new int[length-1];
        for(int i=0;i<multiplyAry.length;i++){
            multiplyAry[i] = initialAry[i]*initialAry[i+1];
        }
        for(int i :multiplyAry) {
            System.out.println("printing multiplyArray ::" + i);
        }
       //using streams
        OptionalInt max = Arrays.stream(multiplyAry).max();
        System.out.println("Max product value of given array is :: " +max.toString());

        //another way of using loop
        int maxProduct = multiplyAry[0];
        for(int Product :multiplyAry){
            if(maxProduct<Product){
                maxProduct = Product;
            }
        }
        System.out.println("Max product value of given array from loop logic is :: " +maxProduct);

        //find min value of product
        int minProduct = multiplyAry[0];
        for(int Product :multiplyAry){
            if(minProduct>Product){
                minProduct = Product;
            }
        }
        System.out.println("Min product value of given array from loop logic is :: " +minProduct);
    }
}
