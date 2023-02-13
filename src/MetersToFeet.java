import java.util.Scanner;

public class MetersToFeet {

   public static double convert(double meters) {
      return meters * 3.28;

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      MetersToFeet mtf = new MetersToFeet();

      System.out.println("Enter meters to convert: ");
      double in = scnr.nextDouble();
      double out = mtf.convert(in);

      System.out.printf("%.2f", out);

   }
}
