package es.etg.psp.dmc.museo.salas;

public class Sala {

    private static int visitantes = 100;

    public static int getVisitantes() {
        return visitantes;
    }

    public static void setVisitantes(int visitantes) {
        Sala.visitantes = visitantes;
    }

    public static void entrar(){
        visitantes++;
    }

    public static void salir(){
        visitantes--;
    }
    
}
