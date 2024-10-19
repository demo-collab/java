import java.util.Arrays;
import java.util.Comparator;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalRuns;

    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalRuns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalRuns = totalRuns;
    }

    public double avg() {
        return (no_of_innings - no_of_times_notout) == 0 ? 0 : (double) totalRuns / (no_of_innings - no_of_times_notout);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Innings: " + no_of_innings + ", Not Out: " + no_of_times_notout + ", Total Runs: " + totalRuns + ", Batting Average: " + avg();
    }
}

public class CricketPlayerStatistics {
    public static void sortByAverage(CricketPlayer[] players) {
        Arrays.sort(players, Comparator.comparingDouble(CricketPlayer::avg).reversed());
    }

    public static void main(String[] args) {
        CricketPlayer[] players = {
            new CricketPlayer("Player1", 50, 10, 2000),
            new CricketPlayer("Player2", 30, 5, 1500),
            new CricketPlayer("Player3", 40, 8, 1800)
        };

        for (CricketPlayer player : players) {
            System.out.println(player);
        }

        sortByAverage(players);
        System.out.println("\nPlayers sorted by Batting Average:");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }
    }
}