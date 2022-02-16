package sem1.lesson3.practise1;

import java.util.Scanner;

public class LoanCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double loanAmount = sc.nextDouble();
        double annualInterestRate = sc.nextDouble();
        double years = sc.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12;

        double monthlyPayment =
                (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -years * 12));

        System.out.printf("%.2f%n", monthlyPayment);

//        System.out.printf("The monthly payment is $%.2f%n", (loanAmount - monthlyPayment));
//        System.out.printf("The total payment is $%.2f%n", (loanAmount + monthlyPayment));

    }
}
