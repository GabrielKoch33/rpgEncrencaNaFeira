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

    public int atacar() {
        int dado1 = (int) (Math.random() + (4 - 1)) + 1;
        int dado2 = (int) (Math.random() + (4 - 1)) + 1;
        if (dado1 == dado2) {
            return this.atributos.getDano() + 5;
            // Mecânica simples de dano crítico
        }
        return this.atributos.getDano();
    }

    public boolean fugir() {
        int dado1 = (int) (Math.random() * 10) + 1;
        return dado1 == 7;
    }

    // Avaliando possível necessidade desse método
    public void abrirInventario () {
        this.inventario.exibirInventario();
    }

    public void tomarDano(int danoInimigo) {
        // Não se pode usar -=, --, += ou ++ diretamente em retorno de métodos getters,
        // até porque essa sintaxe necessita de uma variável à esquerda
        int vidaReduzida = this.atributos.getVitalidade() - danoInimigo;
        if (vidaReduzida > 0) {
            this.atributos.setVitalidade(vidaReduzida);
        } else {
            this.atributos.setVitalidade(0);
            this.isAlive = false;
        }
    }
}

