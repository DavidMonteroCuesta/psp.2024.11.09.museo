package es.etg.psp.dmc.museo;

import es.etg.psp.dmc.museo.salas.Sala;
import es.etg.psp.dmc.museo.salas.acciones.Entrada;
import es.etg.psp.dmc.museo.salas.acciones.Salida;
import static es.etg.psp.dmc.museo.util.Texto.*;
public class Museo {
    public static void main(String[] args) {
        for (int i = VALOR_CERO; i < CANT_VISITANTES_ENTRADA; i++) {
            Thread entrada = new Thread(new Entrada());
            entrada.start();
        }

        for (int i = VALOR_CERO; i < CANT_VISITANTES_SALIDA; i++) {
            Thread salida = new Thread(new Salida());
            salida.start();
        }

        System.out.println(Sala.getVisitantes());
    }
}