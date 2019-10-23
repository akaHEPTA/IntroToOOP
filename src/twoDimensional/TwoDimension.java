package twoDimensional;

public class TwoDimension {
    public static void main(String[] args) {
        // create a two-dimensional array (literal syntax)
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // get the sum of the first row
        int firstRowSum = data[0][0] + data[0][1] + data[0][2];
        System.out.println(firstRowSum);

        // get the number of rows
        System.out.println(data.length);

        // get the number cols in the first row
        System.out.println(data[0].length);

        // create a two-dimensional array with the size
        String[][] students = new String[2][4]; // default value -> null
        students[0][0] = "Rick";
        students[0][1] = "Richard";
        students[0][2] = "Mika";
        students[0][3] = "Bianca";
        students[1][0] = "Yuka";
        students[1][1] = "Yusuke";
        students[1][2] = "Anzu";
        students[1][3] = "Wenda";

        // loop over students to print their name
        // for each row print all the columns
        for (int r = 0; r < students.length; r++) {
            for (int c = 0; c < students[r].length; c++) {
                System.out.print(students[r][c] + " ");
            }
            System.out.println();
        }

        // for-each loop: "for each row in students, for each student in row, ..."
        for (String[] row : students) {
            for (String student : row) {
                System.out.println(student + " ");
            }
            System.out.println();
        }



    }

}
