package Chapter5_Loops.java;

public class chpt5_05_Practice {
    public static void main(String[] args) {
        //Problem1
//        int n=4;
//        for (int i=n;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//             }

        // Problem 2
//        int sum=0;
//        int n=4;
//        for(int i=0;i<n;i++){
//            sum=sum+(2*i);
//        }
//        System.out.print("Sum of even number is :");
//        System.out.println(sum);

        // Problem 3
//        int n=5;
////        for(int i=0;i<10;i++)--->Goes from i=1 to i=98
//        for(int i=0;i<10;i++){
//            System.out.printf("%d X %d=%d\n", n, i, n*i);
//        }

        // Problem 4
//        int n=10;
//        for (int i=10;i>1;i--){
//            System.out.printf("%d X %d=%d\n",n,i,n*i);
//        }
        // Problem 6
//        int n=5;
//        // n=n*n-1*n-2*...
//        int i=1;
//
//        int factorial=1;
//        while(i<=n){
//            factorial *=i;
//            i++;
//        }
//        System.out.println(factorial);

        // Problem 9
        int n=8;
        int sum=0;
       // for(int i=0;i<10;i++)--->Goes from i=1 to i=98
        for(int i=0;i<=10;i++){
          sum +=n*i;
        }
        System.out.println(sum);
    }
}
