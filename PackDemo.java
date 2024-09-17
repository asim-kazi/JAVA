import java.util.Scanner;

class Trig {
    private double angle;

    public Trig(double angle) {
        this.angle = Math.toRadians(angle); // Convert angle to radians
    }

    public double getSine() {
        return Math.sin(angle);
    }

    public double getCosine() {
        return Math.cos(angle);
    }

    public double getTangent() {
        return Math.tan(angle);
    }

    public double getSecant() {
        return 1 / Math.cos(angle);
    }

    public double getCosecant() {
        return 1 / Math.sin(angle);
    }

    public double getCotangent() {
        return 1 / Math.tan(angle);
    }
}

class Arithmetic {
    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

class Stat {
    public float min(float[] numbers) {
        float min = numbers[0];
        for (float num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public float max(float[] numbers) {
        float max = numbers[0];
        for (float num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int count(float[] numbers) {
        return numbers.length;
    }

    public float sum(float[] numbers) {
        float sum = 0;
        for (float num : numbers) {
            sum += num;
        }
        return sum;
    }

    public float average(float[] numbers) {
        return sum(numbers) / count(numbers);
    }
}

public class PackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Trigonometric operations
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        Trig trig = new Trig(angle);
        System.out.println("Sine: " + trig.getSine());
        System.out.println("Cosine: " + trig.getCosine());
        System.out.println("Tangent: " + trig.getTangent());
        System.out.println("Secant: " + trig.getSecant());
        System.out.println("Cosecant: " + trig.getCosecant());
        System.out.println("Cotangent: " + trig.getCotangent());

        // Arithmetic operations
        Arithmetic arithmetic = new Arithmetic();
        System.out.print("\nEnter two numbers for arithmetic operations: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        System.out.println("Addition: " + arithmetic.add(num1, num2));
        System.out.println("Subtraction: " + arithmetic.subtract(num1, num2));
        System.out.println("Multiplication: " + arithmetic.multiply(num1, num2));
        System.out.println("Division: " + arithmetic.divide(num1, num2));

        // Statistical operations
        Stat stat = new Stat();
        System.out.print("\nEnter the number of elements for statistical operations: ");
        int n = scanner.nextInt();
        float[] numbers = new float[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextFloat();
        }
        System.out.println("Min: " + stat.min(numbers));
        System.out.println("Max: " + stat.max(numbers));
        System.out.println("Count: " + stat.count(numbers));
        System.out.println("Sum: " + stat.sum(numbers));
        System.out.println("Average: " + stat.average(numbers));

        scanner.close();
    }
}
