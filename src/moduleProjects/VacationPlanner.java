package moduleProjects;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class VacationPlanner {

    public static void main(String[] args) {
        Greetings();
        TravelTimeBudget();
        timeDifference();
        landArea();
    }

    private static void Greetings(){
        System.out.println((1 + 3 /2-7%3));
        System.out.println("Welcome to Vacation Planner\n");
        Scanner welcome = new Scanner(System.in);
        System.out.println("\nWhat is your name?: \n");
        String name = welcome.nextLine();
        System.out.println("Nice to meet you " + name + ", where are you travelling to?: ");
        String city = welcome.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");
        System.out.println("***********************************");
    }

    private static void  TravelTimeBudget() {
        System.out.println("How many days are you going to spend travelling?: ");
        Scanner budget = new Scanner(System.in);
        Integer days = budget.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip?: ");
        Integer proposedExpense = budget.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?: ");
        String countryCode = budget.next();
        System.out.println("How many " + countryCode + " are there in 1 USD?: ");
        float exchangeRate = budget.nextFloat();


        // Convert from USD to the countryCode
        float convertBudget = proposedExpense * exchangeRate;
        // convert Days to hours/minutes
        int hours = days * 24;
        int minutes = hours * 60;
        float expensePerDay = proposedExpense / days;

        System.out.println("\nIf you are travelling for " + days + " days" +
                                    " that is the same as " + hours + "hours or " + minutes + "minutes" );
        System.out.println("If you are going to spend $" + proposedExpense +
        " USD that means per day you can spend up to $" + expensePerDay + " USD");

        System.out.println("Your total budget in " + countryCode + " is " + convertBudget + countryCode);

        System.out.println("***********************************");
    }

    private static void  timeDifference() {
        System.out.println("What is the time difference, in hours, between your home and your destination?: ");
        Scanner timeInput = new Scanner(System.in);
        Integer timeDiff = timeInput.nextInt();
        System.out.println("That means when its noon at home its  " + (12%24 + timeDiff)
                        + " in your travel destination and when its midnight it will be " + (24%12 + timeDiff));

        System.out.println("***********************************");
    }


    private static void landArea(){
        System.out.println("What is the square area of your destination in KM? ");
        Scanner squareArea = new Scanner(System.in);
        int input = squareArea.nextInt();
        System.out.println("In miles that is " + input * 0.62137);
        System.out.println("***********************************");

    }

}
