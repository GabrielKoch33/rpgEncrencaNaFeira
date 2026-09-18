package org.gabriel;

import org.gabriel.classesMecanicas.Item;
import org.gabriel.classesMecanicas.Loja;
import org.gabriel.classesPersonagens.*;

import java.util.Scanner;

public class Sessao {
    public static final String PRETO = "\u001B[30m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIANO = "\u001B[36m";
    public static final String BRANCO = "\u001B[37";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        String nome;

        System.out.println("***Sons de despertados apitando***");
        System.out.println("-> Q-Que horas são?!? Só 7 AM? Poxa, hoje é sábado, esqueci de configurar o despertador...");
        System.out.println("-> Mas nossa, que noite boa! Cheguei até a sonhar...");
        System.out.println("-> O que eu estava fazendo no meu sonho mesmo?");
        System.out.println("-".repeat(30));
        System.out.println(VERMELHO + "[1] - Eu estava lutando contra alguém! (Guerreiro)" + RESET);
        System.out.println(VERDE + "[2] - Eu estava fugindo da polícia! (Bandido)" + RESET);
        System.out.println(MAGENTA + "[3] - Eu estava lançando magias! (Feiticeiro)"  + RESET);
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
        PersonagemBase player = null;
        switch (opcao) {
            case 1:
                player = new Guerreiro(VERMELHO + "Guerreiro" + RESET);
                break;
            case 2:
                player = new Bandido(VERDE + "Bandido" + RESET);
                break;
            case 3:
                player = new Feiticeiro(MAGENTA + "Feiticeiro" + RESET);
                break;
            case 4:
                player = new Arqueiro(CIANO + "Arqueiro" + RESET);
                break;
        }
        ler.nextLine();
        System.out.println("Ah é verdade, foi com isso! Eu era um " + player.getClassePlayer() +"!");
        System.out.print("As pessoas daquele sonho me chamavam de: ");
        while (true) {
            nome = ler.nextLine();
            if (nome.trim().isBlank()) {
                System.out.println("Com certeza não me chamavam assim...Está na ponta da língua!");
                continue;
            }
            player.setNomePlayer(AZUL + nome);
            break;
        }
        System.out.println(player.getNomePlayer() + ", afinal esse é meu nome HAHAHA");
        System.out.println("Minha mãe saiu para ir no salão ou algo assim, não lembro, enfim, ela me deu R$" +
                           player.getDinheiro() + ", preciso ir na feira comprar umas coisas para o almoço");
    }
}// plot final: era uma criança sonhando em ser um adulto num mundo de rpg
