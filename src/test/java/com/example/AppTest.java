package com.example;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Calculator")
@Feature("Addition")
class AppTest {

    @Test
    @Description("Verify simple integer addition")
    @Severity(SeverityLevel.CRITICAL)
    void addsTwoNumbers() {
        assertEquals(5, App.add(2, 3));
    }
}
