package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;

public class PersonagemBase {
    protected double dinheiro;
    protected boolean isAlive;
    protected Inventario inventario;
    protected Atributos atributos;
    protected Cenario cenarioAtual;

    enum Cenario {
        LOJA,
        DIALOGO,
        COMBATE,
        INVENTARIO,
    }

    public PersonagemBase() {
        this.inventario = new Inventario();
        this.dinheiro = 50.0;
        this.cenarioAtual = Cenario.DIALOGO;
        this.isAlive = true;
    }

    public boolean temDinheiro(Item item) {
        return this.dinheiro >= item.getPreco();
    }

    public void gastarDinheiro(Item item) {
        this.dinheiro -= item.getPreco();
    }

    public void receberDinheiro(Item item) {
        this.dinheiro += item.getPreco();
    }

    // Fazer métodos padrões de ataque, fugir, abrir inventário, pular diálogo, toma dano, esta vivo, etc...
}

