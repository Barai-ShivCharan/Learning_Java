package Chapter7_Methods.java;

public class chpt7_01_Methods {

  static int logic(int x,int y){//------> Here ,if we use static methods,we declar below c=logic(a,b) which is declared
    //below c1=(a1,b1)


    //int logic(int x,int y){//Here, if we did not used static ,then we declare object in main function which
       // is declared below
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
                            //        x=56; we are se only that it can change are noybut it didnot change

        return z;
    }
    public static void main(String[] args) {
                               int a=5;
                               int b=7;
                               int c;
                             c=logic(a,b);//---->it is used only when static methods is used in class(as above written in comment)

        //chpt7_01_Methods obj=new chpt7_01_Methods();
        //c=obj.logic(a,b);//Here,we are making object because of we did not used static methods as u can see above


                                int a1=2;
                               int b1=1;
                               int c1;
      c1=logic(a1,b1);//---->it is used only when static methods is used in class(as above written in comment)
        //c1=obj.logic(a1,b1);//Here,we are making object because of we did not used static methods as u can see above

        System.out.println(c);
        System.out.println(c1);


    }
}
