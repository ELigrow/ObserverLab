package edu.wctc.eligrow;

/**
 * Converts Subject object to octal any time it is updated.
 * Extends Observer abstract method.
 * @author eplig
 * @version 1.0
 */
public class OctalObserver extends Observer{

    /**
     * Constructor for OctalObserver object. Accepts Subject object.
     * Attaches itself to subscriber list after instantiation.
     * @param subject Subject: Subject to get updates from.
     */
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Outputs octal conversion of Subject state.
     */
    @Override
    public void update() {
        System.out.println("Octal: " +
                Integer.toOctalString(subject.getState() ) );
    }
}
