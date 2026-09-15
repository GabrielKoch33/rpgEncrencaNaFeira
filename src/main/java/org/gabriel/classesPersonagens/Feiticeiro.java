package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Feiticeiro extends PersonagemBase {

    public Feiticeiro(String classe) {
        super(classe);
        this.atributos = new Atributos(classe);
    }
}
