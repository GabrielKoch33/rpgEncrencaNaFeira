package org.gabriel.classesMonstros;

import org.gabriel.classesMecanicas.Atributos;

public class Goblin extends MonstroBase {
    private final String role;
    /**
     * Nome monstro é apenas uma forma de termos não apenas goblin nas telas
     * de exibição, podemos ter "Goblin bebê", "Goblin selvagem" etc
     * **/
    public Goblin(String nomeMonstro) {
        super(nomeMonstro);
        this.role = "Goblin";
        this.atributos = new Atributos(role);
    }
}
