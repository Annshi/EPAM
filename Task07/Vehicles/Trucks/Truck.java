
package Vehicles.Trucks;


import Vehicles.Vehicle;

class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int р, int f, int m, int с) {
/* Инициализация членов класса Vehicle
с использованием конструктора этого класса. */
        super(р, f, m);
        cargocap = с;
    }

    int getCargo() {
        return cargocap;
    }

    void setCargo(int с) {
        cargocap = с;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +  " cargocap=" + cargocap;
    }
}
