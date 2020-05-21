package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {

    FizzBuzz tester;

    @BeforeEach
    public  void setup() {
        tester = new FizzBuzz();
    }


    @Test
    public void GivenNotMultiplicationOfThreeFiveSeven_WhenReport_ThenReturnNumber() {
        int[] testInputs = {1, 4, 22};

        for (int n : testInputs) {
            assertEquals(String.valueOf(n), tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfThree_WhenReport_ThenReturnFizz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "Fizz";
        int[] testInputs = {3, 6, 33};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfFive_WhenReport_ThenReturnBuzz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "Buzz";
        int[] testInputs = {5, 10, 50};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfSeven_WhenReport_ThenReturnWhizz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "Whizz";
        int[] testInputs = {7, 14, 28};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfThreeFive_WhenReport_ThenReturnFizzBuzz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "FizzBuzz";
        int[] testInputs = {15, 45, 75};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfThreeSeven_WhenReport_ThenReturnFizzWhizz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "FizzWhizz";
        int[] testInputs = {21, 63, 147};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfFiveSeven_WhenReport_ThenReturnBuzzWhizz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "BuzzWhizz";
        int[] testInputs = {35, 245, 175};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }

    @Test
    public void GivenOnlyMultiplicationOfThreeFiveSeven_WhenReport_ThenReturnFizzBuzzWhizz() {
        FizzBuzz tester       = new FizzBuzz();
        String   shouldReturn = "FizzBuzzWhizz";
        int[] testInputs = {105, 525, 3675};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.reportNumber(n));
        }
    }
}