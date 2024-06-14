package Chapter5_Loops.java;

public class chpt5_04_break_continue_statments {
    public static void main(String[] args) {
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            if (i == 2) {
//                System.out.println("Ending of loop");
//                break;
//            }
        for (int i = 0; i < 5; i++) {

            if (i == 2) {
//                System.out.println("Ending of loop");
                continue;
            }
           System.out.println(i);
        }

    }
}