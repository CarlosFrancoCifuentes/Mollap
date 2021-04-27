package main.java.edu.pingpong.mollapp.filtros;

public class Autenticacio implements Filtre {

    public Autenticacio() {
    };

    @Override
    public void execucio(String missatge) {
        System.out.println("Autenticación OK para " + missatge.toString());
    };
}
