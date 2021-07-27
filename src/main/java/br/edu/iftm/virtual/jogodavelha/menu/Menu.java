package br.edu.iftm.virtual.jogodavelha.menu;

import br.edu.iftm.virtual.jogodavelha.game.JogadorVersusJogador;
import br.edu.iftm.virtual.jogodavelha.game.JogadorVersusMaquina;

import java.util.Scanner;

public class Menu {


    private JogadorVersusJogador jvj = new JogadorVersusJogador();

    private JogadorVersusMaquina jvm = new JogadorVersusMaquina();

    private Scanner sc = new Scanner(System.in);

    public void runMenu(){
        System.out.println("==== Escolha um modo ==== \n 1- Jogador vs Jogador \n 2 - Jogador vs Maquina \n 3 - Sair");

        var opt = sc.nextInt();

        switch (opt){
            case 1:
                jvj.run();
            case 2:
                jvm.run();
            default:
                break;
        }


    }

}
