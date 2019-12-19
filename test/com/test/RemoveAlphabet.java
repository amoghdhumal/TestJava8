package com.test;

public class RemoveAlphabet{    
    public int sumDigits(String str) {
        return str.chars().mapToObj(i -> (char) i).filter(Character::isDigit)
           .mapToInt(Character::getNumericValue).sum();
    }
    
    
    
    public int sumOfDigits(String stng) 
    {
      int l = stng.length();
      int sum = 0;
      for (int i = 0; i < l; i++) 
      {
        if (Character.isAlphabetic(stng.charAt(i))) 
        {
          
            stng.replace(stng.charAt(i),stng.charAt(stng.charAt(i-1)));
          String tmp = stng.substring(i,i+1);
          sum += Integer.parseInt(tmp);
        }
      }
      return sum;
    }
    
    public static void main(String[] args) {
        CheckDigit m= new CheckDigit();
        String str1 =  "1A 11";
       
        System.out.println("The given string is: "+str1);
        System.out.println("The sum of the digits in the string is: "+m.sumOfDigits(str1));
        
       
    }
}
