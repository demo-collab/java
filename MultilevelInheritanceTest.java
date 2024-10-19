class Continent {
    protected String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}

class Country extends Continent {
    protected String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}

class State extends Country {
    private String stateName;
    private String placeName;

    public State(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName);
        this.stateName = stateName;
        this.placeName = placeName;
    }

    public void displayDetails() {
        System.out.printf("Place: %s\nState: %s\nCountry: %s\nContinent: %s\n",
                placeName, stateName, countryName, continentName);
    }
}

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        State state = new State("Asia", "India", "Maharashtra", "Mumbai");
        state.displayDetails();
    }
}