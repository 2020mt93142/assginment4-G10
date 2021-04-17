package impl;

import assignmentG10.vehicle.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void shiftGear() {
        System.out.println("Upgraded ver 2 of Shifting gear of Bike");
    }

    @Override
    public void applyBreak() {
        System.out.println("Upgraded ver 2 of Applying break for Bike");
    }

    @Override
    public void honkHorn() {
        System.out.println("Upgraded ver 2 of honk horn gear for Bike");
    }
}
