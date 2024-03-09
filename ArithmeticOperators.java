import java.util.*;

class ArithmeticOperators 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers a and b: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float result1 = a + b * a;
        float result2 = b + a / b;
        float result3 = a % b + a;
        float result4 = a * b + a;

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);

        System.out.println("Maximum: " + Math.max(result1, Math.max(result2, Math.max(result3, result4))));
        System.out.println("Minimum: " + Math.min(result1, Math.min(result2, Math.min(result3, result4))));
    }
}
