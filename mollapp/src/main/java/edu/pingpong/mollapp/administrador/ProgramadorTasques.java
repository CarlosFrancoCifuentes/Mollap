package main.java.edu.pingpong.mollapp.administrador;

import main.java.edu.pingpong.mollapp.filtros.Filtre;
import main.java.edu.pingpong.mollapp.tarjetas.Target;

public class ProgramadorTasques {

    private Tasques tasques = null;

    public ProgramadorTasques(Target vehicle) {
        tasques = new Tasques();
        tasques.setTarget(vehicle);
    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void setTasca(Filtre filtre) {
        getTasques().afegirTasca(filtre);
    }

    public void executarTasques(String missatge) {
        tasques.execucio(missatge);
    }
}
