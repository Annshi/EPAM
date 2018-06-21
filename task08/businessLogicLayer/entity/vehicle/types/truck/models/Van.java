package businessLogicLayer.entity.vehicle.types.truck.models;
import businessLogicLayer.entity.vehicle.types.truck.Truck;

public class Van extends Truck {
        private int size;
        public Van(int р, int f, int m, int c, int s) {
            super(р, f, m, c);
            size = s;
        }

        int getSize() {
            return size;
        }

        void setSize(int s) {
        size = s;
        }

        @Override
        public String toString() {
            return "Van{" + super.toString() + " size of van=" + size +"}}";
        }
    }

