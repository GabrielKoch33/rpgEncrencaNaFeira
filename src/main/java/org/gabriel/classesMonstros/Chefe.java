package org.gabriel.classesMonstros;

import org.gabriel.classesMecanicas.Atributos;

public class Chefe extends MonstroBase {
    /**
     * Nome monstro é apenas uma forma de termos não apenas goblin nas telas
     * de exibição, podemos ter "Goblin bebê", "Goblin selvagem" etc
     * **/
    public Chefe(String nomeMonstro, String classe, boolean isBoss) {
        super(nomeMonstro, classe, isBoss);
        this.atributos = new Atributos(classe);
    }
}
