package sem2.lesson1;

public class Controller {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("SomeName");
        car.setModel("SomeModel");
        System.out.println(car.getName());
        System.out.println(car.getModel());

        Controller mc = new Controller();
        mc.buy(car);
    }

    public Car buy(Car car) {
        car.setSoled(true);
        return car;
    }
}
