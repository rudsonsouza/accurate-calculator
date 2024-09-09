package com.accurate.calculator.controllers;

import com.accurate.calculator.services.CalculatorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/sum")
    public double sum(@RequestParam int a, @RequestParam int b) {
        log.debug("GET sum number a and b received {} {}", a, b);

        return calculatorService.sum(a, b);
    }

    @GetMapping("/substract")
    public double subtract(@RequestParam int a, @RequestParam int b) {
        log.debug("GET substract number a and b received {} {}", a, b);

        return calculatorService.substract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam int a, @RequestParam int b) {
        log.debug("GET multiply number a and b received {} {}", a, b);

        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        log.debug("GET divide number a and b received {} {}", a, b);

        return calculatorService.divide(a, b);
    }
}
