package Vehicles.Cars;

public class Cabriolet extends Car {
    private boolean roof;
    public Cabriolet(int р, int f, int m, int p, boolean r) {
        super(р, f, m, p);
        roof = r;
    }


    boolean isOpenRoof() {
        return roof;
    }

    void setAssignmentType(boolean r) {
      roof = r;
    }
    @Override
    public String toString() {
        return "Cabriolet{" + super.toString() + " is roof open=" + roof +"}}";
    }
}

