import java.util.*;

public class Main {

    public static void main(String[] args) {

        //garage

        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

        garage.add(new Vehicle("LandVehicle", "Mercedes", 1995));
        garage.add(new Vehicle("LandVehicle", "Yamaha", 1899));

        Collections.sort(garage);



        System.out.println(garage);


    }

}
