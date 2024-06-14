package Chapter_10_Inheritance.java;
class Base1 {
    public int x;

    Base1() {
        System.out.println("I am a Constructors!");
    }

    Base1(int x) {// Here,super is used for calling the Base1 class arguments(super is calling constructors of arguments in Base1 class
        System.out.println("I am a overloaded constructors Constructors!,with value of x as:" + x);
    }

    class Shiv extends Base1 {
        Shiv() {
            super(0);// Here,super is used for calling the Base1 class arguments(super is calling constructors of arguments in
            // Base1 class).if is Did notUsed super then C(printing) constructors of no arguments
            System.out.println("I am Derived class Constructors!");// here,First run the Base1 class then run Derived1
        }

        Shiv(int x, int y) {
            super(x);// it is calling Base1 class with arguments wala
            System.out.println("I am a overloaded constructors of Derived ,with value of  y as:" + y);
        }

    }
        /*
            class ChildOfDerived extends Base1 {
                ChildOfDerived() {
                    System.out.println("I am a child of Derived Constructors!");
                }
                ChildOfDerived(int x,int y,int z) {
                    super(x,y);
                    System.out.println("I am a overloaded constructors of Derived ,with value of z as:" + z);
                }
            }
        }
            public class chpt_10_02_Constructors_Inheritance {
                public static void main(String[] args) {
                    Base1 b = new Base1();
                   // Derived1 d = new Derived1();// here,First run the Base1 class then run Derived1
                     Derived1 d= new Derived1(4,5);// it will se in Derived1 class constructors with arguments,and if no arguments is passed then by default print takes no argumnets in Derives1 class
                   ChildOfDerived cd=new ChildOfDerived();
         */
        public class chpt_10_02_Constructors_Inheritance {
            public void main(String[] args) {
                Base1 b = new Base1(5);
                Shiv d = new Shiv();


            }
        }


    }