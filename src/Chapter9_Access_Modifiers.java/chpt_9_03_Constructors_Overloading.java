package Chapter9_Access_Modifiers.java;
class MyMainEmployee1{
    private int id;
    private String name;

    public MyMainEmployee1() {// Here,We implement Constructors Overloading by using same function name but by passing different arguments
        id = 0;
        name = "Your-Name-Here";
    }
public MyMainEmployee1(String myName,int myId) {// Here,We implement Constructors Overloading by using same function name but by passing different arguments
        id = myId;
        name = myName;
        }
    public MyMainEmployee1(String myName) {// Here,We implement Constructors Overloading by using same function name but by passing different arguments
        id=1;
        name = myName;
    }


// here setter and getter are made

public String getName() {
        return name;
        }
public void setName(String n){
        this.name=n;
        }
public void setId(int i){
        this.id=i;
        }
public int getId(){
        return id;
        }
        }

public class chpt_9_03_Constructors_Overloading {
    public static void main(String[] args) {
        MyMainEmployee1 harry=new MyMainEmployee1();// here we make object at 1 time (if arguments then give  it no problems)
    }
}
