package view;


import businessLogicLayer.entity.vehicle.Vehicle;
import businessLogicLayer.entity.vehicle.types.bus.Bus;
import businessLogicLayer.entity.vehicle.types.car.models.Cabriolet;
import businessLogicLayer.entity.vehicle.types.car.models.SportCar;
import businessLogicLayer.entity.vehicle.types.truck.models.OffRoad;
import businessLogicLayer.entity.vehicle.types.truck.models.Tipper;
import businessLogicLayer.entity.vehicle.types.truck.models.Van;
import businessLogicLayer.logic.parking.ParkingAccounter;
import businessLogicLayer.logic.parking.ParkingFinder;
import businessLogicLayer.logic.parking.ParkingManager;
import businessLogicLayer.logic.parking.ParkingSorter;

import java.util.Arrays;

public class Main {
    public static void main(String Args[]) {

        Vehicle[] park = new Vehicle[3];
        park[0] = new Van(12, 2, 3, 4, 54);
        park[1] = new Tipper(10, 12, 3, 4, "dumpers");
        park[2] = new Bus(6, 2, 3, "international", 21);

        System.out.println("All vehicles on parking");
        System.out.println(Arrays.toString(park));

        System.out.println("After sort by ascending price");
        System.out.println(Arrays.toString(park));

        System.out.println("\nVehicles on parking after adding another one");
        park = ParkingManager.addVehicle(park, new SportCar(8, 2, 3, 4, 2341));
        System.out.println(Arrays.toString(park));

        System.out.println("\nVehicles on parking after adding another vehicles");
        Vehicle[] newVehicles = {new OffRoad(8, 10, 11, 13, 432),  new Cabriolet(18, 8, 7, 10, true)};
        park = ParkingManager.addVehicles(park, newVehicles);
        System.out.println(Arrays.toString(park));

        System.out.println("\nCommon price of all vehicles on parking" + ParkingAccounter.countPricePark(park));

        int priceForSearch = 10;
        System.out.println("\nVehicles by price " + priceForSearch + "$ are:" + Arrays.toString(ParkingFinder.findVehicleByPrice(park, priceForSearch)));

        System.out.println("\nAmount of vehicles on park: " + ParkingAccounter.countVehicles(park));
        System.out.println(Arrays.toString(park));

        int index = 3;
        System.out.println("\nVehicle by index " + index + " is: " + ParkingFinder.findByIndex(park, index));

        System.out.println("\nAfter remove vehicle by index " + index);
        ParkingManager.deleteVehicleByIndex(park, index);
        System.out.println(Arrays.toString(park));

        System.out.println("\nAfter remove all vehicles");
        ParkingManager.deleteAllVehicles(park);
        System.out.println(Arrays.toString(park));
    }
}
