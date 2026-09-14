package org.gabriel.classesMecanicas;

import java.util.Map;
import java.util.HashMap;

public class Inventario {
    private int tamanhoAtual;
    private int pesoAtual;
    private int ultimaChaveCriada = 1;
    private final Map<Integer, Item> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void guardarItem(Item item) {
        this.inventario.put(this.ultimaChaveCriada, item);
        this.ultimaChaveCriada++;
        this.pesoAtual = calculaPesoAtual();
    }

    public boolean temEspaco(Item item) {
        int espacosLivres = calculaPesoPermitidoAlocar();
        int tamanhoMaxInventario = 30;
        return (this.inventario.size() < tamanhoMaxInventario) && (item.getPeso() < espacosLivres);
    }

    public boolean descartarItem(int id) {
        if (this.inventario.isEmpty() || !inventario.containsKey(id)) {
            return false;
        }
        this.inventario.remove(id);
        this.pesoAtual = calculaPesoAtual();
        return true;
    }

    public int calculaPesoAtual() {
        int pesoAtual = 0;
        for (Item item : this.inventario.values()) {
            pesoAtual += item.getPeso();
        }
        return pesoAtual;
    }

    public int calculaPesoPermitidoAlocar() {
        int pesoMaxInventario = 25;
        return pesoMaxInventario - calculaPesoAtual();
    }

    public void exibirInventario () {
        if (this.inventario.isEmpty()) {
            System.out.println("Inventário vazio, nada para exibir!");
        } else {
            System.out.println(" ID | NOME");
            for (Integer itemId : this.inventario.keySet()) {
                System.out.println(" " + itemId + " " + this.inventario.get(itemId));
            }
        }
    }
}

