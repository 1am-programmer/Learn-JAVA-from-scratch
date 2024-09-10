// A class is a collection of related code in java
// The program starts with a class declaration
// In every java source file, you can have only one third level public class and that class must match the name of the file
// In my case my file name is Main.java, so my class name is Main
//If you have multiple classes, the jvm will select the class with the file name as the entry point

//The main method is the entry point to the program i.e main(...)
/**
 * The jvm is programmed in a way that is looks for:-
 * The class with the file name as the entry point
 * A static method that is named main: main (...)
 * Has public access : public
 * And array is string : string[] as a parameter
 * And doesnt return any value : void
 * so it must be this :   public static void main(String[] args) {}
 * the only thing you can change is the args array to somthing else in my case argument
 * 
 * 
 * The array holds the command line arguments passed to the program upon execution
 * The System.out.println method, prints out anything you to pass to it as an argument
 * Semi colons are mandatory in java, if you fail to put it, the program will not compile
*/

 public class Main {
  public static void main(String[] argument) {
    System.out.println("Hello world!");
  }
 }