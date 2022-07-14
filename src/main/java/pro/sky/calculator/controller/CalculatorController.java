package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String calculatorWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String printSum(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String printDiff(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getDiff(num1, num2);
    }

    @GetMapping("/multiply")
    public String printMultiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String printDivide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num2 == 0) {
            return "Ошибка! На 0 делить нельзя.";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.getDivide(num1, num2);
        }
    }
}
