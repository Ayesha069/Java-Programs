class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);
    }


    void printComplex() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class AddTwoComplexno {
    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber complex1 = new ComplexNumber(3, 2);  // 3 + 2i
        ComplexNumber complex2 = new ComplexNumber(1, 7);  // 1 + 7i

        // Add the two complex numbers
        ComplexNumber sum = complex1.add(complex2);

        // Print the result
        System.out.print("Sum of complex numbers: ");
        sum.printComplex();
    }
}