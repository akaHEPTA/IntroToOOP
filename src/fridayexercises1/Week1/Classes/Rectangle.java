package fridayexercises1.Week1.Classes;

public class Rectangle {
    // width, height, color as fields
    private int width;
    private int height;
    private String color;

    // "Method Overloading"
    // - same method name, but different set of parameters.
    public Rectangle(int width, int height) {
        // this.field or this.method()
        // this() : constructor
        this(width, height, "Blue");
    }

    // designated constructor: takes most parameters
    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public void draw() {
        // 1. get the first char of the color
        String firstLetter = color.substring(0, 1);
        // 2. print first char
        //    - for each row(height), print col(width)
        for(int h = 0; h < height; h++) {
            // print each width(col)
            for(int w = 0; w < width; w++) {
                System.out.print(firstLetter);
            }
            System.out.println(); // new line
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.length() > 2
                && color.length() < 20
                && (color.charAt(0) >= 'A' && color.charAt(0) <= 'Z')) {
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }
}
