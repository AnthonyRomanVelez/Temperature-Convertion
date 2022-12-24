import java.util.Scanner;

public class TemperatureConversion {
    //Methods to do the conversion from F to C and vise versa
    public static double celsius(double fahrenheit){
        double celsius = ( 5.0 /9.0 ) * ( fahrenheit - 32 );
        return celsius;
    }
    public static double fahrenheit(double celsius){
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }
    
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter Fahrenheit temperature: ");
        double fahrenheit = scan.nextDouble();
         System.out.printf("The entered temperature in Celsius is: "+"%,.2f",celsius(fahrenheit));
         System.out.println("\nEnter Celsius temperature: ");
        double celsius = scan.nextDouble();
        System.out.printf("The entered temperature in Fahrenheit is: "+"%,.2f", fahrenheit(celsius));
    }
}
