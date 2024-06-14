package Chapter6_Arrays.java;

public class chpt6_01_Arrays {
    public static void main(String[] args) {
        /*

       Classroom of 500 students -You have to store marks of these 500 students ,you have 2 options:
       1.Create 500 variables
       2.Use a  arrays (recommended)
           */


        // There are three main ways to create an array in java
        //1.Declaration and Memory declaration
//        int [] marks=new int [5];

        //2.Declaration and then memory allocation
//        int [] marks;
//        marks=new  int[5];
//       initialization
//        marks[0]=100;
//        marks[1]=56;
//        marks[2]=45;
//        marks[3]=89;
//        marks[4]=90;
//        marks[5]=46;// Here out of index so throws an error
//        System.out.println(marks[3]);



//3.Declaration , memory allocation and Initialization together
        int []marks={45,67,89,34,56};
        System.out.println(marks[3]);


    }
}
