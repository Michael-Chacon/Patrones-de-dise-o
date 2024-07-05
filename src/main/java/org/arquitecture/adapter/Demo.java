package org.arquitecture.adapter;

import org.arquitecture.adapter.adapters.SquarePegAdapter;
import org.arquitecture.adapter.round.RoundHole;
import org.arquitecture.adapter.round.RoundPeg;
import org.arquitecture.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fit(rpeg)){
            System.out.println("La ficha de radio 5 cabe en el hoyo de radio 5");
        }

        SquarePeg smallsquare = new SquarePeg(2);
        SquarePeg largesquare = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallsquare);
        SquarePegAdapter largeSquarePagAdapter = new SquarePegAdapter(largesquare);
        if (hole.fit(smallSquarePegAdapter)){
            System.out.println("La clavija cuadrada w2 encaja en el orificio redondo r5.");
        }
        if (!hole.fit(largeSquarePagAdapter)){
            System.out.println("La clavija cuadrada w20 no encaja en el orificio redondo r5.");
        }
    }
}
