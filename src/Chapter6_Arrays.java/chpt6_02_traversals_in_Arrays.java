package Chapter6_Arrays.java;

public class chpt6_02_traversals_in_Arrays {
    public static void main(String[] args) {
        //int [] marks={23,45,67,89,86};
        // float []marks={23.5f,45.8f,67.6f,89.3f,8.6f};
        //String [] students={"shiv","renu","rekha"};
        //System.out.println(marks[2]);
        //System.out.println(marks.length);
        //System.out.println(students[2]);

        int[] marks = {45, 67, 89, 32, 45};
//         Displaying using for loops---->this is called array traverasal
        for (int i = 0; i < 5; i++) {
//            System.out.println( marks[i]);

            // in Reverse order of arrays
//        System.out.println("In Reverse order!");
//            for (int i=marks.length-1;i>=0;i--){
//                System.out.println( marks[i]);

            // Using for-each
            System.out.println("Printing using for each loop");
            for (int element : marks) {
                System.out.println(element);

            }
        }
    }
}