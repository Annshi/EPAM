package businessLogicLayer.logic.parking;

import businessLogicLayer.entity.vehicle.Vehicle;

import static businessLogicLayer.logic.parking.ParkingManager.isEmpty;


public class ParkingAccounter {
    private Vehicle[] park;

    public static int countPricePark(Vehicle[] park) {
        int price = 0;
        if (isEmpty(park)) {
            return -1;
        } else
            for (int i = 0; i < park.length; i++) {
                if (park[i] == null) {
                    price += 0;
                } else price += park[i].getPrice();
            }
        return price;
    }

    public static int countVehicles(Vehicle[] park) {
        int count = 0;
        if (!isEmpty(park)) {
            for (int i = 0; i < park.length; i++) {
                if (park[i] != null) {
                    count++;
                }
            }
        }
        return count;
    }

}
