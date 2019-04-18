package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passengersNumber;


    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengersNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengersNumber = passengersNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);

    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengersNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passangers");
    }

    public void releasePassengers(int passengersNum) {
        if (isRunning == true) {
            stop();
        }
        this.passengersNumber = 0;
        System.out.println("Passengers released");
    }
}
