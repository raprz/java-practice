import java.util.Scanner;

public class CompoundInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Compound Interest Calculator
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Formula
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        // Output
        System.out.println("The amount after " + years + " is: $" + amount);



        scanner.close();
    }
}
