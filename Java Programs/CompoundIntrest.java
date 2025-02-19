import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();
        double compoundInterest = principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
        System.out.println("Compound Interest is: " + compoundInterest);
        scanner.close();
    }
}