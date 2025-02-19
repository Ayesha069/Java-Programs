import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("The LCM is: " + lcm);
        scanner.close();
    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); 
    }
}