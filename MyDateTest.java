import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd mm yyyy): ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + "/" + month + "/" + year);
        }
    }

    private boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            return (day <= 29 && (day != 29 || (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))));
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        return true;
    }

    public void displayDate() {
        System.out.printf("Date: %02d/%02d/%d%n", day, month, year);
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        try {
            myDate.acceptDate();
            myDate.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}