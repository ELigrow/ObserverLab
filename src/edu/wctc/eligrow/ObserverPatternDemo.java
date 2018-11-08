package edu.wctc.eligrow;

import javax.swing.plaf.nimbus.State;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        new StateObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: -10");
        subject.detach(1);
        System.out.println("Octal will no longer print. It has been detached.");
        subject.setState(-10);
        System.out.println("Second state change: 0");
        subject.setState(0);
    }
}
