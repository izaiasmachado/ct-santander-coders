public class App {
    public static void main(String[] args) throws Exception {
        double fahrenheit = 212;
        double celsius = TemperatureConversor.fahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", fahrenheit, celsius);
    }
}
