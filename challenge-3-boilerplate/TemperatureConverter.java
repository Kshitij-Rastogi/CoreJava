import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice == 'y'){
            System.out.println("Enter the temperature in Degree Celsius:");
            float tempCelsius = sc.nextFloat();
            float tempFahrenheit = (tempCelsius * 9/5f) + 32.0f;
            System.out.printf("Temperature(Celsius)=" + "%.2f" , tempCelsius);
            System.out.printf("\t\t Temperature(Fahrenheit)=" + "%.2f \n", tempFahrenheit);
            System.out.println("Do you wish to continue(y/n)?");
            choice = sc.next().charAt(0);
        }
    }
}