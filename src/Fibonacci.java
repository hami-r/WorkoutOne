import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        if(input.hasNextInt()) {
            int number = input.nextInt();

            if(number < 0) {
                System.out.println("Cannot generate fibonacci numbers for negative numbers!");
            }

            int i = 0, fibonacci = -5;

            while (fibonacci <= number - 1) {
                fibonacci = genrateFibonacci(i++);
                System.out.print(fibonacci + " ");
            }

        } else {
            System.out.println("Enter valid number!\n" +
                    "TRY AGAIN");
        }
    }

    private static int genrateFibonacci(int number) {
        if(number == 0) {
            return 0;

        } else if(number == 1 || number == 2) {
            return 1;

        } else {
            return genrateFibonacci(number - 1) + genrateFibonacci(number -2);
        }

    }
}
