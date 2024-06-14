package Chapter_10_Inheritance.java;

class A{
    public int a;
    public int harry(){
        return 4;

    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
   }
//    public void meth2(int a){// Here,it doesnot override (u can see in class B of meth2 is not same)
//        System.out.println("I am method 2 of class A");
//    }
}
class B extends A{
    @Override// Here,it doesnot gives error(its saying that this methods(meth3) override (its not complesary to write)
                // and also it clear that this method is overriding
    public void meth2(){// Here,is method overriding (we only overridr the method when we make different class(we cannot
        //make in same class ). and also we cannot override the private ,static,final method and so   on
        System.out.println("I am method 2 of class B");

    }
    public void  meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class chpt_10_04_Methods_Overiding {
    public static void main(String[] args) {
        A a=new A();
         a.meth2();
        B b=new B();
        b.meth2();
    }

}
