package org.arquitecture.adapter.round;

public class RoundHole {
    private double radio;

    public RoundHole(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean fit(RoundPeg peg){
        boolean resultado;
        resultado = (this.getRadio() >= peg.getRadio());
        return resultado;
    }

}
