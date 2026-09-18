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

    public boolean guardarItem(Item item) {
        if (temEspaco(item)) {
            this.inventario.put(this.ultimaChaveCriada, item);
            this.ultimaChaveCriada++;
            this.pesoAtual = calculaPesoAtual();
            return true;
        }
        return false;
    }

    public boolean temEspaco(Item item) {
        int espacosLivres = calculaPesoPermitidoAlocar();
        int tamanhoMaxInventario = 30;
        return (this.inventario.size() < tamanhoMaxInventario) && (item.getPeso() < espacosLivres);
    }

    public boolean descartarItemSelecionado(int id) {
        if (this.inventario.isEmpty() || !inventario.containsKey(id)) {
            return false;
        }
        this.inventario.remove(id);
        this.pesoAtual = calculaPesoAtual();
        return true;
    }


    public void descartaAutomaticamente(int id) {
        if (inventario.get(id).getNumeroDeUsos() == 0) {
            this.inventario.remove(id);
            this.pesoAtual = calculaPesoAtual();
        }
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
            System.out.println("-".repeat(73));
            System.out.printf("%-3s %-20s %-50s%n", "ID", "NOME", "DESCRIÇÃO");
            System.out.println("-".repeat(73));
            for (Integer itemId : this.inventario.keySet()) {
                Item item = this.inventario.get(itemId);
                System.out.printf("%-3d %-20s %-50s%n", itemId, item.getNome(), item.getDescricao());
            }
        }
    }
}

