package org.arquitecture.composicion.clasesConcretas;

import org.arquitecture.composicion.clasesConcretas.*;
import org.arquitecture.composicion.clasesConcretas.interfaces.Frenos;
import org.arquitecture.composicion.clasesConcretas.interfaces.Motor;

public class Main {
    public static void main(String[] args) {
        Motor motorElectrico = new MotorElectrico();
        Frenos frenoABS = new FrenosABS();
        Veiculo veiculoUno = new Veiculo(motorElectrico, frenoABS);
        veiculoUno.arrancar();
        veiculoUno.frenar();

        System.out.println();

        Motor motorGasolina = new MotorGasolina();
        Frenos frenosNormales = new FrenosNormales();
        Veiculo veiculoDos = new Veiculo(motorGasolina, frenosNormales);
        veiculoDos.arrancar();
        veiculoDos.frenar();
    }
}