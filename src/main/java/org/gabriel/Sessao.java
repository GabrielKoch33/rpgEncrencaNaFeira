package org.gabriel;

import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;
import org.gabriel.classesMecanicas.Loja;
import org.gabriel.classesMonstros.MonstroBase;
import org.gabriel.classesPersonagens.*;

import java.util.Scanner;

public class Sessao {
    public static final String PRETO = "\u001B[30m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIANO = "\u001B[36m";
    public static final String BRANCO = "\u001B[37";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Item fruta = new Item("Maçã", "Uma deliciosa fruta fresca", Item.itemTipos.CURA, 1, 15);
        Item guardaChuva = new Item("Guarda-Chuva", "Um guarda-chuva bem pontudo", Item.itemTipos.ARMA, 5, 20);
        Scanner ler = new Scanner(System.in);
        int opcao;
        String nome;

        System.out.println(AMARELO + "***Sons de despertados apitando***" + RESET);
        System.out.println("-> Q-Que horas são?!? Só 7 AM? Poxa, hoje é sábado, esqueci de configurar o despertador...");
        System.out.println("-> Mas nossa, que noite boa! Cheguei até a sonhar...");
        System.out.println("-> O que eu estava fazendo no meu sonho mesmo?");
        System.out.println("-".repeat(30));
        System.out.println(VERMELHO + "[1] - Eu estava lutando contra alguém! (Guerreiro)" + RESET);
        System.out.println(VERDE + "[2] - Eu estava fugindo da polícia! (Bandido)" + RESET);
        System.out.println(MAGENTA + "[3] - Eu estava lançando magias! (Feiticeiro)" + RESET);
        System.out.println(CIANO + "[4] - Eu estava defendendo meu castelo! (Arqueiro)" + RESET);
        System.out.println("-".repeat(30));

        while (true) {
            System.out.print("R: ");
            opcao = ler.nextInt();
            if (opcao < 1 || opcao > 4) {
                System.out.println("Não, não foi com isso...eu nunca sonharia com isso");
                continue;
            }
            break;
        }
        PersonagemBase player = switch (opcao) {
            case 1 -> new Guerreiro(VERMELHO + "Guerreiro" + RESET);
            case 2 -> new Bandido(VERDE + "Bandido" + RESET);
            case 3 -> new Feiticeiro(MAGENTA + "Feiticeiro" + RESET);
            case 4 -> new Arqueiro(CIANO + "Arqueiro" + RESET);
            default -> null;
        };
        Inventario mochila = player.getInventario();

        ler.nextLine();
        System.out.println("-> Ah é verdade, foi com isso! Eu era um " + player.getClassePlayer() + "!");
        System.out.print("-> As pessoas daquele sonho me chamavam de: ");

        while (true) {
            nome = ler.nextLine();
            if (nome.trim().isBlank()) {
                System.out.println("Com certeza não me chamavam assim...Está na ponta da língua!");
                continue;
            }
            player.setNome(AZUL + nome + RESET);
            break;
        }

        String formatNome = "[" + player.getNome() + "]";
        String formatNPC = "[NPC]";

        System.out.println(formatNome + ", afinal esse é meu nome HAHAHA");
        System.out.println("-> Minha mãe saiu para ir no salão ou algo assim, não lembro, enfim, ela me deu R$" +
                player.getDinheiro() + ", preciso ir na feira comprar umas coisas para o almoço");
        System.out.println(formatNome + "Mas antes, vou pegar algo na geladeira para comer enquanto caminho");
        System.out.println(formatNome + "Também não posso esquecer do meu guarda-chuva, ouvi dizer que vai cair um toró!");

        if (mochila.guardarItem(fruta) && mochila.guardarItem(guardaChuva)) {
            System.out.println("-> " + fruta.getNome() + " e " + guardaChuva.getNome() + " foram adicionados ao inventário!");
        } else {
            System.out.println("-> Não foi possível guardar a/o " + fruta.getNome() + ", libere espaço");
        }

        System.out.println(AMARELO + "**No caminho para a feirinha**" + RESET);
        MonstroBase goblin = new MonstroBase("Goblin Vingativo", "Goblin", false);
        String formatGoblin = "[" + goblin.getNomeMonstro() + "]";

        System.out.println(formatNPC + "Alguém me ajude, por favor!");
        System.out.println(formatNome + "Ei! Deixe essa moça em paz!");
        System.out.println(formatGoblin + "Goblin querer vingança, mulher xingar goblin GRAAHHHH");

        while (player.isAlive()) {
            while (player.isAlive() && goblin.isAlive()) {
                if (player.getAtributos().getAgilidade() > goblin.getAtributos().getAgilidade()) {
                    break; // FINALIZAR
                }
            }
            player.setAlive(false);
        }
    }
}// plot final: era uma criança sonhando em ser um adulto num mundo de rpg