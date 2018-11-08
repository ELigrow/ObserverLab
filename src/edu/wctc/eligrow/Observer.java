package edu.wctc.eligrow;

/**
 * Observer method that updates values based on changes in state.
 * @author eplig
 * @version 1.0
 */
public abstract class Observer {
    protected Subject subject;

    /**
     * Updates state according to observer
     */
    public abstract void update();
}

