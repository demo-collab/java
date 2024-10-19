class Continent {
    String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}

class Country extends Continent {
    String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}

class State extends Country {
    String stateName;

    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }
}

public class GeographicalHierarchy {
    public static void main(String[] args) {
        State state = new State("Asia", "India", "Maharashtra");

        System.out.println("State: " + state.getStateName());
        System.out.println("Country: " + state.getCountryName());
        System.out.println("Continent: " + state.getContinentName());
    }
}