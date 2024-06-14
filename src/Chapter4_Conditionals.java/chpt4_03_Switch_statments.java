package Chapter4_Conditionals.java;
import javax.swing.*;
import java.util.Scanner;
public class chpt4_03_Switch_statments {
    public static void main(String[] args) {
        /*
        System.out.println("Enter the Age");
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();

        if(age>56){
            System.out.println("You are Experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-Experienced");
        }
        else {
            System.out.println("You are not Experienced!");
        }

         */


        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to become an Adult");
            case 23 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are going retired");
            default -> System.out.println("Enjoy your life");
        }
                System.out.println("Thanks for using my java code");











    }
}
