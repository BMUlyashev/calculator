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
    public String printSum(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        return calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String printDiff(@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2) {
        return calculatorService.getDiff(num1, num2);
    }

    @GetMapping("/multiply")
    public String printMultiply(@RequestParam(required = false) Integer num1,
                                @RequestParam(required = false) Integer num2) {
        return calculatorService.getMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String printDivide(@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2) {
        return  calculatorService.getDivide(num1, num2);
    }
}
