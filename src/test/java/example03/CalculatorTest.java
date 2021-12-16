package example03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumOfTwoNumbers() {
        //arrange
        double first = 10;
        double second = 20;
        var calculator = new Calculator();

        //act
        var result = calculator.sum(first, second);

        //assert
        assertEquals(30, result);
    }

}