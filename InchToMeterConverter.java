import java.util.Scanner;
public class InchToMeterConverter 
{
 public static void main(String[] args) 
 {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Input a value for inch: ");
   double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is " + meters + " meters");
        scanner.close();
    }
}
