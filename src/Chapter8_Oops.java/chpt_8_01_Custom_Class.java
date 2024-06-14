package Chapter8_Oops.java;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is :"+id);
        System.out.println("and my name is :"+name);
    }
    public int getSalary(){// Making function getsalary()
        return salary;
    }
}
public class chpt_8_01_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is custom Class");
        Employee1 harry=new Employee1();// instantiating a new object
        Employee1 Shiv=new Employee1();// instantiating a new object (New Employee like wise we add more Employee)
        //Setting  Attributes Harry
        harry.id=85;
        harry.salary=4500;
        harry.name="ShivCharan";

        //Setting  Attributes Shiv
        Shiv.id=74;
        Shiv.salary=60000;
        Shiv.name="ShivCharan Barai";

        // Printing attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);

        harry.printDetails();
        Shiv.printDetails();
        int salary=Shiv.getSalary();
        System.out.println("Salary is :"+salary);
    }
}
