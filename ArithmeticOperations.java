import java.util.Scanner;
public class ArithmeticOperations
{
 public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        int multiply = firstNumber * secondNumber;
        int subtract = firstNumber - secondNumber;
        int divide = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        System.out.println("Output: " + sum + ", " + multiply + ", " + subtract + ", " + divide + ", " + remainder);
        scanner.close();
    }
}
