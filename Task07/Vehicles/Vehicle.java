package Vehicles;

public class Vehicle {
    private int price;
    private int fuelcap;
    private int mpg;

    public Vehicle(int р, int f, int m) {
        price = р;
        fuelcap = f;
        mpg = m;
    }

    int range () {
        return mpg * fuelcap;
    }
    public int getPrice() {
        return price;
    }
    void setPrice(int р) {
        price = р;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
    public String toString() {
        return "price=" + price  + " fuelcap=" + fuelcap  + " mpg=" + mpg;
    }
}