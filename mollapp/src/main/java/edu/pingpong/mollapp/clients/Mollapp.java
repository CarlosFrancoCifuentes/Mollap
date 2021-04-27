package main.java.edu.pingpong.mollapp.clients;

import main.java.edu.pingpong.mollapp.administrador.ProgramadorTasques;

public class Mollapp implements Clients {

    public ProgramadorTasques programadorTasques = null;

    public Mollapp() {
    };

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    };

    @Override
    public void enviarPeticio(String peticio) {
        programadorTasques.executarTasques(peticio);
    };
}
