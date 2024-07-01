package service;

import model.ComplexNumber;

public class ComplexCalculatorService {

    public ComplexNumber sumComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        double a = n1.getA() + n2.getA();
        double bi = n1.getBi() + n2.getBi();
        return new ComplexNumber(a, bi);
    }

    public ComplexNumber difComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        double a = n1.getA() - n2.getA();
        double bi = n1.getBi() - n2.getBi();
        return new ComplexNumber(a, bi);
    }

    public  ComplexNumber multipComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        double p1 = n1.getA() * n2.getA();
        double p2 = n1.getA() * n2.getBi();
        double p3 = n1.getBi() * n2.getA();
        double p4 = -(n1.getBi() * n2.getBi());
        double a = p1 + p4;
        double bi = p2 + p3;
        return new ComplexNumber(a, bi);
    }

    public ComplexNumber divComplexNumbers(ComplexNumber n1, ComplexNumber n2){
        ComplexNumberService complexNumberService = new ComplexNumberService();
        ComplexNumber c1 = multipComplexNumbers(n1, complexNumberService.pairComplexNumbers(n2));
        ComplexNumber d1 = multipComplexNumbers(n2, complexNumberService.pairComplexNumbers(n2));
        double d = d1.getA() + d1.getBi();
        double a = c1.getA() / d;
        double bi = c1.getBi() / d;
        return new ComplexNumber(a, bi);
    }

    public StringBuilder builderComplex(int n1, int ni1, int oper, int n2, int ni2){
        StringBuilder builder = new StringBuilder();
        builder.append("(" + n1 + "," + ni1 + ")");
        String operation = "";
        switch (oper){
            case 1 -> operation = " + ";
            case 2 -> operation = " - ";
            case 3 -> operation = " * ";
            case 4 -> operation = " / ";
        }
        builder.append(operation);
        builder.append("(" + n2 + "," + ni2 + ")");
        builder.append(" Результат: ");
        return builder;
    }
}
