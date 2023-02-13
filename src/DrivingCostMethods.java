import java.util.Scanner;

public class DrivingCostsMethod {
   
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
      return (drivenMiles * (1.0 / milesPerGallon) * dollarsPerGallon);

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double milesPerGallon;
      double dollarsPerGallon;

      System.out.println("Enter miles per gallon:");
      milesPerGallon = scnr.nextDouble();
      System.out.println("Enter dollars per gallon:");
      dollarsPerGallon = scnr.nextDouble();

      System.out.printf("%.2f ", drivingCost(10.0, milesPerGallon, dollarsPerGallon));
      System.out.printf("%.2f ", drivingCost(50.0, milesPerGallon, dollarsPerGallon));
      System.out.printf("%.2f\n", drivingCost(400.0, milesPerGallon, dollarsPerGallon));

   }
}
