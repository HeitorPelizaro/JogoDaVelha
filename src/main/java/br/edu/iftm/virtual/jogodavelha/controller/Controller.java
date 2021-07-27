package br.edu.iftm.virtual.jogodavelha.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void menu(String opt){
    }

    public void jogadorXJogador(){

    }

    public String checkMatrix(String[][] mat) {

        if(yVerifier(mat,"o") || xVerifier(mat,"o") || diagVerifier(mat,"o")){
            return "O";
        }

        if(xVerifier(mat,"x") || yVerifier(mat,"x") || diagVerifier(mat,"x")){
            return "X";
        }

    return "Empate";

    }

    public Boolean verify(List<String> row, String value){
        if((row.get(0) == value) && (row.get(1)==value) && (row.get(2)==value)){
            return true;
        }

        return false;
    }

    public List<String> columnGetter(String[][] mat,int column){
        List<String> newColumn = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            newColumn.add(mat[i][column]);
        }
        return newColumn;
    }

    public List<String> listParser(String[] arr){
        List<String> newArr = new ArrayList<>();

        for(int i = 0; i < 3;i++){
            newArr.add(arr[i]);
        }
        return newArr;
    }

    public boolean xVerifier(String[][] arr,String value){
        for(int i = 0; i < 3 ; i++){
            var parsedArr = listParser(arr[i]);
            if(verify(parsedArr,value)) return true;
        }
        return false;
    }

    public boolean yVerifier(String[][] mat,String value){
        for(int i = 0; i < 3 ; i++){
            var c = columnGetter(mat,i);
            if(verify(c,value)) return true;
        }
        return false;
    }

    public boolean diagVerifier(String[][] mat,String value){
        if(((mat[0][0] == value) && (mat[1][1]==value) && (mat[2][2]==value))) return true;

        if(((mat[0][2] == value) && (mat[1][1]==value) && (mat[2][0]==value))) return true;

        return false;
    }
}
