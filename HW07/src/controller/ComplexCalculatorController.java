package controller;

import model.ComplexNumber;
import service.ComplexCalculatorService;

public class ComplexCalculatorController {
    private ComplexCalculatorService complexCalculatorService = new ComplexCalculatorService();

    public ComplexNumber sumComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        return complexCalculatorService.sumComplexNumbers(n1, n2);
    }

    public ComplexNumber difComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        return complexCalculatorService.difComplexNumbers(n1, n2);
    }

    public ComplexNumber multipComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        return complexCalculatorService.multipComplexNumbers(n1, n2);
    }

    public ComplexNumber divComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        return complexCalculatorService.divComplexNumbers(n1, n2);
    }

    public StringBuilder builderComplex(int n1, int ni1, int oper, int n2, int ni2){
        return complexCalculatorService.builderComplex(n1, ni1, oper, n2, ni2);
    }
}
