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


