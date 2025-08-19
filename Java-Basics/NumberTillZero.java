// WAP that takes a number until user enters 0

import java.util.Scanner;

public class NumberTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number; 
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = sc.nextInt();
            if (number != 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0);
    }
}
