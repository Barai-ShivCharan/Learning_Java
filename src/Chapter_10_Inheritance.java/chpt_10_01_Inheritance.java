package Chapter_10_Inheritance.java;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
       System.out.println("I am a Constructors");

    }
}
class Derived extends Base{// this is used for deriving all the content inside the Base class in derived class and (if we want to add new content in derived ,we csn add)
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class chpt_10_01_Inheritance {
    public static void main(String[] args) {
        /*
//        Base b=new Base();// It is the object of Base class,printing the value of x
       Derived b=new Derived();// It is the object of Derived class,printing the value of x(Specially,setX is in Base class but by Deriving it we can used)
        b.setX(45);
        System.out.println(b.getX());

         */
        // Creating an  object of Base class
        Base b=new Base();
        b.setX(4);
       // b.sety(4);// this gives an error because setY is Derived class which cannot base can access(Base cannot derived it)
        System.out.println(b.getX());

        // Creating an  object of Derived class
        Derived d=new Derived();
        d.setX(43);
        d.setY(56);// yes setY can derived (due to Derived contents setY so)
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
