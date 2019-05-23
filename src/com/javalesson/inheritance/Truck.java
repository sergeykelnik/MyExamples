package com.javalesson.inheritance;

public class Truck extends FuelAuto {

    private int cargoweight;

    public Truck(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int cargoweight) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.cargoweight = cargoweight;
        System.out.println("Truck was initialized");
    }

    @Override
    public void start() {
        isRunning=true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        isRunning=false;
        setCurrentSpeed(0);
        System.out.println("Truck has stopped");
    }

    public int getCargoweight() {
        return cargoweight;
    }

    public void setCargoweight(int cargoweight) {
        this.cargoweight = cargoweight;
    }

    public void load() {
        System.out.println("Cargo loaded");
    }

    public void unload() {
        System.out.println("Cargo unloaded");
    }

}

