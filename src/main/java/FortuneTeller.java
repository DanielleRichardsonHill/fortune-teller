import java.util.Arrays;
import java.util.Scanner;
public class FortuneTeller {
	
    public static void main(String[] args) {
        String birthMonth = null, location, amountOfMoney, newFortune, numberOfYears, transportation;
        int monthAttempt = 1;
        System.out.println("Welcome to my fortune booth! \n");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("What is your first name?");
            String firstName = input.next().toLowerCase();
            System.out.println("What is your last name?");
            String lastName = input.next().toLowerCase();
          
            String fullName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " "
                    + lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            System.out.println("What is your age?");
            int age = input.nextInt();
       
            if (age % 2 == 0) {
                numberOfYears = "five years";
            } else {
                numberOfYears = "twelve years";
            }
           
            while (monthAttempt > 0) {
                System.out.println("What is your birth month?");
                birthMonth = input.next();
                String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV",
                        "DEC" };
                if (birthMonth.length() < 3) {
                    birthMonth = birthMonth.toUpperCase();
                } else {
                    birthMonth = birthMonth.toUpperCase().substring(0, 3);
                }
                if (Arrays.asList(months).contains(birthMonth)) {
                    monthAttempt--;
                } else {
                    System.out.println("You entered an incorrect entry.");
                    System.out.println("The available options are " + Arrays.toString(months));
                    System.out.println("Please try again!");
                }
            }
            if (fullName.toUpperCase().contains(birthMonth.substring(0, 1))) {
                amountOfMoney = "250000";
            } else if (fullName.toUpperCase().contains(birthMonth.substring(1, 2))) {
                amountOfMoney = "500000";
            } else if (fullName.toUpperCase().contains(birthMonth.substring(2, 3))) {
                amountOfMoney = "750000";
            } else {
                amountOfMoney = "75";
            }
            System.out.println(
                    "What is your favorite ROYGBIV color? \n" + "Enter \"Help\" for a list of ROYGBIV colors.");
            String color = input.next().toUpperCase().substring(0, 1);
            
            if (color.equals("H")) {
                System.out.println(
                        "\n R = Red \n O = Orange \n Y = Yellow \n G = Green \n B = Blue \n I = Indigo \n V = Violet");
                System.out.println("Please choose a letter for your favorite color:");
                color = input.next();
            }
            switch (color) {
            case "R":
                transportation = "Car";
                break;
            case "O":
                transportation = "Train";
                break;
            case "Y":
                transportation = "Boat";
                break;
            case "G":
                transportation = "Ship";
                break;
            case "B":
                transportation = "Truck";
                break;
            case "I":
                transportation = "Dumptruck";
                break;
            case "V":
                transportation = "Tow Truck";
                break;
            default:
                transportation = "Bus";
                break;
            }
            System.out.println("How many siblings do you have?");
            int numberOfSiblings = input.nextInt();
            if (numberOfSiblings == 0) {
                location = "Kentucku";
            } else if (numberOfSiblings == 1) {
                location = "Ohio";
            } else if (numberOfSiblings == 2) {
                location = "Maine";
            } else if (numberOfSiblings == 3) {
                location = "Florida";
            } else {
                location = "Texas";
            }
            System.out.println(fullName + " will retire in " + numberOfYears + " with " + amountOfMoney
                    + " in the bank, a vacation home in " + location + " and a " + transportation + ".");
            System.out.println("Would you like to do another fortune? \n");
            newFortune = input.next().toUpperCase().substring(0, 1);
            if (newFortune.equals("N")) {
                System.out.println("Alright. Have a good day!");
            }
        } while (newFortune.equals("Y"));
        input.close();
    }
}
		
		  
 				
