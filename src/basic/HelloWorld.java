package basic;
import java.util.Scanner;


/*
* Learn the first building block of a java program
*
* This is just a random test principle file
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
        for (int i = 0; i <= 10; i++) {
            System.out.println("+-------+-----+");
            System.out.println("+-------+-----+");
        }

        // Nested loops
        for ( int i = 0; i < 4; i ++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Using user input in loop
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");
        String name = input.next();
        while(name.equals("John")){
            System.out.println("Its nice to meet you: " + name );
            name = input.next();
        }
        System.out.println("Thank you, comeback soon");

        }

}


