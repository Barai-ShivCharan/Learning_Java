package Exercise.java;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);


    }

    void takeUserInput() {
        System.out.println("Guess the Number");
     Scanner sc = new Scanner(System.in);
        inputNumber=sc.nextInt();

    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if(inputNumber==number) {
            System.out.format("Tes you guessed it right,it was %d\n you guessed it in %d attempts",number);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;

    }

}
public class Exercise_3 {
    public static void main(String[] args) {
        /*
        Create a class Game,Which allows a user to play "Guess the Number"
        game once.Game should have the following Method:-
        1.Constructor to generate the random Number
        2.takeUserInput()to take user input of number
        3.isCorrectNumber() to detect whether the number entered by the user is true
        4.getter and setter for noOfGuesses
           Use these properties such as noOfGuess(int) , etc to get this task done!
         */
        Game g=new Game();
        boolean b=false ;
        while (!b) {
            g.takeUserInput();
            b= g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
