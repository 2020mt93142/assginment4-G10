package impl;

import assignmentG10.vehicle.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void shiftGear() {
        System.out.println("Upgrading ver 2 Shifting gear of Bus");
    }

    @Override
    public void applyBreak() {
        System.out.println("Upgrading ver 2 Applying break for Bus");
    }

    @Override
    public void honkHorn() {
        System.out.println(" Upgrading ver 2 honk horn gear for Bus");
    }
}
