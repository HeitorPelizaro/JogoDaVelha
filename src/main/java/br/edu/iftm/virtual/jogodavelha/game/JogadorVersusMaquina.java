package br.edu.iftm.virtual.jogodavelha.game;

import br.edu.iftm.virtual.jogodavelha.controller.Controller;
import br.edu.iftm.virtual.jogodavelha.controller.Maquina;
import br.edu.iftm.virtual.jogodavelha.controller.Tabuleiro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JogadorVersusMaquina {

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
                System.out.println("Jogador: ");
                tab.setValue(sc.nextInt(),sc.nextInt(),"o");
            }
            else {
                System.out.println("Maquina: ");
                maquina.tabuleiroAnalysis(tab.getTabuleiro());
                tab.setValue(maquina.getMachineX(), maquina.getMachineY(), "x");
            }
        }
        System.out.println("Ganhador: "+controller.checkMatrix(tab.getTabuleiro()));
    }

    public static void buildTabuleiro(String[][] arr){

        for(int i = 0; i< arr.length;i++){
            System.out.println("| "+ arr[i][0]+" | "+arr[i][1]+ " | "+ arr[i][2]+ " |");
        }
        System.out.println("");
    }


    public static String[][] formatArr(String[][] arr){
        for (int i = 0; i < 3;i++){
            for(int x = 0; x < 3; x++){
                if(arr[i][x]==null) arr[i][x] = " ";
            }
        }
        return arr;
    }

}
