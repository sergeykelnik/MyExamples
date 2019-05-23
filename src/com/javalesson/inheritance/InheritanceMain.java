package com.javalesson.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Engine truckEngine = new Engine(3, EngineType.DIESEL, 100);
        Truck truck = new Truck("ZIL", "130G", truckEngine, 45, 120, 5000);
        /*truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(400);
        truck.load();
        truck.unload();
        truck.getEngine();*/

        Engine carEngine = new Engine(0, EngineType.ELECTRIC, 500);
        ElectricCar car = new ElectricCar("Tesla", "Model S", 4000, 4);
        /*car.start();
        car.stop();
        car.charge();
        car.setBatteryVolume(5000);
        System.out.println(car.getBatteryVolume());*/

        Engine busEngine = new Engine(2, EngineType.GASOLINE, 150);
        Bus bus = new Bus("Mercedes", "Sprinter", busEngine, 10, 80, 10);
        /*bus.start();
        bus.releasePassengers(11);
        bus.pickUpPassengers(1);
        bus.stop();
        bus.fuelUp();*/

        runCar(bus);
        runCar(truck);
        runCar(car);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        if(auto instanceof FuelAuto){
            FuelAuto fuelAuto = (FuelAuto) auto;
            fuelAuto.fuelUp(50);

        }
    }
}
