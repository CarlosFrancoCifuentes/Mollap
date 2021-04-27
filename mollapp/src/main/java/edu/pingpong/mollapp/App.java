package main.java.edu.pingpong.mollapp;

import main.java.edu.pingpong.mollapp.administrador.ProgramadorTasques;
import main.java.edu.pingpong.mollapp.clients.Mollapp;
import main.java.edu.pingpong.mollapp.filtros.Autenticacio;
import main.java.edu.pingpong.mollapp.filtros.Autoritzacio;
import main.java.edu.pingpong.mollapp.tarjetas.Coche;

public class App {
    public static void main(String[] args) {
        /**
         * Configuració del programador de tasques del sistema amb el tipus de target
         * triat: des de vehicles a qualsevol cosa que admiteix la recepció d'un
         * missatge.
         */

        ProgramadorTasques programadorTasques = new ProgramadorTasques(new Coche());

        /**
         * Afegir al sistema les tasques que volem que el sistema executi al rebre la
         * petició del client.
         */
        programadorTasques.setTasca(new Autenticacio());
        programadorTasques.setTasca(new Autoritzacio());

        /**
         * Configuració de l'app client per a que executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgramadorTasques(programadorTasques);
        mollapp.enviarPeticio("Francesc");
    }
}
