package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n<10 && n>0){
            System.out.println(factorial(n));
        }else{
            System.out.println("Please enter an input between 0 to 10");
        }

    }

    public static int factorial(int n){
        if(n==1){
            return n;
        }else{
            return n* factorial(n-1);
        }
    }
}
