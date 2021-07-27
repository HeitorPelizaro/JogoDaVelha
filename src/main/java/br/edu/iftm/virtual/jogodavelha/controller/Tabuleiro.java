package br.edu.iftm.virtual.jogodavelha.controller;

import lombok.Getter;

public class Tabuleiro {

    @Getter
    private String tabuleiro[][] = new String[3][3];

    public boolean setValue(int x, int y, String valor){

        if(((x > 3) || (x < 0) || (y > 3) || (y < 0))) return false;

        if(!(tabuleiro[x][y] == null)) return false;

        tabuleiro[x][y] = valor;

        return true;

    }

}
