package model;

public class ComplexNumber {
    private double a;
    private double bi;

    public ComplexNumber(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }

    public double getA() {
        return a;
    }

    public double getBi() {
        return bi;
    }

    @Override
    public String toString() {
        return "a=" + a +
               ", bi=" + bi;
    }
}
