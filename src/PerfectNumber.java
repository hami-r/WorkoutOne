import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the start number: ");
            long startNumber = input.nextLong();
            if (startNumber <= 0) {
                startNumber = 1;
            }
            System.out.print("Enter the end number: ");
            long endNumber = input.nextLong();
            if(endNumber <= 0) {
                endNumber = 1;
            }

            //if end number is less than start number
            if(endNumber < startNumber) {
                long tempNumber = startNumber;
                startNumber = endNumber;
                endNumber = tempNumber;
            }

            if(startNumber <=0 && endNumber <=0) {
                System.out.println("Enter positive number!");

            }else {

                while (startNumber < endNumber) {
                    if(isPerfectNumber(startNumber)) {
                        System.out.println(startNumber + " ");
                    }
                    startNumber++;
                }
            }


        } catch (Exception e) {
            System.out.println("Enter a valid number!\n" +
                    "TRY AGAIN");
        }

    }

    private static boolean isPerfectNumber(long startNumber) {
        long sum = 0;
        for(long i = 1; i <= startNumber / 2; i++) {
            if(startNumber % i == 0) {
                sum += i;
            }
        }
        return (startNumber == sum);
    }
}
