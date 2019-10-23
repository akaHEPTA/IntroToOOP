package Lab02;

public class Province {
    // Constant
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final long DEFAULT_POPULATION = 4_648_055;

    // Field
    private String name;
    private String capital;
    private long population;

    // Constructor
    public Province() {
    }

    public Province(String name, String capital, long population) {
        if (isValidProvince(name) && isValidCapitalCity(capital) && isValidPopulation(population)) {
            setName(name);
            setCapital(capital);
            setPopulation(population);
        } else {
            setName(DEFAULT_PROVINCE);
            setCapital(DEFAULT_CAPITAL);
            setPopulation(DEFAULT_POPULATION);
        }
    }

    // Accessor & mutator
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    // Method
    private boolean isValidProvince(String province) {
        boolean result = false;
        String[] provinces = {"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador",
                "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan"};

        for (String strTemp : provinces) {
            if (strTemp.equals(province))
                result = true;
        }

        return result;
    }

    private boolean isValidCapitalCity(String capital) {
        boolean result = false;
        String[] capitals = {"Edmonton", "Victoria", "Winnipeg", "Fredericton", "Saint Johns", "Halifax", "Toronto",
                "Charlottetown", "Quebec City", "Regina"};

        for (String strTemp : capitals) {
            if (strTemp.equals(capital))
                result = true;
        }

        return result;
    }

    private boolean isValidPopulation(long population) {
        boolean result = false;

        if (population >= 30_000 && population <= 15_000_000)
            result = true;

        return result;
    }

    public String getDetails() {
        return "The capital of " + getName() + " (population. " + getPopulation() + ") is " + getCapital() + ".";
    }

}
