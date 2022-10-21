import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        if(input.hasNextInt()) {
            int number = input.nextInt();
            if(number < 0) {
                System.out.println("Cannot print triangle for negative numbers!");
            }
            printTriangle(number);

        } else {
            System.out.println("Enter valid number!\n" +
                    "TRY AGAIN");
        }
    }

    private static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
