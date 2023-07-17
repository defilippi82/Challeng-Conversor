package ar.com.conversor.challeng;

import java.util.Scanner;

public class Conversor {
	public static void mostrarMenuInicial() {
		System.out.println("========================");
		System.out.println("Bienvenido al Conversor");
		System.out.println("Seleccione un Conversor");
		System.out.println("1 - Conversor de Monedas");
		System.out.println("2 - Conversor de Temperatura");
		System.out.println("3 - Conversor de Distancia");
		System.out.println("99 - salir");
		System.out.println("=========================");
	}
	
	public static void mostrarMenuMoneda() {
		System.out.println("=========================");
		System.out.println("1 - peso -> Dólar");
		System.out.println("2 - peso -> Euro");
		System.out.println("3 - peso -> Libras Esterlinas");
		System.out.println("4 - peso -> Yen japonés");
		System.out.println("5 - peso -> Won sul-coreano");
		System.out.println("6 - Dólar -> peso");
		System.out.println("7 - Euro -> peso");
		System.out.println("8 - Libras Esterlinas -> peso");
		System.out.println("9 - Yen japonés -> peso");
		System.out.println("10 - Won sul-coreano -> peso");
		System.out.println("0 - Volver al menú Inicial");
		System.out.println("Elija un opción válida");
		System.out.println("=========================");
	}
	public static void mostrarMenuTemperatura() {
		System.out.println("=========================");
		System.out.println("1 - Celcius -> Fahrenheit");
		System.out.println("2 - Celcius -> Kelvin");
		System.out.println("3 - Fahrenheit -> Celcius");
		System.out.println("4 - Fahrenheit -> Kelvin");
		System.out.println("5 - Kelvin -> Celcius");
		System.out.println("6 - Kelvin -> Fahrenheit");
		System.out.println("0 - Volver al menú Inicial");
		System.out.println("Elija un opción válida");
		System.out.println("=========================");
	}
	public static void mostrarMenuDistancia() {
		System.out.println("=========================");
		System.out.println("1 - centimetros -> metros");
		System.out.println("2 - centimetros -> kilometros");
		System.out.println("3 - metros -> centimetros");
		System.out.println("4 - metros -> kilometros");
		System.out.println("5 - kilometros -> centimetros");
		System.out.println("6 - kilometros -> metros");
		System.out.println("0 - Volver al menú Inicial");
		System.out.println("Elija un opción válida");
		System.out.println("=========================");
	}
	public static void conversion(String unidOrigen, String unidDestino, double proporcion, Scanner leitor) {
		System.out.println("Elegiste la opciòn: "+ unidOrigen + "->>" + unidDestino);
		System.out.println("Ingrese el valor:");
		double valor = leitor.nextDouble();
		double valorFinal = valor * proporcion;
		System.out.println("Valor Final = "+ valorFinal);
	}
	public static void conversionTemperatura(String unidOrigen, String unidDestino, double proporcion, Scanner leitor) {
		System.out.println("Elegiste la opciòn: "+ unidOrigen + "->>" + unidDestino);
		System.out.println("Ingrese el valor:");
		double valor = leitor.nextDouble();
		double valorFinal = valor * proporcion;
		System.out.println("Valor Final = "+ valorFinal);
	}
}
