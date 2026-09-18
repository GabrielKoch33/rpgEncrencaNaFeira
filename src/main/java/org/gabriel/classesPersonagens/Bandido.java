package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Bandido extends PersonagemBase {

    public Bandido(String classe) {
        super(classe);
        this.atributos = new Atributos(classe);
        this.MAXLIFE = this.atributos.getVitalidade();
    }
}
