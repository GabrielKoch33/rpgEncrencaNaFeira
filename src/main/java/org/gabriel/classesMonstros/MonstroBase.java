package org.gabriel.classesMonstros;

import org.gabriel.classesMecanicas.Atributos;

public class MonstroBase {
    protected String nomeMonstro;
    protected String classe;
    protected Atributos atributos;
    protected boolean isAlive;
    protected boolean isBoss;

    public MonstroBase(String nomeMonstro, String classe, boolean isBoss) {
        this.nomeMonstro = nomeMonstro;
        this.classe = classe;
        this.isAlive = true;
        this.isBoss = isBoss;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public String getNomeMonstro() {
        return nomeMonstro;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setNomeMonstro(String nomeMonstro) {
        this.nomeMonstro = nomeMonstro;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
