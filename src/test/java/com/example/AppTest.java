package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.qameta.allure.Description;

public class AppTest {

    @Test
    @Description("Verify that addition works correctly")
    public void testAddition() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    @Description("Check failure for demo")
    public void testFailure() {
        assertEquals(10, App.add(2, 3), "Intentional failure to test report");
    }
}
