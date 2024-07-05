package org.arquitecture.adapter.square;

public class SquarePeg {
    private double withd;

    public SquarePeg(double withd) {
        this.withd = withd;
    }

    public double getWithd() {
        return withd;
    }

    public double getSquare(){
        double resultado;
        resultado = Math.pow(this.withd, 2);
        return resultado;
    }
}
