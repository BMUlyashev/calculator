package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int getSum(Integer num1, Integer num2) {
        return num1 + num2;

    }

    @Override
    public int getDiff(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public float getDivide(Integer num1, Integer num2) {
        return (float)num1 / num2;
    }
}
