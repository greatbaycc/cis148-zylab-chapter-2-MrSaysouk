import java.util.Scanner;

public class CelsiusToKelvin {
   
   public static double convert(double degreesCelsius) {
      return degreesCelsius + 273.15;

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      CelsiusToKelvin ctk = new CelsiusToKelvin();

      System.out.println("Enter degrees Celsius to convert: ");
      double in = scnr.nextDouble();
      double out = ctk.convert(in);

      System.out.printf("%.2f", out);

   }
}
