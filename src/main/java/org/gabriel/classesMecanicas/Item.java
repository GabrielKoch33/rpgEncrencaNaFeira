package org.gabriel.classesMecanicas;

public class Item {
    private String nome;
    private String descricao;
    private itemTipos tipo;
    private int peso;
    private double preco;
    private int numeroDeUsos;
    private boolean isDefault;
    private int dano;
    private int cura;

    /**Itens de uso ilimitado e defaults*/
    public Item (String nome, String descricao, itemTipos tipo, int peso,int valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.peso = peso;
        if (tipo.equals(itemTipos.CURA)) {
            this.cura = valor;
        } else if (tipo.equals(itemTipos.ARMA)) {
            this.dano = valor;
        }
        this.preco = 0.0;
        this.numeroDeUsos = 1000;
        this.isDefault = true;
    }
    /**Sobrescreve o valor padrão de (preço, num_usos e default) do construtor antigo para um personalizado**/
    public Item (String nome, String descricao, itemTipos tipo, int peso, double preco, int valor, int numeroDeUsos, boolean isDefault){
        this(nome, descricao, tipo, peso, valor);
        this.preco = preco;
        this.numeroDeUsos = numeroDeUsos;
        this.isDefault = isDefault;
    }

    public enum itemTipos {
        CURA,
        ARMA
    }

    public void decresceUsoItem(Item item) {
        item.setNumeroDeUsos(item.getNumeroDeUsos()-1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public itemTipos getTipo() {
        return tipo;
    }

    public void setTipo(itemTipos tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDeUsos() {
        return numeroDeUsos;
    }

    public void setNumeroDeUsos(int numeroDeUsos) {
        this.numeroDeUsos = numeroDeUsos;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
