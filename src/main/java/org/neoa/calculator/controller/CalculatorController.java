package org.neoa.calculator.controller;

import org.neoa.calculator.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    public String sum(@RequestParam("a") Integer a, @RequestParam(value = "b") Integer b) {
        return String.valueOf(calculator.sum(a,b));
    }

}
