package za.co.tshepo.tshepounittest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double addition(int num1, int num2) {
        return Double.valueOf(num1) + Double.valueOf(num2);
    }

    public double subtract(int num1, int num2) {
        return Double.valueOf(num1) - Double.valueOf(num2);
    }

    public double multiply(int num1, int num2) {
        return Double.valueOf(num1) * Double.valueOf(num2);
    }

    public double divide(int num1, int num2) {
        return Double.valueOf(num1) / Double.valueOf(num2);
    }
}
