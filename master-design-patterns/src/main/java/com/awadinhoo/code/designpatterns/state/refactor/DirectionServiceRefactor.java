package com.awadinhoo.code.designpatterns.state.refactor;

public class DirectionServiceRefactor {

    private final TravelModeRefactor travelModeRefactor;

    public DirectionServiceRefactor(TravelModeRefactor travelModeRefactor) {
        this.travelModeRefactor = travelModeRefactor;
    }

    public Object getEta() {
        return travelModeRefactor.getETA();
    }

    public Object getDirection() {
        return travelModeRefactor.getDirection();
    }

}
