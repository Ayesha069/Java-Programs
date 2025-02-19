import java.util.Scanner;
public class Armstron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
    static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }
}