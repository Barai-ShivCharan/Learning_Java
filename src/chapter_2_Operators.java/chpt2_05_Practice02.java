package chapter_2_Operators.java;

public class chpt2_05_Practice02 {
    public static void main(String[] args) {
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);

        //Decrypting the grade
        grade =(char) (grade-8);
        System.out.println(grade);

    }
}
