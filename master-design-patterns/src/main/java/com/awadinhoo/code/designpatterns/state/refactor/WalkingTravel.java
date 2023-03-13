package com.awadinhoo.code.designpatterns.state.refactor;

public class WalkingTravel implements TravelModeRefactor {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
