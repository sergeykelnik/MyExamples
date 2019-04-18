package com.javalesson.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Truck truck = new Truck("ZIL", "130G", EngineType.DIESEL, 45, 120, 5000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(400);
        truck.load();
        truck.unload();
        ElectricCar car = new ElectricCar("Tesla", "Model S", 4000, 4);
        car.start();
        car.stop();
        car.charge();
        Bus bus = new Bus("Mercedes", "Sprinter", EngineType.DIESEL, 10, 80, 10);
        bus.start();
        bus.releasePassengers(11);
        bus.pickUpPassengers(1);
        bus.stop();
        bus.fuelUp();
    }
}
