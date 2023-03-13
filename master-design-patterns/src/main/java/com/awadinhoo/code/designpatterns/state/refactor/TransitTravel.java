package com.awadinhoo.code.designpatterns.state.refactor;

public class TransitTravel implements TravelModeRefactor {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
