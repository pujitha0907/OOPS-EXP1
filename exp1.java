Exercise 1 - Usage of Control Statements for Logical Building


##Cinema Ticket

package git;
import java.util.Scanner;
public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basePrice = 200;
        double finalPrice = basePrice;
        System.out.println("URK24CS6006 PUJITHA");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter day of booking (Mon/Tue/...): ");
        String day = sc.nextLine().trim();
        if (age < 5) {
            finalPrice = 0;
        } else if (age <= 18) {
            finalPrice *= 0.6; 
        } else if (age > 60) {
            finalPrice *= 0.7; 
        }
        if (day.equalsIgnoreCase("Mon") || day.equalsIgnoreCase("Tue") ||
            day.equalsIgnoreCase("Wed") || day.equalsIgnoreCase("Thu") ||
            day.equalsIgnoreCase("Fri")) {
            finalPrice *= 0.9; 
        }
        System.out.println("Ticket price: ₹" + finalPrice);
    }
}


#ElectricityUsage
 
package git;
import java.util.Scanner;
public class ElectricityUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.print("Enter units for month " + i + ": ");
            int units = sc.nextInt();
            total = total + units;
        }
        double average = total / 12.0;
        System.out.println("Total Units: " + total);
        System.out.println("Average: " + average);
        if (average > 500) {
            System.out.println("High Consumption Alert!");
        }
        System.out.println("URK24CS6006 PUJITHA");
    }
}


#ATM SYSTEM

package git;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice;
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Balance: ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                int amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Amount deposited.");
            } else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                int amount = sc.nextInt();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Not enough balance!");
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}


#GuessGame

package git;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Guess a number between 1 and 100:");
        while (guess != number) {
            System.out.print("Enter your guess: ");
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
                if (guess < number) {
                    System.out.println("Too Low!");
                } else if (guess > number) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("🎉 Correct! You guessed the number.");
                }
            } else {
                System.out.println("Please enter a valid number!");
                sc.next(); 
            }
        }
    }
}

