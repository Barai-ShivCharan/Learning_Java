package Chapter6_Arrays.java;

public class chpt6_03_Multiple_dim {
    public static void main(String[] args) {
        //int[] marks;// A 1=D Array
        int[][] flats; //A 2-D Array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        //Displaying 2-D Arrays(for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i = 0; i< flats.length; i++) {
            for (int j = 0; j < flats.length; j++) {// here we have to use for loops as based on how many Dimensional we use,
               // (here,we use 2-D arrays so,we use for loops only 2 times)
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }

            System.out.println("");

        }
    }
}