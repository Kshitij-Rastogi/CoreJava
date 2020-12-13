public class TemperatureConverter {
    public static void main(String[] args) {
        int tempCelsius = 0;
        System.out.println("Sr. No"+ "\t\t" + "Temperature(Celsius)" + "\t\t" + "Temperature(Fahrenheit)");
        for(int i = 1 ; i<=101 ; i++){
            int tempFahrenheit = (tempCelsius * 9/5) + 32;
            System.out.println(i + "\t\t\t" + tempCelsius + "\t\t\t\t" + tempFahrenheit);
            tempCelsius += 10;
        }
    }
}
