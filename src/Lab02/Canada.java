package Lab02;

public class Canada {
    // Constance
    private static final int MILLION = 1_000_000;
    private static final String[] NAMES = {"Alberta", "British Columbia", "Manitoba", "New Brunswick",
            "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan"};
    private static final String[] CAPITALS = {"Edmonton", "Victoria", "Winnipeg", "Fredericton", "Saint Johns",
            "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina"};
    private static final long[] POPULATIONS = {4_067_175, 4_648_055, 1_278_365, 747_101, 519_716, 923_598, 13_448_494,
            142_907, 8_164_361, 1_098_352};

    // Field
    private Province[] provinces = null;

    // Constructor
    public Canada() {
        provinces = new Province[10];
        for (int i = 0; i < 10; i++) {
            provinces[i] = (new Province(NAMES[i], CAPITALS[i], POPULATIONS[i]));
        }
        // wrong case for test
        // provinces[0] = new Province("Altario", "Manito", 1_000_000);
    }

    // Methods
    public void displayAllProvinces() {
        for (Province province : provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int cnt = 0;

        for (Province province : provinces) {
            if (province.getPopulation() > min * MILLION && province.getPopulation() < max * MILLION)
                cnt++;
        }

        return cnt;
    }


}
