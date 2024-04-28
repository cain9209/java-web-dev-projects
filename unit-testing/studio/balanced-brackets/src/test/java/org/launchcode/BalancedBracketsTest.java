package org.launchcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.platform.commons.util.StringUtils.containsWhitespace;
import static org.junit.platform.commons.util.StringUtils.isNotBlank;
import static org.launchcode.BalancedBrackets.hasBalancedBrackets;

class BalancedBracketsTest {
    //TODO: add tests here
// Test 1//
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(hasBalancedBrackets("[]"));
    }
    // Test 2 //
    @Test
    public void emptyFunction(){
        assertEquals(true,true);
    }
    // Test 3 //
    @Test
    public void simplePassLaunchCodeTest(){
        assertTrue(hasBalancedBrackets("[LaunchCode]"));
        assertTrue(hasBalancedBrackets("Launch[Code]"));
        assertTrue(hasBalancedBrackets("[]"));
    }
    // Test 4 //
    @Test
    public void failLaunchCodeTest() {
        assertTrue(hasBalancedBrackets(""), "An empty string should be considered as having balanced brackets.");
    }
        // Test 5 //
    @Test
    public void integerIsZero() {
        int brackets = 0; // You need to initialize 'brackets' to some value to test it.
        assertEquals(0, brackets, "The value of brackets should be zero.");
    }
    // Test 6 //
    @Test
    public void testStringWithNoBrackets() {
        assertTrue(hasBalancedBrackets("Hello, world!"), "A string without brackets should be considered as having balanced brackets.");
    }
    @Test
    @DisplayName("Method returns False")
    public void bracketsTest(){
        assertFalse(hasBalancedBrackets( "[LaunchCode"));
        assertFalse(hasBalancedBrackets("Launch]Code[" ));
        assertFalse(hasBalancedBrackets( "["));
        assertFalse(hasBalancedBrackets( "]["));
    }

    }


}

