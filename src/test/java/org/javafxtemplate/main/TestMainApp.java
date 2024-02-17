package org.javafxtemplate.main;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit tests for MainApp application.
 */
public class TestMainApp {

    @Test
    public void exampleTest() {
        final MainApp app = new MainApp();
        assertFalse("Button initializes unclicked", app.buttonWasClicked());
    }
}
