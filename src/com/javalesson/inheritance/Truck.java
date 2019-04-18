package com.javalesson.inheritance;

public class Truck extends FuelAuto {

    private int cargoweight;

    public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int cargoweight) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.cargoweight = cargoweight;
        System.out.println("Truck was initialized");
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

