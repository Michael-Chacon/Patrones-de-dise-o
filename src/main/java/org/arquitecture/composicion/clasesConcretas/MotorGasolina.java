package org.arquitecture.composicion.clasesConcretas;

import org.arquitecture.composicion.clasesConcretas.interfaces.Motor;

public class MotorGasolina implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Arrancar el carro con motor a GASOLINA");
    }
}
