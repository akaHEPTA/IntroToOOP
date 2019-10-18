package Lab01;

/**
 * Represents a Model.
 * This class contains Model's specific profile data
 * that can be converted easily by built in methods.
 *
 * @author Richard
 * @since 2019-10-15
 */
public class Model {
    // Constants
    private static final int INCHES_PER_FOOT = 12;
    private static final double POUNDS_PER_KG = 2.2046;
    private static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    private static final int TALL_INCHES = 67;
    private static final double THIN_POUNDS = 140.0;
    private static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    private static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    private static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    // Fields
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * Default constructor
     * Creates a new Model without parameters.
     */
    public Model() {
    }

    /**
     * Overloaded constructor
     * Creates a new Model with all 6 parameters.
     * @param firstName This Model's first name
     * @param lastName This Model's last name
     * @param inches This Model's height, represented by inches
     * @param pounds This Model's weight, represented by pounds
     * @param canTravel This Model's travel availability
     * @param smokes This Model's smoking status
     */
    public Model(String firstName, String lastName, int inches, double pounds, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(inches);
        setWeight(pounds);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Overloaded constructor
     * Creates a new Model with 4 parameters.
     * @param firstName This Model's first name
     * @param lastName This Model's last name
     * @param inches This Model's height, represented by inches
     * @param pounds This Model's weight, represented by pounds
     */
    public Model(String firstName, String lastName, int inches, double pounds) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(inches);
        setWeight(pounds);
        setCanTravel(true);
        setSmokes(false);
    }

    // Setters

    /**
     * Sets first name of this Model.
     * @param firstName First name of this Model
     *                  Case insensitive
     */
    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 20)
            this.firstName = firstName;
    }

    /**
     * Sets last name of this Model.
     * @param lastName Last name of this Model
     *                 Case insensitive
     */
    public void setLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <= 20)
            this.lastName = lastName;
    }

    /**
     * Sets height of this Model.
     * @param inches Height of this Model
     *               Should represent only inches
     */
    public void setHeight(int inches) {
        if (inches >= 24 && inches <= 84)
            this.height = inches;
    }

    /**
     * Sets height of this Model.
     * @param feet Height of this Model
     *             Should contain only foot part
     * @param inches Height of this Model
     *               Should contain only inch part
     */
    public void setHeight(int feet, int inches) {
        setHeight((feet * INCHES_PER_FOOT) + inches);
    }

    /**
     * Sets weight of this Model.
     * @param pounds Weight of this Model
     *               Should represent pounds
     */
    public void setWeight(double pounds) {
        if (pounds >= 80 && pounds <= 280)
            this.weight = pounds;
    }

    /**
     * Sets weight of this Model.
     * @param kilograms Weight of this Model
     *                  Should represent kilograms
     */
    public void setWeight(long kilograms) {
        setWeight(kilograms * POUNDS_PER_KG);
    }

    /**
     * Sets travel availability of this Model.
     * @param canTravel Travel availability of this Model
     *                  Should represent true or false
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Sets smoking status of this Model.
     * @param smokes Smoking status of this Model
     *               Should represent true or false
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Gets first name of this Model.
     * @return this Model's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name of this Model.
     * @return this model's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets height of this Model.
     * @return this Model's height in inches.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets weight of this Model.
     * @return this Model's weight in pounds.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets travel availability of this Model.
     * @return this Model's travel availability in true or false.
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Gets smoking status of this Model.
     * @return this Model's smoking status in true or false.
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Gets height of this Model in feet and inches.
     * @return this Model's height in feet and inches as String.
     */
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

    /**
     * Gets weight of this Model in kilograms.
     * @return this Model's weight in kilograms as long type.
     */
    public long getWeightKg() {
        return (long) (getWeight() / POUNDS_PER_KG);
    }

    /**
     * Prints details of this Model.
     */
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

    /**
     * Calculate pay dollars per hour of this Model.
     * @return this Model's pay dollars per hour.
     */
    public int calculatePayDollarsPerHour() {
        int dollarsPerHour = BASE_RATE_DOLLARS_PER_HOUR;

        if (getHeight() >= TALL_INCHES && getWeight() < THIN_POUNDS)
            dollarsPerHour += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        if (isCanTravel())
            dollarsPerHour += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        if (isSmokes())
            dollarsPerHour -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;

        return dollarsPerHour;
    }

    /**
     * Show details of this Model on console.
     */
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
