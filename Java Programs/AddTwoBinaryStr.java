public class AddTwoBinaryStr{
    public static void main(String[] args) {
        String binary1 = "1001";
        String binary2 = "0101"; 
        int num1 = Integer.parseInt(binary1, 2); 
        int num2 = Integer.parseInt(binary2, 2); 
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        System.out.println("Sum of binary numbers: " + result);
    }
}