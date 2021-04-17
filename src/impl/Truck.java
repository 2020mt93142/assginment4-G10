package impl;

import assignmentG10.vehicle.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void shiftGear() {
        System.out.println("Shifting gear of Truck");
    }

    @Override
    public void applyBreak() {
        System.out.println("Applying break for Truck");
    }

    @Override
    public void honkHorn() {
        System.out.println("honk horn gear for Truck");
    }
}

