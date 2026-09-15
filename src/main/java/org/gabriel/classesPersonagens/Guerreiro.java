package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Guerreiro extends PersonagemBase {

    public Guerreiro(String classe) {
        super(classe);
        this.atributos = new Atributos(classe);
        // new se encarrega de retornar ao objeto recém-criado os valores guardados com 'this.' na subclasse
        // Para classes herdadas, devemos passar como tipo do argumento a classe Pai
    }
}
