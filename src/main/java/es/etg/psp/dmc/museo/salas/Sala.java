package es.etg.psp.dmc.museo.salas;

public class Sala {

    private static int visitantes = 100;

    public static int getVisitantes() {
        return visitantes;
    }

    public static void setVisitantes(int visitantes) {
        Sala.visitantes = visitantes;
    }

    public synchronized static void visitar(boolean entra) throws InterruptedException{
        while (visitantes <= 0 && !entra)
            Sala.class.wait();

        if (entra) visitantes++;
        else visitantes--;
        Sala.class.notify();
        System.out.println(Thread.currentThread().getName());
    }    
}