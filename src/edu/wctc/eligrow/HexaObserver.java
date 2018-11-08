package edu.wctc.eligrow;

/**
 * Converts Subject object to hexadecimal any time it is updated.
 * Extends Observer abstract method.
 * @author eplig
 * @version 1.0
 */
public class HexaObserver extends Observer{

    /**
     * Constructor for HexaObserver object. Accepts Subject object.
     * Attaches itself to subscriber list after instantiation.
     * @param subject Subject: Subject to get updates from.
     */
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Outputs Hexadecimal conversion of Subject state.
     */
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(
                subject.getState() ).toUpperCase() );
    }
}
