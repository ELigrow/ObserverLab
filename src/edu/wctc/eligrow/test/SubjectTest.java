package edu.wctc.eligrow.test;

import edu.wctc.eligrow.Subject;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectTest extends TestCase {

    Subject test;

    @Before
    public void setUp() throws Exception {
        test = new Subject();
        test.setState(42);
    }

    @Test
    public void testGetState() {
        assertEquals(42, test.getState());
    }
}