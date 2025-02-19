import java.util.Scanner;
public class Gcd
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD (HCF) is: " + gcd);
        scanner.close();
    }
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return findGCD(b, a % b);
    }
}