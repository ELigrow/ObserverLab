package edu.wctc.eligrow;

/**
 * Determines whether the Subject is a positive, negative, or zero
 * Extends Observer abstract method.
 * @author eplig
 * @version 1.0
 */
public class StateObserver extends Observer {

    /**
     * Constructor for BinaryObserver object. Accepts Subject object.
     * Attaches itself to subscriber list after instantiation.
     * @param subject Subject: Subject to get updates from.
     */
    public StateObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Outputs positive, negative, or zero based on Subject.
     */
    @Override
    public void update() {
        if(subject.getState() > 0){
            System.out.println("This is a positive number.");
        } else if(subject.getState() < 0){
            System.out.println("This is a negative number.");
        } else {
            System.out.println("This is neither positive or negative. It is zero.");
        }
    }
}
