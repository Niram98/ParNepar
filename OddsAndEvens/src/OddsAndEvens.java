import java.util.*;

public class OddsAndEvens {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();
        String odds = "O";
        String evens = "E";
        while (!choice.equals(odds) && !choice.equals(evens)) {
            System.out.print("PLease type only \"O\" for odds or \"E\" for evens. ");
            choice = input.next();
        }
        if (choice.equals(odds)) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        while (fingers > 5 || fingers < 0) {
            System.out.print("Please choose numbers from 0 to 5. ");
            fingers = input.nextInt();
        }
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("-------------------------------------");
        System.out.println("");

        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println(sum + " is ...even!");
            if (choice.equals(evens)) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("that means the computer wins! :(");
            }
        } else {
            System.out.println(sum + " is ...odd!");
            if (choice.equals(odds)) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("that means the computer wins! :(");
            }
        }
        System.out.println("-------------------------------------");

    }
}
