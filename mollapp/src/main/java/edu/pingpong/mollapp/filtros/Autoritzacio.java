package main.java.edu.pingpong.mollapp.filtros;

public class Autoritzacio implements Filtre {
    public Autoritzacio() {
    };

    @Override
    public void execucio(String missatge) {
        System.out.println("Autorización OK para " + missatge.toString());
    };
}
