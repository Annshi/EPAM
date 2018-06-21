package businessLogicLayer.logic.parking;
import businessLogicLayer.entity.vehicle.Vehicle;
import static businessLogicLayer.logic.parking.ParkingManager.isEmpty;

public class ParkingFinder {

    public static Vehicle[] findVehicleByPrice(Vehicle[] park, int price) {
        Vehicle[] searchedVehicles = null;
        if (!isEmpty(park)) {
            int count = 0;
            for (int i = 0; i < park.length; i++) {
                if (park[i] == null || park[i].getPrice() == price) {
                    count++;
                }
            }
            searchedVehicles = new Vehicle[count];
            for (int i = 0, j = 0; i < park.length; i++) {
                if (park[i] != null && park[i].getPrice() == price) {
                    searchedVehicles[j] = park[i];
                    j++;
                }
            }
        }
        return searchedVehicles;
    }

    public static int findFreePlace(Vehicle[] park) {
        if (isEmpty(park)) {
            return 0;
        } else for (int i = 0; i < park.length; i++) {
            if (park[i] == null) {
                return i;
            }
        }
        return park.length;
    }

    public static Vehicle findByIndex(Vehicle[] park, int index) {
        if (park.length > index && park[index] != null) {
            return park[index];
        } else return null;
    }
}
