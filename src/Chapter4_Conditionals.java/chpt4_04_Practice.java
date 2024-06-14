package Chapter4_Conditionals.java;
import java.util.Scanner;
public class chpt4_04_Practice {
    public static void main(String[] args) {
        // Problem 1
//        int a=10;
//        if(a=11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");


       //Question 2
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1=sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2=sc.nextByte();
        System.out.println("Enter your marks in MAthematics");
        m3=sc.nextByte();

        float avg=(m1+m2+m3)/3.0f;
        System.out.println("Overall percentage is: "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congrulattions,You are Passed!:");
        }
        else {
            System.out.println("You are failed,try next year" );
        }



//        Question 3
//
//        float  tax=0;
//        float income=3.3f;
//        if(tax<2.5f){
//            tax=tax+0;
//
//        }
//        else if(tax>2.5f && tax<5.0f){
//            tax=tax+0.
//        }


        /*//Question 4
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your day");
        int day=sc.nextInt();
//        int day=2;

        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("saturday");
            case 7-> System.out.println("Sunday");
        }

         */
         //Question 6
        Scanner sc0=new Scanner(System.in);
        String website=sc0.next();
        if(website.endsWith(".com")){
            System.out.println("This is an Commerical Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an Organisational Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("this is an indian website");
        }




    }
}
