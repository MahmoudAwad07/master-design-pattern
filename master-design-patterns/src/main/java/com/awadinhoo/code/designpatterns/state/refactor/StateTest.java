package com.awadinhoo.code.designpatterns.state.refactor;

import com.awadinhoo.code.designpatterns.state.DirectionService;
import com.awadinhoo.code.designpatterns.state.TravelMode;

public class StateTest {


    public static void main (String[] args){

        // Old Code
        DirectionService directionService = new DirectionService();
        directionService.setTravelMode(TravelMode.WALKING);
        directionService.getEta();
        directionService.getDirection();

        System.out.println("*************************");

        // State Design Pattern Code
        DirectionServiceRefactor directionServiceRefactor = new DirectionServiceRefactor(new WalkingTravel());
        directionServiceRefactor.getEta();
        directionServiceRefactor.getDirection();

    }
}
