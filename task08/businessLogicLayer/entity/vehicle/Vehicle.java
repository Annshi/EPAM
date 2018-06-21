package businessLogicLayer.entity.vehicle;

public class Vehicle { //vehicle as the mean of transportation
    private int price;
    private int  tankCapacity;
    private int fuelConsumption;

    public Vehicle(int price, int tankCapacity, int fuelConsumption) {
        this.price =  price;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public int getRange () {
        return tankCapacity * fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int рrice) {
        this.price = рrice;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        fuelConsumption = fuelConsumption;
    }

    public String toString() {
        return "price=" + price  + " fuelcap=" + tankCapacity  + " mpg=" + fuelConsumption;
    }
}