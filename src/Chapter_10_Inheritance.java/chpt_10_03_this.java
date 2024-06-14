package Chapter_10_Inheritance.java;
class Shiv{
    int a;

    public int getA() {
        return a;
    }

//    Shiv(int v){// Here we use this.a for reference,but if we does not used (this.)no problem in this expression,but
//        this.a=v;
//    }

    Shiv(int a){
        a=a;// here it confused in this condition we need to used this.a
    }
    public int returnone(){// this line you can delete whole set of returnone
        return 1;
    }
}
class Karan extends Shiv{
    Karan(int c){

        super(c);
        System.out.println("I am a constructors of karan class");
    }
}

public class chpt_10_03_this {
    public static void main(String[] args) {
        Shiv s=new Shiv(4);
        Karan k=new Karan(65);
       System.out.println(s.getA());//output 4

    }
}
