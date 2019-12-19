package com.test.test;

public class NumberPalindrome {

    public static void main(String[] args) {
        int number=1211;
        int temp=0;
        int mod =number;
        int sum = 0;
        while(number>0) {
        temp = number%10;
        sum = (sum*10)+temp;
        number =number/10;
        }
        
        if(sum==mod)
        System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
    }
}
