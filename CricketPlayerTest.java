import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CricketPlayer {
    private String name;
    private int noOfInnings;
    private int noOfTimesNotOut;
    private int totalRuns;
    private double battingAvg;

    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.battingAvg = avg();
    }

    public double avg() {
        return (noOfInnings - noOfTimesNotOut) == 0 ? 0 : (double) totalRuns / (noOfInnings - noOfTimesNotOut);
    }

    public String getName() {
        return name;
    }

    public double getBattingAvg() {
        return battingAvg;
    }

    public void displayPlayerDetails() {
        System.out.printf("Name: %s, Innings: %d, Not Out: %d, Total Runs: %d, Batting Average: %.2f%n",
                name, noOfInnings, noOfTimesNotOut, totalRuns, battingAvg);
    }

    public static void sortPlayersByAvg(CricketPlayer[] players) {
        Arrays.sort(players, Comparator.comparingDouble(CricketPlayer::getBattingAvg).reversed());
    }
}

public class CricketPlayerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("Enter player name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of innings: ");
            int noOfInnings = scanner.nextInt();
            System.out.print("Enter number of times not out: ");
            int noOfTimesNotOut = scanner.nextInt();
            System.out.print("Enter total runs: ");
            int totalRuns = scanner.nextInt();

            players[i] = new CricketPlayer(name, noOfInnings, noOfTimesNotOut, totalRuns);
        }

        CricketPlayer.sortPlayersByAvg(players);

        System.out.println("\nPlayer details in sorted order by batting average:");
        for (CricketPlayer player : players) {
            player.displayPlayerDetails();
        }

        scanner.close();
    }
}