package org.example;

import org.junit.*;
import static org.junit.Assert.*;


public class AppTest {

    App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testIncrement() {
        assertEquals(1, app.increment());
        assertEquals(2, app.increment());
    }

    @Test
    public void testDecrement() {
        assertEquals(-1, app.decrement());
        assertEquals(-2, app.decrement());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide() {
        app.divide(1, 0);
    }

    @Test(timeout = 1000)
    public void testInfiniteLoop() {
        app.infiniteLoop();
    }

}
