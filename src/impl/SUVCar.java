package impl;

import assignmentG10.vehicle.Vehicle;

public class SUVCar implements Vehicle {

    @Override
    public void shiftGear() {
        System.out.println("Shifting gear of SUV");
    }

    @Override
    public void applyBreak() {
        System.out.println("Applying break for SUV");
    }

    @Override
    public void honkHorn() {
        System.out.println("honk horn gear for SUV");
    }
}
