import Utils.*;
import Vehicles.*;
import Vehicles.Cars.Cabriolet;
import Vehicles.Cars.SportCar;
import Vehicles.Trucks.OffRoad;

import java.util.Arrays;

public class Main {
    public static void main(String Args[]) {

        Vehicle[] park = new Vehicle[3];
        Parking.createPark(park);

        System.out.println("All vehicles on parking");
        Parking.showPark(park);

        System.out.println("\nVehicles on parking after adding another one");
        park = Parking.addVehicle(park, new SportCar(8, 2, 3, 4, 2341));
        Parking.showPark(park);

        System.out.println("\nVehicles on parking after adding another vehicles");
        Vehicle[] newVehicles = {new OffRoad(8, 10, 11, 13, 432),  new Cabriolet(18, 8, 7, 10, true)};
        park = Parking.addVehicles(park, newVehicles);
        Parking.showPark(park);

        System.out.println("\nCommon price of all vehicles on parking" + Parking.countPricePark(park));

        int priceForSearch = 10;
        System.out.println("\nVehicles by price " + priceForSearch + "$ are:" + Arrays.toString(Parking.findVehicleByPrice(park, priceForSearch)));

        System.out.println("\nAmount of vehicles on park: " + Parking.countVehicles(park));
        Parking.showPark(park);

        int index = 3;
        System.out.println("\nVehicle by index " + index + " is: " + Parking.getByIndex(park, index));

        System.out.println("\nAfter remove vehicle by index " + index);
        Parking.deleteVehicleByIndex(park, index);
        Parking.showPark(park);

        System.out.println("\nAfter remove all vehicles");
        Parking.deleteAllVehicles(park);
        Parking.showPark(park);



    }
}
