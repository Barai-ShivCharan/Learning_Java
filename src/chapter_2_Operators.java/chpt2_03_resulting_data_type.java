package chapter_2_Operators.java;

public class chpt2_03_resulting_data_type {
    public static void main(String[] args) {
       /* byte x=5;
        int y=6;
        short z=8;
        int a =y +z;
        float b=6.5f +x;
        System.out.println(b);

        */

       //     Increment & Decrement Operators


        int i=56;
        // int b=i++;//First b is assigned i (56) then i is increment
        int j=67;
        int c=++j;//first j is incremented then c is assigned j(68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int y=7;
        System.out.println(++y *8);
        char ch='a';
        System.out.println(++ch);



    }
}
