import java.util.Scanner;
public class Exercise8 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();
        System.out.printf("Square: %.2f%n", val * val);
        System.out.printf("Cube: %.2f%n", val * val * val);
        System.out.printf("Fourth power: %.2f%n", Math.pow(val, 4));
    }
}
