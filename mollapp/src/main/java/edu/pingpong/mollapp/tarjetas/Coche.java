package main.java.edu.pingpong.mollapp.tarjetas;

public class Coche implements Target {

    public Coche() {
    };

    @Override
    public void execucio(String missatge) {
        System.out.println("Puerta abiera " + missatge.toString() + "!");
    };
}
