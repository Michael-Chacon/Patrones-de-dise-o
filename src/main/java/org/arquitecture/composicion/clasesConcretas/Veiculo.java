package org.arquitecture.composicion.clasesConcretas;

import org.arquitecture.composicion.clasesConcretas.interfaces.Frenos;
import org.arquitecture.composicion.clasesConcretas.interfaces.Motor;

public class Veiculo {
    private Motor motor;
    private Frenos frenos;

    public Veiculo() {
    }

    public Veiculo(Motor motor, Frenos frenos) {
        this.motor = motor;
        this.frenos = frenos;
    }

    public void arrancar(){
        motor.arrancar();
    }

    public void frenar(){
        frenos.frenar();
    }

}
