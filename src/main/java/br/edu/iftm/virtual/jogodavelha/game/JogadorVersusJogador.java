package br.edu.iftm.virtual.jogodavelha.game;

import br.edu.iftm.virtual.jogodavelha.controller.Controller;
import br.edu.iftm.virtual.jogodavelha.controller.Maquina;
import br.edu.iftm.virtual.jogodavelha.controller.Tabuleiro;

import java.util.Random;
import java.util.Scanner;

public class JogadorVersusJogador {

    static Maquina maquina = new Maquina();
    static Tabuleiro tab = new Tabuleiro();
    static Controller controller = new Controller();
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public void run() {

        var mat = tab.getTabuleiro();

        for(int i = 0; i < 9;i++){

            buildTabuleiro(mat);

            if(controller.checkMatrix(tab.getTabuleiro()) != "Empate"){
                break;
            }
            if(i%2==0){
                System.out.println("Jogador 1: ");
                tab.setValue(sc.nextInt(),sc.nextInt(),"o");
            }
            else {
                System.out.println("Jogador 2: ");
                tab.setValue(sc.nextInt(), sc.nextInt(),"x");
            }
        }
        System.out.println("Ganhador: "+controller.checkMatrix(tab.getTabuleiro()));
    }

    public static void buildTabuleiro(String[][] mat){

        for(int i = 0; i< mat.length;i++){
            System.out.println("| "+ mat[i][0]+" | "+mat[i][1]+ " | "+ mat[i][2]+ " |");
        }
        System.out.println("");
    }

}
