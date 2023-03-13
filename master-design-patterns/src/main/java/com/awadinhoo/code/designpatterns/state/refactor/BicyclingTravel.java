package com.awadinhoo.code.designpatterns.state.refactor;

public class BicyclingTravel implements TravelModeRefactor {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
