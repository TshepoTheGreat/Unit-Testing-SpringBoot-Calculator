package za.co.tshepo.tshepounittest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class SimpleCalculatorTests {

    @Autowired
    CalculatorService simpleCalculation;

    @Test
    void addNumbers (){
        int x = 5;
        int y = 8;

        double result = simpleCalculation.addition(x,y);
        
        assertEquals(result,13);
    }
    @Test
    void subtractNumbers() {
        int x = 10;
        int y = 20;

        double result = simpleCalculation.subtract(x,y);

        assertEquals(result, -10);
    }

    @Test
    void multiplyNumbers() {
        int x = 10;
        int y = 20;

        double result = simpleCalculation.multiply(x,y);

        assertEquals(result, 200);
    }

    @Test
    void divideNumbers() {
        int x = 10;
        int y = 20;

        double result = simpleCalculation.divide(x,y);

        assertEquals(result, 0.5);
    }

    @Test
    void divideByZero_ForPositiveInfinite() {
        int x = 10;
        int y = 0;

        double result = simpleCalculation.divide(x,y);

        assertEquals(result, Double.POSITIVE_INFINITY);
    }

    @Test
    void divideByZero_ForNegativeInfinite() {
        int x = -10;
        int y = 0;

        double result = simpleCalculation.divide(x,y);

        assertEquals(result, Double.NEGATIVE_INFINITY);
    }

    @Test
    void divideZeroByZero_ForNotANumber() {
        int x = 0;
        int y = 0;

        double result = simpleCalculation.divide(x,y);

        assertEquals(result, Double.NaN);
    }
}
