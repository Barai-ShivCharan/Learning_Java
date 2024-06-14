package Chapter7_Methods.java;

public class chpt7_03_Methods_Overloading {

//   static void change(int a){ //-------> Case:.1 It used to try change value of integer are not
    //which does not change the value(below given)
//         a=90;
//    }

    //static void change2(int [] arr){ Case:.2// here,marks give reference to the arr so, it will change
        // arr[0]=98;
    //}

    // Functions for Method overloading start from here
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " +  a +" Bro!");
    }
    static  void foo(int a,int b){
        System.out.println("Good Aftetrnoon "+a+" Dost!");
        System.out.println("Good Nightnoon "+b+" Hancy!");
    }
    //**  static  void foo(int a,int b){//---> by Changing return type(like int void, float...)we cannot
        // do function overloading ,We only do function overloading by changing the parameters(like,(inta,int b,int c)
        //this is valid function (then in this condtion no problem in change of return type int ,float..)
        //System.out.println("Good Aftetrnoon "+a+" Dost!");
        //System.out.println("Good Nightnoon "+b+" Hancy!");


    public static void main(String[] args) {

        // Case:.1 Changing the Intger
        // int x=45;
        //change(x);
        //System.out.println("The value of X after running change is :"+x);

        // Case:.2 Changing the Array

        //int [] marks={34,56,78,99,6,54};
        //change2(marks);Case:.2//here,it will change because of reference from marks to arr(in 98)
        //System.out.println("The value of X after running change is :"+marks[0]);


     //  Methods Overloading
        foo();
        foo(300);
        foo(500,633);// Arguments are actual Value!



    }
}
