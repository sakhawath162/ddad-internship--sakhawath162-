package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;
	    int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n>1 && n<20){
            System.out.print(a + " " + b);
            for(int i=2;i<n;i++){
                sum = a + b;
                System.out.print(" " + sum);
                a = b;
                b = sum;
            }
        }else{
            System.out.println("Please enter an input between 1 to 20");
        }
    }
}
