package org.gabriel.classesMonstros;

import org.gabriel.classesMecanicas.Atributos;

public class Ritualista extends MonstroBase {
    private final String role;
    /**
     * Nome monstro é apenas uma forma de termos não apenas goblin nas telas
     * de exibição, podemos ter "Goblin bebê", "Goblin selvagem" etc
     * **/
    public Ritualista(String nomeMonstro) {
        super(nomeMonstro);
        this.role = "Ritualista";
        this.atributos = new Atributos(role);
    }
}
