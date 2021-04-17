package impl;

import assignmentG10.vehicle.Vehicle;

public class Van implements Vehicle {

    @Override
    public void shiftGear() { System.out.println("Updated 2.0 - Shifting gear of Van");
    }

    @Override
    public void applyBreak() {
        System.out.println("Updated 2.0 - Applying break for Van");
    }

    @Override
    public void honkHorn() {
        System.out.println("Updated 2.0 -honk horn gear for Van");
    }
}
