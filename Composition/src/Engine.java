public class Engine {
    private int horsePower;
    private int numberOfCylinders;

    public Engine() {}

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;        
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    @Override
    public String toString() {
        return getNumberOfCylinders() + " cylinder " + getHorsePower() + " hp engine";
    }
}