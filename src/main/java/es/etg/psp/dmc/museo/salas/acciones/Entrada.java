package es.etg.psp.dmc.museo.salas.acciones;

import es.etg.psp.dmc.museo.salas.Sala;

public class Entrada implements Runnable{
    @Override
    public void run() {
        Sala.visitar(true);
    }
}
