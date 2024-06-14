package Chapter7_Methods.java;
public class chpt7_04_varargs {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }


    //---------**** Instead of Doing above function declaration we have a technique which is called vararg

//    static int sum(int ...arr){
    static int sum(int x,int ...arr){// if we want to print one arguments then we use int x(now 1 arguments is compleasary)
//      Available as  int []arr;//---->for integer array
        int result=x;
        for(int a:arr){// here arr(array)
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        //System.out.println("The sum 0f 4 and 5 is:"+sum());// it gives nothing 0
        System.out.println("The sum 0f 4 and 5 is:"+sum(1)); // here one arguments is complesary
        System.out.println("The sum 0f 4 ,6 and 5 is:"+ sum(4,6,5));
        System.out.println("The sum 0f 4 ,6 and 5,9 is:"+ sum(4,6,5,9));
    }
}
