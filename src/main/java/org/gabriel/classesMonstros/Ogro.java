package org.gabriel.classesMonstros;

import org.gabriel.classesMecanicas.Atributos;

public class Ogro extends MonstroBase{
    private final String role;
    /**
     * Nome monstro é apenas uma forma de termos não apenas goblin nas telas
     * de exibição, podemos ter "Goblin bebê", "Goblin selvagem" etc
     * **/
    public Ogro(String nomeMonstro) {
        super(nomeMonstro);
        this.role = "Ogro";
        this.atributos = new Atributos(role);
    }
}
