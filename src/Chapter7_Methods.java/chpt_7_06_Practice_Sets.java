package Chapter7_Methods.java;

public class chpt_7_06_Practice_Sets {
    /* Problem 1
    static void multiplication(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.format("%d X %d=%d\n", n, i, n * i);
        }
    }
     */
/* Problem 2
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 */
    /*---Problem3
 static int sumRect(int n){
     if(n==1){
         return 1;
     }
     return n+sumRect(n-1);
 }
     */
/*
    static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        else if{
            if (n == 2) {
                return 2;
          }
            else {
                return fib(n - 1) + fib(n - 2);
            }
        }
    }
 */

    static void pattern1_rec(int n) {
        if(n>0){
            for (int i=0;i<n+1;i++){
                System.out.print("*");
            }
        }
    }
    public static void main (String[]args){
                //--> Problem.1 multiplication(5);

                //---->Problem2 pattern1(4);

                //---Problem3 int c=sumRect(3);
                //---Problem3System.out.println(c);

                //--Problem4  nt result = fib(5);
                //--Problem4  System.out.println(result);

            }
        }
