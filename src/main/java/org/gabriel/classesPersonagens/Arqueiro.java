package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Arqueiro extends PersonagemBase {

    public Arqueiro(String classe) {
        super(classe);
        this.atributos = new Atributos(classe);
    }
}
