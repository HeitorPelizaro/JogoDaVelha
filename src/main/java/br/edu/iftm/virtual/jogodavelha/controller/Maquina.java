package br.edu.iftm.virtual.jogodavelha.controller;

import lombok.Getter;

import java.util.Random;

public class Maquina {

    @Getter
    private Integer machineX;
    @Getter
    private Integer machineY;

    static Random random = new Random();

    public void tabuleiroAnalysis(String[][] mat){
        while(true){
            var randX = random.nextInt(3);
            var randY = random.nextInt(3);

            if(mat[randX][randY]==null){
                this.machineX = randX;
                this.machineY = randY;
                break;
            }
        }
    }

}
