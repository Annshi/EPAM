package businessLogicLayer.entity.vehicle.types.truck;
import businessLogicLayer.entity.vehicle.Vehicle;

public class Truck extends Vehicle {
    private int cargocap;

    public Truck(int price, int tankCapacity, int fuelConsumption, int cargocap) {
        super(price, tankCapacity, fuelConsumption);
        this.cargocap = cargocap;
    }

    public int getCargo() {
        return cargocap;
    }

    public void setCargo(int cargocap) {
        this.cargocap = cargocap;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +  " cargocap=" + cargocap;
    }
}
