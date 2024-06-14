package com.company;

import java.util.Scanner;
public class chpt1_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc=new Scanner(System.in);// sc object  initalize and also((System.in) means we are taking input from the keyboard)

        /*
        System.out.println("Enter num1");
        //int a=sc.nextInt();
        float a=sc.nextFloat();
        System.out.println("Enter num2");
//        int b=sc.nextInt();
        float b=sc.nextFloat();
//        int sum =a+b;
        float sum=a+b;
        System.out.println("The sum these number is:");
        System.out.println(sum);
         */

//        boolean b1=sc.hasNextInt();// Here, To check whether the user input is integer are not so, this method is used
//        System.out.println(b1);

        //String str =sc.next();// ------> To print string only like(harry) but not print(harry is good boy),instead it
         //only print harry

        String str=sc.nextLine();// It print whole sentence like(  harry is a good boy)like  that and so on
        System.out.println(str);

    }
}
