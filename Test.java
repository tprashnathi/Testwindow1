package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; // Import the Test annotation
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @Test // Marks the method as a test case
    public void testAddition() {
        // Arrange: Set up the necessary objects and data
        Test calculator = new Test();
        int expectedResult = 5;

        // Act: Call the method being tested
        int actualResult = calculator.add(2, 3);

        // Assert: Verify that the result is correct
        assertEquals(expectedResult, actualResult, "The addition result should be 5");
    }

    // You can add more test methods here, annotated with @Test
}
