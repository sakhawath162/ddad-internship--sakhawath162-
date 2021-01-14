package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int flag = 0;
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        if(s.length()%2==0){
            flag++;
        }else{
            flag--;
        }
        String rev = revString(s);
        if(s.equals(rev) && flag>0){
            System.out.println("Even Palindrome");
        } else if(s.equals(rev) && flag<0){
            System.out.println("Odd Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    public static String revString(String s){
        if(s.length()<=1){
            return s;
        }else{
            return revString(s.substring(1))+ s.charAt(0);
        }
    }
}
