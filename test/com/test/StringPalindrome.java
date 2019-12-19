package com.test;

public class StringPalindrome {

    public static void main(String[] args) {
        String str="ababa";
        char ch;
        int i =0;int j=str.length()-1;
        Boolean flagTest =true;
        while(i<j) {
        if(str.charAt(i)!=str.charAt(j))
            flagTest=false;
            i++;
            j--;
        
        }
        System.out.println("Correct value of flag test"+flagTest);
    }
}
