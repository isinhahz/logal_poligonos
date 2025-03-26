package br.com.engsenai.calculadora_de_formas_geometricas;

import java.util.Scanner;

import br.com.engsenai.calculadora_de_formas_geometricas.ui.Menu;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println(nome.length());
		System.out.println("Olá, " + nome);
		System.out.println(nome.toUpperCase());
		
		Menu menu = new Menu();
		menu.criarMenu();
	}

}
