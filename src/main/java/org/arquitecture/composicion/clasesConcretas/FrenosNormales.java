package org.arquitecture.composicion.clasesConcretas;

import org.arquitecture.composicion.clasesConcretas.interfaces.Frenos;

public class FrenosNormales implements Frenos {
    @Override
    public void frenar() {
        System.out.println("Frenar con frenos normales");
    }
}
