package Chapter9_Access_Modifiers.java;

class MyMainEmployee{
private int id;
private String name;
/*
public MyMainEmployee(){ // this is Constructors,we initalized the object with fuction(while making constructors)
                         //----->Instead of doing this we use constructors(see below)
                         // We have to make same name of constructors as same as class
    id=45;
    name="Your-Name-Here";
}
 */

//public MyMainEmployee(String myName) {// Here, We Show Constructors can be many form and also can get parameters
//    id = 45;
//    name = myName;
//
//}
public MyMainEmployee(String myName,int myId) {// Here, We Show Constructors can be many form and also can get parameters(in this we take 2 parameters)
    id = myId;
    name = myName;

}
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

public class chpt_9_02_Constructors {
    public static void main(String[] args) {
      /*
        MyMainEmployee harry=new MyMainEmployee(myName:"ramu");// taking 1 parameters from constructors
        MyMainEmployee harry=new MyMainEmployee(myName:"ramu",myId:89);// taking 2 parameters from constructors
        // Here,We use parameters dut to we give above constructors parameters myName
         //MyMainEmployee harry=new MyMainEmployee();// making object of MyMainEmployee class
       // harry.setId(63);//----->Instead of doing this we use constructors
        //harry.setName("shyam");//----->Instead of doing this we use constructors
        System.out.println(harry.getId());
        System.out.println(harry.getName());

       */


    }
}

