public class Driver {
    public static void main(String[] args) {
        Canada canada = new Canada();

        canada.displayAllProvinces();

        System.out.println("\nPopulation between 1-15 million: " + canada.getNumOfProvincesBetween(1, 15));
    }

}
