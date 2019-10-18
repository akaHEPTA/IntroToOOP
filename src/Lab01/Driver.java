package Lab01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Model> models = new ArrayList<>();

        Model sean = new Model("Sean", "O'Pry", 73, 160, true, true);
        models.add(sean);
        Model gisele = new Model("Gisele", "Bundchen", 71, 132);
        models.add(gisele);
        Model david = new Model("David", "Gandy", 75, 201, true, false);
        models.add(david);
        Model stella = new Model("Stella", "Maxwell", 70, 119);
        models.add(stella);

        Model adam = new Model();
        adam.setFirstName("Adam");
        adam.setLastName("Senn");
        adam.setHeight(74);
        adam.setWeight(161.0);
        adam.setCanTravel(false);
        adam.setSmokes(false);
        models.add(adam);

        Model goncalo = new Model();
        goncalo.setFirstName("Goncalo");
        goncalo.setLastName("Teixeira");
        goncalo.setHeight(6, 0);
        goncalo.setWeight(73l);
        goncalo.setCanTravel(false);
        goncalo.setSmokes(false);
        models.add(goncalo);

        Scanner scanner = new Scanner(System.in);

        for (Model model : models) {
            model.printDetails();
            System.out.println();
            model.displayModelDetails();
            System.out.println();
            System.out.println("Weight(kg): " + model.getWeightKg());

            System.out.print("\nPress 0 for stop: ");
            if (scanner.nextInt() == 0) break;
            System.out.println();
        }

        System.out.println("Done");
    }

}
