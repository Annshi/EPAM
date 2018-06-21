package businessLogicLayer.logic.parking;
import businessLogicLayer.entity.vehicle.Vehicle;

import java.util.Arrays;

import static businessLogicLayer.logic.parking.ParkingFinder.findFreePlace;

public class ParkingManager {
    private Vehicle[] park;

    public ParkingManager(Vehicle[] park) {
        this.park = park;
    }

    public static boolean isEmpty(Vehicle[] park) {
        int count = 0;
        for (Vehicle i : park)
            if (i == null) {
                count++;
            }
        return count == park.length;
    }

    public static Vehicle[] addVehicle(Vehicle[] park, Vehicle vehicle) {
        int p = findFreePlace(park);
        if (p >= park.length) {
            park = Arrays.copyOf(park, park.length + 1);
            park[park.length - 1] = vehicle;
        } else park[findFreePlace(park)] = vehicle;
        return park;
    }

    public static Vehicle[] addVehicles(Vehicle[] park, Vehicle[] vehicles) {
        int oldLength = park.length;
        int newLength = vehicles.length + park.length;
        park = Arrays.copyOf(park, newLength);
        for (int i = oldLength, k = 0; i < newLength; i++, k++) {
            park[i] = vehicles[k];
        }
        return park;
    }

    public static void deleteVehicleByIndex(Vehicle[] park, int index) {
        if (!isEmpty(park) && park.length > index) {
            park[index] = null;
        }
    }

    public static void deleteAllVehicles(Vehicle[] park) {
        for (int i = 0; i < park.length; i++)
            if (park[i] != null) {
                park[i] = null;
            }
    }
}




