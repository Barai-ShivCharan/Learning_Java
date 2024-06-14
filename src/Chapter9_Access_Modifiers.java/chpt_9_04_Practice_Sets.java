package Chapter9_Access_Modifiers.java;

class Cylinder{
    private int radius;
    private int height;

    // Constructors is Problem 3
    public Cylinder(int radius, int height) {// Here,we make Constructors with passing 2 parameters
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // Problem 2
 public double surfaceArea(){
        return 2*3.142*radius*radius+2*3.142*radius*height;
 }
    // Problem 2
    public double volume(){
        return 3.142*radius*radius*height;
    }
}
class Rectangle {
    private int length;
    private int breath;

    public Rectangle() {
        this.length = 4;
        this.breath = 5;
    }

    public Rectangle(int length, int breath) {
        this.length = 4;
        this.breath = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}
public class chpt_9_04_Practice_Sets {
    public static void main(String[] args) {

        Cylinder shiv=new Cylinder(9,12);//(problem 3) Here,we make Constructors with passing 2 parameters
        //Problem .1
       // shiv.setRadius(9);
        //shiv.setHeight(12);
        System.out.println(shiv.getRadius() );
        System.out.println(shiv.getHeight());
        // Problem.2
        //System.out.println(shiv.surfaceArea());
        //System.out.println(shiv.volume());
        Rectangle r=new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreath());
    }

}
