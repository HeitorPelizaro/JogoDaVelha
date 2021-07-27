package br.edu.iftm.virtual.jogodavelha;

import br.edu.iftm.virtual.jogodavelha.controller.Controller;
import br.edu.iftm.virtual.jogodavelha.controller.Maquina;
import br.edu.iftm.virtual.jogodavelha.controller.Tabuleiro;
import br.edu.iftm.virtual.jogodavelha.game.JogadorVersusJogador;
import br.edu.iftm.virtual.jogodavelha.game.JogadorVersusMaquina;
import br.edu.iftm.virtual.jogodavelha.menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class JogoDaVelhaApplication{

	static Menu menu = new Menu();

	public static void main(String[] args) {
		SpringApplication.run(JogoDaVelhaApplication.class, args);
		menu.runMenu();
	}


}
