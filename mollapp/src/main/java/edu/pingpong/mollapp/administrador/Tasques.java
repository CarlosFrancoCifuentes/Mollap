package main.java.edu.pingpong.mollapp.administrador;

import java.util.ArrayList;
import main.java.edu.pingpong.mollapp.tarjetas.Target;
import java.util.List;
import java.util.Optional;

import main.java.edu.pingpong.mollapp.filtros.Filtre;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();

    private Optional<Target> target;

    public Tasques() {
    };

    public List<Filtre> getTasques() {
        return this.tasques;
    };

    public Optional<Target> getTarget() {
        return this.target;
    };

    public void afegirTasca(Filtre filtre) {
        getTasques().add(filtre);
    };

    public void execucio(String missatge) {
        List<Filtre> tasques = getTasques();
        for (Filtre tasca : tasques) {
            if (getTarget().isPresent()) {
                tasca.execucio(missatge);
            }
        }

    };

    public void setTarget(Target vehicle) {
        this.target = Optional.ofNullable(vehicle);
    };
}
