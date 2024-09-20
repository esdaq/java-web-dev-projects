package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsBeforeCharacters () {
        String message = "a set of balanced brackets before characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void nestedBracketsBeforeCharacters() {
        String message = "a set of nested balanced brackets before characters returns true";
        String testData = "[[]]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void nestedBracketsAfterCharacters() {
        String message = "a set of nested balanced brackets after characters returns true";
        String testData = "LaunchCode[[]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleNestedBracketsAfterCharacters() {
        String message = "a set of triple nested balanced brackets after characters returns true";
        String testData = "LaunchCode[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void balancedParenthesesBeforeCharacters() {
        String message = "a set of balanced parentheses before characters returns true";
        String testData = "()LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleUnbalancedCharactersBeforeCharacters() {
        String message = "a set of nested balanced brackets after characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleUnbalancedCharactersAfterCharacters() {
        String message = "single brackets after characters returns false";
        String testData = "LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void doubleUnbalancedCharactersAfterCharacters() {
        String message = "a set of double unbalanced brackets after characters returns false";
        String testData = "LaunchCode]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void balancedParenthesesBetweenCharacters() {
        String message = "a set of balanced parentheses between characters returns true";
        String testData = "Lau[nchC]ode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void mixedBalancedParenthesesBetweenCharacters() {
        String message = "a set of balanced parentheses between characters returns true";
        String testData = "Lau[(nchC)]ode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test public void mixOfUnbalancedBrackets() {
        String message = "mix of unbalanced brackets returns false";
        String testData = "[[]][][]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }



}