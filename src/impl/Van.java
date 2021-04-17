package impl;

import assignmentG10.vehicle.Vehicle;

public class Van implements Vehicle {

    @Override
    public void shiftGear() {
        System.out.println("Shifting gear of Van");
    }

    @Override
    public void applyBreak() {
        System.out.println("Applying break for Van");
    }

    @Override
    public void honkHorn() {
        System.out.println("honk horn gear for Van");
    }
}
