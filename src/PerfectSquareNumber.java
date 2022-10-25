import java.util.Scanner;

public class PerfectSquareNumber {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the start number: ");
            long startNumber = input.nextLong();

            System.out.print("Enter the end number: ");
            long endNumber = input.nextLong();

            //if end number is less than start number
            if(endNumber < startNumber) {
                long tempNumber = startNumber;
                startNumber = endNumber;
                endNumber = tempNumber;
            }

            if(startNumber < 0 && endNumber < 0) {
                System.out.println("Enter positive number!");

            }else {

                while (startNumber < endNumber) {
                    if(isPerfectSquareNumber(startNumber)) {
                        System.out.print(startNumber + " ");
                    }
                    startNumber++;
                }
            }


        } catch (Exception e) {
            System.out.println("Enter a valid number!\n" +
                    "TRY AGAIN");
        }

    }

    private static boolean isPerfectSquareNumber(long startNumber) {
        double squareRoot = Math.sqrt(startNumber);
        return (squareRoot - Math.floor(squareRoot) == 0);
    }
}
