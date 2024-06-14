package Chapter_10_Inheritance.java;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 Am");
    }

//    public void greet(){
//        System.out.println("Good Morning");
//    }
    public void on(){
        System.out.println("Turning on Ringing Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
       System.out.println("Playing music...");
    }


//    public void swagat(){
//        System.out.println("Aaka Swagat hai");
//    }
    public void on(){
        System.out.println("Turning on Ringing SmartPhone");
    }
}
public class chpt_10_05_Dyanmic_Dispach {
    public static void main(String[] args) {
//        Phone obj =new Phone();
//        SmartPhone smobj=new SmartPhone();
//        obj.name();


        // Here,it is possible ---> super class ka reference=object ka (subclass)
        //Here,it not possible--->subclass ka reference=super class
// Onject is made at Run time(when written new means that run time)
        Phone obj =  new SmartPhone();// here,reference from suoerclass(Phone) and obj of Smartphoneit possible
        //SmartPhone obj2=new Phone();// Here, it not popssible,(Nokia1100 ko samrtphone too nihe boolshkat ho na)
        //obj.greet();
        obj.showTime();
    obj.on();// This is called Dyanmic Dispatch Method//(it doesnot run the refernce(Phone),it run object(i.e SmatPhone)
        //obj.music();Not Allowed
    }
}
