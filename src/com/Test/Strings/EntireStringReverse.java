package com.Test.Strings;

import java.util.Scanner;

public class EntireStringReverse{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to Reverse");
        String word = scanner.nextLine();
        scanner.close();
        String reverse_word = String.valueOf(stringReverse(word));
        System.out.println(reverse_word);
    }

    public static StringBuilder stringReverse(String input){
        StringBuilder reverseword = new StringBuilder();
       for(int i=input.length()-1;i>=0;i--){
           reverseword.append( input.charAt(i));
       }
       return reverseword;
    }
}
