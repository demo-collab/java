public class PrimeNumbersInArray {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            return;
        }
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid number.");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}