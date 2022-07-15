package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String getSum(Integer num1, Integer num2) {
        if ( num1 == null || num2 == null) {
            return "Ошибка! Проверьте правильность ввода параметров";
        } else {
            return String.format("%d + %d = %d", num1, num2, num1 + num2);
        }

    }

    @Override
    public String getDiff(Integer num1, Integer num2) {
        if ( num1 == null || num2 == null) {
            return "Ошибка! Проверьте правильность ввода параметров";
        } else {
            return String.format("%d - %d = %d", num1, num2, num1 - num2);
        }
    }

    @Override
    public String getMultiply(Integer num1, Integer num2) {
        if ( num1 == null || num2 == null) {
            return "Ошибка! Проверьте правильность ввода параметров";
        } else {
            return String.format("%d * %d = %d", num1, num2, num1 * num2);
        }
    }

    @Override
    public String getDivide(Integer num1, Integer num2) {
        if ( num1 == null || num2 == null) {
            return "Ошибка! Проверьте правильность ввода параметров";
        } else if (num2 == 0) {
            return "Ошибка! На 0 делить нельзя";
        } else {
            return String.format("%d / %d = %f", num1, num2, (float)num1 / num2);
        }
    }
}
