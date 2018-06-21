package businessLogicLayer.entity.vehicle.types.truck.models;

import businessLogicLayer.entity.vehicle.types.truck.Truck;

public class Tipper extends Truck {
    private String assignmentType;
    public Tipper(int р, int f, int m, int c, String t) {
        super(р, f, m, c);
        assignmentType = t;
    }


    String getType() {
        return assignmentType;
    }

    void setAssignmentType(String t) {
        assignmentType = t;
    }
    @Override
    public String toString() {
        return "Tipper{" + super.toString() + " type=" + assignmentType +"}}";
    }
}
