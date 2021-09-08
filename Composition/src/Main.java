public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testCar();
    }

    public void testCar() {
        Engine engine = new Engine();
        engine.setHorsePower(190);
        engine.setNumberOfCylinders(4);

        Car car = new Car();

        car.setColor("Green");
        car.setYear(2021);
        car.setMake("Honda");
        car.setModel("CR-V");
        car.setEngine(engine);

        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getEngine());
        System.out.println();

        System.out.println(car);
    }
}