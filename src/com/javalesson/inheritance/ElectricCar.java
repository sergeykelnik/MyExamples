package com.javalesson.inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passagersNumber;

    public ElectricCar(String producer, String model, int batteryVolume, int passagersNumber) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passagersNumber = passagersNumber;
        System.out.println("ElectricCar was initialized");
    }

    public void charge(){
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassagersNumber() {
        return passagersNumber;
    }

    public void setPassagersNumber(int passagersNumber) {
        this.passagersNumber = passagersNumber;
    }
}
