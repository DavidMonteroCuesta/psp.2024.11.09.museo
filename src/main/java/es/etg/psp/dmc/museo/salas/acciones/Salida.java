package es.etg.psp.dmc.museo.salas.acciones;

import es.etg.psp.dmc.museo.salas.Sala;

public class Salida implements Runnable{
    @Override
    public void run() {
        try {
            Sala.visitar(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
