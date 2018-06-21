package businessLogicLayer.entity.vehicle.types.truck.models;

import businessLogicLayer.entity.vehicle.types.truck.Truck;

public class OffRoad extends Truck {
    private int groundClearance;

    public OffRoad(int р, int f, int m, int c, int cl) {
        super(р, f, m, c);
        groundClearance = cl;
    }

    int getSize() {
        return groundClearance;
    }

    void setSize(int cl) {
        groundClearance = cl;
    }

    @Override
    public String toString() {
        return "OffRoad{" + super.toString() + " ground clearance=" + groundClearance + "inch"+"}}";
    }
}


