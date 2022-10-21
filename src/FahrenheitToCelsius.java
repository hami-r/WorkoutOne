import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args){
        double fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit:");

        if(input.hasNextDouble()) {
            fahrenheit = input.nextDouble();
            toCelsius(fahrenheit);

        } else {
            System.out.println("Enter valid number!\n" +
                    "TRY AGAIN");
        }
    }

    private static void toCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius:" + celsius + "°C");
    }


}
