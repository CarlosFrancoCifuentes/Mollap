package edu.pingpong.mollapp;

import org.junit.Test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Assert.*;

import main.java.edu.pingpong.mollapp.administrador;
import main.java.edu.pingpong.mollapp.filtros;

public class TasquesTest {

    @Before
    public void setup() {
        Tasques tasques = new Tasques();
        Filtre filtreAuten = new Autenticacio();
        Filtre filtreAutor = new Autoritzacio();
    }

    @Test
    public void getTasquesTest() {
        tasques.afegirTasca(filtreAuten);
        tasques.afegirTasca(filtreAutor);
        List<Filter> filtro = new ArrayList<>();
        filtro.add(filtreAuten);
        filtro.add(filtreAutor);
        assertEquals(tasques.getTasques(), filtro);
    }

    @Test
    public void getTarget(){
        Target target = new Coche();
        tasques.setTarget(target);
        Target coche = new Coche();
        assertEquals(tasques.getTarget(), coche);
    }
}
