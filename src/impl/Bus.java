package impl;

import assignmentG10.vehicle.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void shiftGear() {
        System.out.println("Shifting gear of Bus");
    }

    @Override
    public void applyBreak() {
        System.out.println("Applying break for Bus");
    }

    @Override
    public void honkHorn() {
        System.out.println("honk horn gear for Bus");
    }
}
