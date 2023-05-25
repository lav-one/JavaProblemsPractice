package com.Test.Strings;

import java.util.Scanner;

public class EachWordReverseInASentence {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(String.valueOf(reverseEachWord(input)));
    }

    public static StringBuilder reverseEachWord(String input){
        String[] arrayOfWords = input.split(" ");
        StringBuilder reverseEachWord= new StringBuilder(input.length());
        for(int i=0;i<arrayOfWords.length;i++){
            for(int j=arrayOfWords[i].length()-1;j>=0;j--){
                reverseEachWord.append(arrayOfWords[i].charAt(j));
            }
            if(i!=arrayOfWords.length-1)
            reverseEachWord.append(" ");
        }
        return  reverseEachWord;
    }
}
