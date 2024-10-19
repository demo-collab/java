import java.util.Scanner;

class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            checkNumber(number);
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void checkNumber(int number) throws ZeroException {
        if (number == 0) {
            throw new ZeroException("Number is 0");
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}