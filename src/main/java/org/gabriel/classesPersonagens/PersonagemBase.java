package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;
import org.gabriel.classesMonstros.MonstroBase;

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

    // Para classes herdadas, devemos passar como tipo a classe Pai
    public int atacar() {
        int dado1 = (int) (Math.random() + (4 - 1)) + 1;
        int dado2 = (int) (Math.random() + (4 - 1)) + 1;
        if (dado1 == dado2) {
            return this.atributos.getDano() + 5;
        }
        return this.atributos.getDano();

    }

    // Fazer métodos padrões de ataque, fugir, abrir inventário, pular diálogo, toma dano, esta vivo, etc...
}

