package org.gabriel.classesMonstros;

import org.gabriel.classesMecanicas.Atributos;

public class MonstroBase {
    protected String nomeMonstro;
    protected Atributos atributos;
    protected boolean isAlive;
    protected boolean isBoss;

    public MonstroBase(String nomeMonstro) {
        this.nomeMonstro = nomeMonstro;
        this.isAlive = true;
        this.isBoss = false;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }
}
