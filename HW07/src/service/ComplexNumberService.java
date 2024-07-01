package service;

import model.ComplexNumber;

public class ComplexNumberService {

    public ComplexNumberService() {
    }

    public ComplexNumber createComplexNumbers(int a, int bi){
        return new ComplexNumber(a, bi);
    }

    public ComplexNumber pairComplexNumbers(ComplexNumber n){
        return new ComplexNumber(n.getA(), -n.getBi());
    }
}
