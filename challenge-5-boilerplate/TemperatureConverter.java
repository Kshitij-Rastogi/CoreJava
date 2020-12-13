import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice == 'y'){
            System.out.println("Enter the temperature:");
            float temp = sc.nextFloat();
            System.out.println("Enter the source scale(celcius(c)/fahrenheit(f))?");
            char sourceScale = sc.next().charAt(0);
            switch(sourceScale){
                case 'c':{
                    celsiusToFahrenheit(temp);
                    break;
                }
                case 'f':{
                    fahrenheitToCelsius(temp);
                    break;
                }
                default:{
                    System.out.println("Invalid Source Scale");
                }

            } 
            System.out.println("Do you wish to continue(y/n)?");
            choice = sc.next().charAt(0);
        }
        sc.close();
    }

    public static void celsiusToFahrenheit(float tempCelsius){
        float tempFahrenheit = (tempCelsius * 9/5f) + 32.0f;
        System.out.printf("Temperature(Celsius)=" + "%.2f" , tempCelsius);
        System.out.printf("\t\t Temperature(Fahrenheit)=" + "%.2f \n", tempFahrenheit);
    }
    public static void fahrenheitToCelsius(float tempFahrenheit){
        float tempCelsius = (tempFahrenheit - 32.0f) * 5/9f;
        System.out.printf("Temperature(Celsius)=" + "%.2f" , tempCelsius);
        System.out.printf("\t\t Temperature(Fahrenheit)=" + "%.2f \n", tempFahrenheit);
    }
}