package impl;

import assignmentG10.vehicle.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void shiftGear() {
        System.out.println("Upgraded Shifting gear of Bike");
    }

    @Override
    public void applyBreak() {
        System.out.println("Upgraded Applying break for Bike");
    }

    @Override
    public void honkHorn() {
        System.out.println("Upgraded honk horn gear for Bike");
    }
}
