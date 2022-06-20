package org.ron.examples;

public class CarUser {

    public static void main(String[] args) {
        CarUser carUser = new CarUser();
        carUser.createEngine();
        Car[] cars = carUser.createCars();
        carUser.showCars(cars);
    }

//    public Engine createEngine_v1() {
//        Engine e = new Engine();
//        e.setCc(2400);
//        e.setNumCylinders(6);
//        e.setType("V6");
//        return e;
//    }

    public Engine createEngine() {
        Engine engine = new Engine("V", 6, 2400);
        System.out.println(engine);
        return engine;
    }


    public Car[] createCars() {
        Engine beetleEngine = new Engine("S", 4, 1200);
        Engine mercEngine = new Engine("S", 4, 2000);
        Car car1 = new Car("VW", "Beetle", beetleEngine, "pink");
        Car car2 = new Car("Merc", "C180", mercEngine, "grey");
        Car car3 = new Car("Ford", "Fiesta", new Engine("V", 12, 3600), "orange");
        Car car4 = new Car("Toyota", "Corolla");

        Car cars[] = new Car[]{car1, car2, car3, car4};
        return cars;
    }

    public void showCars(Car[] vehicles) {

        for (int i = 0; i < vehicles.length; i++) {
            Car car = vehicles[i];
            System.out.println("i=" + i + " : " + car);
        }

        System.out.println();

        for (Car car : vehicles) {
            System.out.println(car);
        }
    }
}
