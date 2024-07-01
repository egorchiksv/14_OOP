package controller;

import model.ComplexNumber;
import service.ComplexNumberService;

public class ComplexNumberController {
    private ComplexNumberService complexNumberService = new ComplexNumberService();

    public ComplexNumber createComplexNumbers(int a, int bi){
        return complexNumberService.createComplexNumbers(a, bi);
    }
}
