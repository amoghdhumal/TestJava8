package com.test.test;

public class BubbleSort {

    
    public static void main(String[] args) {
        System.out.println("Sort number using bubble sort");
        
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int temp = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]<arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }//end of if
            }//end of for
        }//end of for
            
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}
