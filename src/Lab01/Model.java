package Lab01;

public class Model {
    // Constants
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    // Fields
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    // Constructors
    public Model() {
    }

    public Model(String firstName, String lastName, int inches, double pounds, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(inches);
        setWeight(pounds);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    public Model(String firstName, String lastName, int inches, double pounds) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(inches);
        setWeight(pounds);
        setCanTravel(true);
        setSmokes(false);
    }

    // Setters
    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 20)
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <= 20)
            this.lastName = lastName;
    }

    public void setHeight(int inches) {
        if (inches >= 24 && inches <= 84)
            this.height = inches;
    }

    public void setHeight(int feet, int inches) {
        setHeight((feet * INCHES_PER_FOOT) + inches);
    }

    public void setWeight(double pounds) {
        if (pounds >= 80 && pounds <= 280)
            this.weight = pounds;
    }

    public void setWeight(long kilograms) {
        setWeight(kilograms * POUNDS_PER_KG);
    }

    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isCanTravel() {
        return canTravel;
    }

    public boolean isSmokes() {
        return smokes;
    }

    public String getHeightInFeetAndInches() {
        int foot = getHeight() / INCHES_PER_FOOT;
        int inches = getHeight() % INCHES_PER_FOOT;
        String result;
        if (inches == 0)
            result = String.format("%d feet", foot);
        else if (inches == 1)
            result = String.format("%d feet %d inch", foot, inches);
        else
            result = String.format("%d feet %d inches", foot, inches);
        return result;
    }

    public long getWeightKg() {
        return (long) (getWeight() * POUNDS_PER_KG);
    }

    // Methods
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + (int) getWeight() + " pounds");
        System.out.print("Does ");
        if (!isCanTravel())
            System.out.print("not ");
        System.out.println("travel");
        System.out.print("Does ");
        if (!isSmokes())
            System.out.print("not ");
        System.out.println("smoke");
    }

    public int calculatePayDollarsPerHour() {
        int dollarsPerHour= BASE_RATE_DOLLARS_PER_HOUR;

        if (getHeight() >= TALL_INCHES && getWeight() < THIN_POUNDS)
            dollarsPerHour += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        if (isCanTravel())
            dollarsPerHour += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        if (isSmokes())
            dollarsPerHour -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;

        return dollarsPerHour;
    }

    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        System.out.print("Travels: ");
        if (isCanTravel())
            System.out.println("yep");
        else
            System.out.println("nope");
        System.out.print("Smokes: ");
        if (isSmokes())
            System.out.println("yep");
        else
            System.out.println("nope");
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }

}
