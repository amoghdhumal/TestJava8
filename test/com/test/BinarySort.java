package com.test;


public class BinarySort {
    public static void main(String[] args) {
        System.out.println("Sort number using binary sort");

        int array[] = { 10, 20, 25, 57, 63, 96, 5 };
        int size = array.length;
        int low = 0;
        int high = size - 1;
        int value = 5;
        int mid = 0;
        mid = low + (high - low) / 2;

        while (low <= high) {
            if (array[mid] == value) {
                System.out.println(mid);
                break;
            } else if (array[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;

            mid = (low + high) / 2;
        }

    }
}
