package Vehicles.Buses;

import Vehicles.Vehicle;

public class Bus extends Vehicle {
    String type;
    int places;
    public Bus(int р, int f, int m, String t, int pl) {
        super(р, f, m);
        type = t;
        places = pl;

    }

    int getPlaces() {
        return places;
    }

    void setPlaces(int с) {
        places = с;
    }

    String getType() {
        return type;
    }

    void setType(String t) {
       type = t;
    }
    @Override
    public String toString() {
        return "Bus{" + super.toString() +  " places=" + places + " type=" + type+"}";
    }
}
