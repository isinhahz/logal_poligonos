package br.com.engsenai.calculadora_de_formas_geometricas.model;

import java.util.Scanner;

public class Trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior () {
		return this.baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("-------------------");
		System.out.println("T R A P É Z I O");
		System.out.println("-------------------");
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + calcularArea;());
		System.out.println("-------------------");
	}
}
