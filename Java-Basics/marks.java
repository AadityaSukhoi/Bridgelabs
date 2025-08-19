// WAP to print marks=90+ -> Grade A; marks 75-89 -> Grade B; marks 60-74 -> Grade C;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75 && marks < 90) {
            grade = 'B';
        } else{
            grade = 'C';
        }
        System.out.println("Your grade is: " + grade);
    }   
}
