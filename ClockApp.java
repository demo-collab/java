import java.util.Scanner;

class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String period; // AM or PM

    public Clock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            setPeriod();
        } else {
            throw new IllegalArgumentException("Invalid time input");
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
    }

    private void setPeriod() {
        if (hours < 12) {
            period = "AM";
            if (hours == 0) {
                hours = 12; // Midnight case
            }
        } else {
            period = "PM";
            if (hours > 12) {
                hours -= 12; // Convert to 12-hour format
            }
        }
    }

    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d %s%n", hours, minutes, seconds, period);
    }
}

public class ClockApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds (0-59): ");
        int seconds = scanner.nextInt();

        try {
            Clock clock = new Clock(hours, minutes, seconds);
            clock.displayTime();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}