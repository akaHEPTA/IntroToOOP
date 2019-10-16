package Lab01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Model> models = new ArrayList<Model>();

        Model sean = new Model("Sean", "O'Pry", 73, 160, true, true);
        models.add(sean);

        Model david = new Model("David", "Gandy", 75, 201, true, false);
        models.add(david);

        for (Model model : models) {
            model.printDetails();
            System.out.println();
            model.displayModelDetails();
            System.out.println();
        }

    }

}
