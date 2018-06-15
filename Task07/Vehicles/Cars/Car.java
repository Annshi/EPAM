
package Vehicles.Cars;

import Vehicles.Vehicle;

public class Car extends Vehicle {
        private int maxPassengerCapacity;

        Car(int р, int f, int m, int pas) {
            super(р, f, m);
            maxPassengerCapacity = pas;
        }

        int getPlaces() {
            return maxPassengerCapacity;
        }

        void setPlaces(int pas) {
            maxPassengerCapacity = pas;
        }

        @Override
        public String toString() {
            return "Car{" + super.toString() + " max passenger's capacity=" + maxPassengerCapacity;
        }
    }
