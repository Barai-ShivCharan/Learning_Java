package com.company;

import java.util.Scanner;
public class chpt1_06_Exercise {
    public static void main(String[] args) {
        /*

        Write a Program to Calculate the Percentage of given students in CBSE bord Exam.
        His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100)
       */

        System.out.println("Enter the Subjects of Marks Which is Obtained in CBSE Board Exam");
       // float English,Science,Math,Social,Nepali;
        System.out.println("Enter the Marks of English Subjects");
        Scanner sc1=new Scanner(System.in);
        float a=sc1.nextInt();
        System.out.println("Enter the Marks of Science Subjects");
        Scanner sc2=new Scanner(System.in);
        float b=sc1.nextInt();
        System.out.println("Enter the Marks of Social Subjects");
        Scanner sc3=new Scanner(System.in);
        float c=sc1.nextInt();
        System.out.println("Enter the Marks of Math Subjects");
        Scanner sc4=new Scanner(System.in);
        float d=sc1.nextInt();
        System.out.println("Enter the Marks of Nepali Subjects");
        Scanner sc5=new Scanner(System.in);
        float e=sc1.nextInt();
        float Percentage=((a+b+c+d+e)/500)*100;
//        System.out.println("You Score:");
//        System.out.println(Percentage);
        System.out.println("Your Precentage is:"+Percentage);


    }
}
