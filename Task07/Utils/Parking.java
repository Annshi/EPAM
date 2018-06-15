package Utils;

import Vehicles.Buses.Bus;
import Vehicles.Trucks.Tipper;
import Vehicles.Trucks.Van;
import Vehicles.Vehicle;

import java.util.*;
import java.util.Arrays;

public class Parking {
    private Vehicle[] park;

    public Parking(Vehicle[] park) {
        this.park = park;
    }

    public static void createPark(Vehicle[] park) {
        park[0] = new Van(1, 2, 3, 4, 54);
        park[1] = new Tipper(10, 12, 3, 4, "dumpers");
        park[2] = new Bus(6, 2, 3, "international", 21);
    }

    public static void showPark(Vehicle[] park) {
        System.out.println(Arrays.toString(park));
    }


    public static boolean isEmpty(Vehicle[] park) {
        int count = 0;
        for (Vehicle i : park)
            if (i == null) {
                count++;
            }
        return count == park.length;
    }

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


    public static int getFreePlace(Vehicle[] park) {
        if (isEmpty(park)) {
            return 0;
        } else for (int i = 0; i < park.length; i++) {
            if (park[i] == null) {
                return i;
            }
        }
        return park.length;
    }

    public static Vehicle[] addVehicle(Vehicle[] park, Vehicle vehicle) {
        int p = getFreePlace(park);
        if (p >= park.length) {
            park = Arrays.copyOf(park, park.length + 1);
            park[park.length - 1] = vehicle;
        } else park[getFreePlace(park)] = vehicle;
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

    public static Vehicle getByIndex(Vehicle[] park, int index) {
        if (park.length > index && park[index] != null) {
            return park[index];
        } else return null;
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




