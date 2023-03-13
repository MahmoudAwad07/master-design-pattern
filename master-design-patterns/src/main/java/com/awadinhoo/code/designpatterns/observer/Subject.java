package com.awadinhoo.code.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    boolean addObserver(Observer observer){
        observerList.add(observer);
        return true;
    }

    boolean deleteObserver(Observer observer){
        observerList.remove(observer);
        return true;
    }

    void notifyObservers(Stock stock){
        for (Observer observer :observerList){
            observer.update(stock);
        }
    }
}
