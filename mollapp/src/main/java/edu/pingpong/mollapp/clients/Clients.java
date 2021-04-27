package main.java.edu.pingpong.mollapp.clients;

import main.java.edu.pingpong.mollapp.administrador.ProgramadorTasques;

public interface Clients {

    public void setProgramadorTasques(ProgramadorTasques programadorTasques);

    public void enviarPeticio(String peticio);
}
