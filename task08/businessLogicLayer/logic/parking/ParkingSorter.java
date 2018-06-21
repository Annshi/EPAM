package businessLogicLayer.logic.parking;

import businessLogicLayer.entity.vehicle.Vehicle;

import java.util.Arrays;

import static businessLogicLayer.logic.parking.ParkingManager.isEmpty;

public class ParkingSorter {
    public static void bubbleSortByPrice(Vehicle[] park) {
        Vehicle t;
        int flag;
        if (!isEmpty(park)) {
            for (int j = 0; j < park.length - 1; j++) {
                flag = 0;
                for (int i = 0; i < park.length - j - 1; i++) {
                    if (park[i].getPrice() > park[i + 1].getPrice()) {
                        t = park[i];
                        park[i] = park[i + 1];
                        park[i + 1] = t;
                        flag++;
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
        }
    }
}