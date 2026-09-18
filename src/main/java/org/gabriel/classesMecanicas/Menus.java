package org.gabriel.classesMecanicas;

public class Menus {
    private final int repeat = 30;

    public void menuEscolheClasse () {

    }

    public void menuInventario() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - DESCARTAR ITEM");
        System.out.println("[2] - USAR ITEM");
        System.out.println("[3] - SAIR");
        System.out.println("-".repeat(repeat));
    }

    public void menuLoja() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - VENDER ITEM");
        System.out.println("[2] - COMPRAR ITEM");
        System.out.println("[3] - SAIR");
        System.out.println("-".repeat(repeat));
    }

    public void menuDialogo() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - PULAR DIÁLOGO");
        System.out.println("[2] - CONTINUAR LENDO");
        System.out.println("-".repeat(repeat));
    }

    public void menuCombate() {
        System.out.println("-".repeat(repeat));
        System.out.println("[1] - ATACAR");
        System.out.println("[2] - ESQUIVAR");
        System.out.println("[3] - DEFENDER");
        System.out.println("[4] - FUGIR");
        System.out.println("[5] - USAR ITEM");
        System.out.println("-".repeat(repeat));
    }
}
