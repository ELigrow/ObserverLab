package edu.wctc.eligrow;

/**
 * Converts Subject object to binary any time it is updated.
 * Extends Observer abstract method.
 * @author eplig
 * @version 1.0
 */
public class BinaryObserver extends Observer{

    /**
     * Constructor for BinaryObserver object. Accepts Subject object.
     * Attaches itself to subscriber list after instantiation.
     * @param subject Subject: Subject to get updates from.
     */
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Outputs binary conversion of Subject state.
     */
    @Override
    public void update() {
        System.out.println( "Binary String: " +
                Integer.toBinaryString( subject.getState()));
    }
}
