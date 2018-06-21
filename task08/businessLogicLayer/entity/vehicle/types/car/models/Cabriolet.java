package businessLogicLayer.entity.vehicle.types.car.models;
import businessLogicLayer.entity.vehicle.types.car.Car;

public class Cabriolet extends Car {
    private boolean roof;
    public Cabriolet(int price, int tankCapacity, int fuelConsumption, int maxPassngerCapacity, boolean roof) {
        super(price, tankCapacity, fuelConsumption, maxPassngerCapacity);
        this.roof = roof;
    }

    public boolean isOpenRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
      this.roof = roof;
    }

    @Override
    public String toString() {
        return "Cabriolet{" + super.toString() + " is roof open=" + roof +"}}";
    }
}

