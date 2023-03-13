package com.awadinhoo.code.designpatterns.state.refactor;

public class DrivingTravel implements TravelModeRefactor {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
