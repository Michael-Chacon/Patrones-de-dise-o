package org.arquitecture.adapter.adapters;

import org.arquitecture.adapter.round.RoundPeg;
import org.arquitecture.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((peg.getWithd() / 2), 2) * 2));
        return resultado;
    }
}
