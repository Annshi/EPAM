package businessLogicLayer.entity.vehicle.types.car;

import businessLogicLayer.entity.vehicle.Vehicle;

public class Car extends Vehicle {
        private int maxPassengerCapacity;

        public Car(int р, int f, int m, int maxPassengerCapacity) {
            super(р, f, m);
            this.maxPassengerCapacity = maxPassengerCapacity;
        }

        int getMaxPassengerCapacity() {
            return maxPassengerCapacity;
        }

        void setMaxPassengerCapacity(int pas) {
            maxPassengerCapacity = pas;
        }

        @Override
        public String toString() {
            return "Car{" + super.toString() + " max passenger's capacity=" + maxPassengerCapacity;
        }
    }
