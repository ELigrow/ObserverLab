package edu.wctc.eligrow;
import java.util.ArrayList;
import java.util.List;

/**
 * Subject object that updates subscribers upon state change.
 * @author eplig
 * @version 1.0
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(int index){
        observers.remove(index);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}