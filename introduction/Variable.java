// Before you write the variable name, you need to write the type of the variable.
// In our case age is a number and it's data type is an integer (int)

public class Variable {
    public static void main(String[] args) {
        int age = 20;
        System.out.println("My age is " + age);
    }
}

//THINGS TO NOTE
/**
 * You can ASSIGN a variable twice, but you cannot DECLARE it twice
 * You cannot print variable that you only decalre and not assigned
 * Code inside the curly brace is known as a block
 * Since the main method is inside the VARIABLE class, any variable  declared in the main method is known as a local variable [which means it is only available inside the main method]
 * Variables outside the main method are known as global variables, but to use the variable we have to declare it as static 
 * static methods can only work with static variables
 * DEMO:
 * */

public class Variable2 {
       static int age ;
    public static void main(String[] args) {
        System.out.println("My age is " + age);
    }
}


/**
 * Whenever you declare a variable n the class level without assigning it a value, it will be assigned a default value of 0 [for numbers]
 * */

public class Variable2 {
       static int age ;
    public static void main(String[] args) {
        int age = 27;
        System.out.println("My age is " + age);
    }
}
//The value of age is 27, because the initial declaration of age was not used in the main method, [Making it A GLOBAL VARIABLE]
//DO NOT redeclare the variable in the same code block

//A variable name cannot start with number or have space between them