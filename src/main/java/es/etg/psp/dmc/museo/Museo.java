package es.etg.psp.dmc.museo;

import es.etg.psp.dmc.museo.salas.Sala;
import es.etg.psp.dmc.museo.salas.acciones.Entrada;
import es.etg.psp.dmc.museo.salas.acciones.Salida;
import static es.etg.psp.dmc.museo.util.Texto.*;
public class Museo {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[CANT_VISITANTES_ENTRADA + CANT_VISITANTES_SALIDA];

        for (int i = VALOR_CERO; i < CANT_VISITANTES_ENTRADA + CANT_VISITANTES_SALIDA; i++){
            if (i < CANT_VISITANTES_ENTRADA) threads[i] = new Thread(new Entrada());
            else threads[i] = new Thread(new Salida());
            threads[i].start();
        }
            
        Thread.sleep(500);
        System.out.println(Sala.getVisitantes());
    }
}