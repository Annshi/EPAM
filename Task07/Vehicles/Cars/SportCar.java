package Vehicles.Cars;

public class SportCar extends Car {
    private int enginePower;

    public SportCar(int р, int f, int m, int pas, int pow) {
        super(р, f, m, pas);
        enginePower = pow;
    }

    int getSize() {
        return enginePower;
    }

    void setSize(int pow) {
        enginePower = pow;
    }

    @Override
    public String toString() {
        return "SportCar{" + super.toString() + " engine power=" + enginePower + "horse power "+"}}";
    }
}

