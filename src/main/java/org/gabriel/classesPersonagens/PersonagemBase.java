package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;

public class PersonagemBase {
    protected String nomePlayer;
    protected double dinheiro;
    protected String classePlayer;
    protected boolean isAlive;
    protected Inventario inventario;
    protected Atributos atributos;
    protected Cenario cenarioAtual;
    protected int MAXLIFE;

    public enum Cenario {
        LOJA,
        DIALOGO,
        COMBATE,
        INVENTARIO,
    }

    public PersonagemBase(String classe) {
        this.inventario = new Inventario();
        this.dinheiro = 50.0;
        this.classePlayer = classe;
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


    public int getMAXLIFE() {
        return MAXLIFE;
    }

    public String getNome() {
        return nomePlayer;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public String getClassePlayer() {
        return classePlayer;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public Cenario getCenarioAtual() {
        return cenarioAtual;
    }

    public void setNome(String nomePlayer) {
        this.nomePlayer = nomePlayer;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void setClassePlayer(String classe) {
        this.classePlayer = classe;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public void setCenarioAtual(Cenario cenarioAtual) {
        this.cenarioAtual = cenarioAtual;
    }
}

