package notes;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class NoteAbstract {
    /*
    abstract: abstract cannot be instantiated. Animal can be made abstract because it cannot have an object
    animal. but you can make the subclass an object, this is called concrete class.
    to make a class abstract, simply put "abstract" before the class
    * abstract class has no use unless extended

    * methods can also be abstract; class: class must be extended || abstract methods: methods must be overridden
    * abstract does not have a body: no {}

    * if abstract method is declared, CLASS MUST BE MADE ABSTRACT. you CANNOT have an abstract method in
    a non-abstract class.
    ABSTRACT METHOD = ABSTRACT CLASS
    abstract and non-abstract method can be missed in abstract class

    *subclass which is concrete MUST implement abstract class
    * cannot make an object of abstract class BUT you can make an Array of abstract class because
     its only holding value

     *EVERY CLASS extend OBJECT: you just can't see it because its default; meaning all class by default extends object
     unless you make it extend another class but by default, all class created extends object
     *

      */
    public static void main(String[] args) {
        // another way to create an if statement
        int age = 15;
        String message = age >= 18 ? "i am happy" : "what is this";
        System.out.println(message);

    }

    static {
        //static bloc
    }



}
/*

 */