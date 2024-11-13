package es.etg.psp.dmc.museo.salas.acciones;

import es.etg.psp.dmc.museo.salas.Sala;

public class Entrada implements Runnable{
    private static final boolean ENTRA = true;

    @Override
    public void run() {
        try {
            Sala.visitar(ENTRA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
