package moduleProjects;
import java.util.Random;
import java.util.Scanner;


public class OddsOrEvens {
    public static void main(String[] args){
        GamePlay();


    }

    private static void GamePlay(){
        System.out.println("Let's play a game called \"Odds and Evens\" ");

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = input.nextLine();
        System.out.print("Hi " + name + " which do you choose? (O)dds or (E)vens?");
        String choice = input.next();

        // A switch case would be more efficient.
        if(choice.equals("Odds") || choice.equals("O")) {
            System.out.println(name + " has picked " + choice + "! The computer will be evens");
        } else if (choice.equals("Evens") || choice.equals("E")){
            System.out.println(name + " has picked " + choice + "! The computer will be odds");
        } else {
            System.out.println(name + " has picked " + choice + " wrong input.");
        }
        // A switch case would be more efficient.

        System.out.println("--------------------------------------------------------------");

        System.out.print("How many \"fingers\" do you put out?: ");
        Integer finger =input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers.\"");
        System.out.println("--------------------------------------------------------------");

        int total = finger + computer;
        boolean oddoreven = total % 2 == 0;

        if (oddoreven) {
            System.out.print("It is even ");
            if (choice.equals("Evens") || choice.equals("E")) {
                System.out.println(name + " wins");
            } else {
                System.out.println("computer wins");
            }
        } else {
            System.out.print("It is odd ");
            if (choice.equals("Odds") || choice.equals("O")) {
                System.out.println(" Computer wins");
            } else {
                System.out.println(name + " wins");
            }
        }
        System.out.println("--------------------------------------------------------------");
    }
}
