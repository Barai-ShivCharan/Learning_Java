package Chapter_3_Strings.java;

import java.util.Locale;

public class chpt3_02_Strings_Methods {
    public static void main(String[] args) {
        String name="Harry";
       // System.out.println(name);

  //        *********Following are the Strings Methods************

        // Number.1 name.length()

//        int value=name.length();
//        System.out.println(value);

        // Number.2 name.ToLower()

//        String lstring=name.toLowerCase();
//        System.out.println(lstring);


        // Number.3 name.toUpperCase()
//        String ustring=name.toUpperCase();
//        System.out.println(ustring);

        // Number.4 nonTrimmedString()
//        String nonTrimmedString="   Harry   ";
//        System.out.println(nonTrimmedString);

        // Number.4 nonTrimmedString()
//        String trimmedString;
//        System.out.println(nonTrimmedString.trim());

        // Number.5 substring(int start)
        //System.out.println(name.substring(3));//From Given index(3) upto last index


        // Number.6 substring(int start.int end)  (Note-->Index start from 0)
//        System.out.println(name.substring(2,4));//From Given index(3) upto last index


         // Number.7  name.replace('r','p')
//        System.out.println(name.replace('r','p'));
//        System.out.println(name.replace("rry","ier"));//Different from above


        //Number.8  startsWith("ha")
        //System.out.println(name.startsWith("Ha"));// is start with are not gives true & false
        //System.out.println(name.endsWith("ry"));

        // Number.10  charAt(2)
        //System.out.println(name.charAt(2));//What is the character at index 2?

        // Number.11 indexOf()
        //System.out.println(name.indexOf("ry"));
        //String modifiedName="Harryrry";
        //System.out.println(modifiedName.indexOf("rry",4));
        //System.out.println(modifiedName.lastIndexOf("rry"));

        //System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase(" HaRrY"));

        System.out.println("\"I am escape sequence\", double quote");






    }
}
