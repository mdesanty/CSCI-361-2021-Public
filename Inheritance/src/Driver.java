import java.util.List;
import java.util.ArrayList;

public class Driver {
    private List<Vehicle> vehicles;

    public Driver() {
        vehicles = new ArrayList<Vehicle>();
        buildVehicles();
    }

    public void go() {        
        for(Vehicle vehicle: vehicles) {
            vehicle.go();
        }
    }

    private void buildVehicles() {
        vehicles.add(new Bicycle());
        vehicles.add(new Car());
    }    

    private abstract class Vehicle {
        protected int maxOccupants;
        protected int numberOfWheels;

        public Vehicle() {}

        public abstract void go();

        public int getMaxOccupants() {
            return maxOccupants;
        }

        public int getNumberOfWheels() {
            return numberOfWheels;
        }
    }

    private class Bicycle extends Vehicle {
        public Bicycle() {
            super();

            maxOccupants = 1;
            numberOfWheels = 2;
        }

        @Override
        public void go() {
            ringBell();
            pedal();            
        }

        private void ringBell() {
            System.out.println("Ring ring!!");
        }

        private void pedal() {
            System.out.println("Pedaling the bike!");
        }
    }

    private class Car extends Vehicle {
        public Car() {
            super();

            maxOccupants = 4;
            numberOfWheels = 4;
        }

        @Override
        public void go() {
            startEngine();
            pressGas();            
        }

        private void startEngine() {
            System.out.println("Vroom vroom!!");
        }

        private void pressGas() {
            System.out.println("Hitting the gas in the car!");
        }
    }
}