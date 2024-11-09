package es.etg.psp.dmc.museo;

import es.etg.psp.dmc.museo.salas.Sala;
import es.etg.psp.dmc.museo.salas.acciones.Entrada;
import es.etg.psp.dmc.museo.salas.acciones.Salida;
import static es.etg.psp.dmc.museo.util.Texto.*;
public class Museo {
    public static void main(String[] args) {
        Thread[] entradas = new Thread[CANT_VISITANTES_ENTRADA];
        Thread[] salidas = new Thread[CANT_VISITANTES_SALIDA];

        for (int i = VALOR_CERO; i < CANT_VISITANTES_ENTRADA; i++) {
            entradas[i] = new Thread(new Entrada());
            entradas[i].start();
        }

        for (int i = VALOR_CERO; i < CANT_VISITANTES_SALIDA; i++) {
            salidas[i] = new Thread(new Salida());
            salidas[i].start();
        }

        System.out.println(Sala.getVisitantes());
    }
}