package basic;
import java.util.Scanner;


/*
* Learn the first building block of a java program
 */
public class HelloWorld {
    public static void main(String[] args) {
        FirstMethod();
        LearnScanner();
        learnControlStructure();

    }

    private static void FirstMethod(){
        //int sum = 123 + 10;
        System.out.println("The very first line\n Expecting Hello World :-).");
        //System.out.print(sum);

    }

    private static void LearnScanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome");
        System.out.println("What is your name: ");
        String name = input.nextLine(); // Waits for user's response allows space
        System.out.println("Hello " + name );
    }

    private static void learnControlStructure(){

    }
}


