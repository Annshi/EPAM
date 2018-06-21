package businessLogicLayer.entity.vehicle.types.car.models;

import businessLogicLayer.entity.vehicle.types.car.Car;

public class SportCar extends Car {
    private int enginePower;

    public SportCar(int price, int tankCapacity, int fuelConsumption, int maxPassengerCapacity, int enginePower) {
        super(price, tankCapacity, fuelConsumption, maxPassengerCapacity);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int pow) {
        enginePower = pow;
    }

    @Override
    public String toString() {
        return "SportCar{" + super.toString() + " engine power=" + enginePower + "horse power "+"}}";
    }
}

