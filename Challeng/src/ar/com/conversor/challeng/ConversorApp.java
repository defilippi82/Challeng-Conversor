package ar.com.conversor.challeng;

import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int input = 0;
		
		while(input != 99) {
			Conversor.mostrarMenuInicial();
			input = entrada.nextInt();
			
			switch (input) {
			case 1:
				 mostrarSubMenuMoneda(entrada);
				break;
			case 2:
				mostrarSubMenuTemperatura(entrada);
				break;
			case 3:
				mostrarSubMenuDistancia(entrada);
				break;
			case 99:
                System.out.println("Qué pena! Saliendo del programa...");
                break;
            default:
                System.out.println("Elija una opción válida");
                break;
			}
		}
		entrada.close();
	}
public static void mostrarSubMenuMoneda(Scanner entrada) {
			
	int	input = -1;
	
	while (input != 0) {
        Conversor.mostrarMenuMoneda();
       	input = entrada.nextInt();
       	
					switch(input) {
						case 1:
							Conversor.conversion("PesoArg", "Dólar", 0.0038, entrada);
							break;
						case 2:
							Conversor.conversion("PesoArg", "Euro", 0.0034, entrada);
							break;
						case 3:
							Conversor.conversion("PesoArg", "Libras Esterlinas", 0.0029, entrada);
							break;
						case 4:
							Conversor.conversion("PesoArg", "Yen japonés", 0.52, entrada);
							break;
						case 5:
							Conversor.conversion("PesoArg", "Won surcoreano", 4.80, entrada);
							break;
						case 6:
							Conversor.conversion( "Dólar","PesoArg", 264, entrada);
							break;
						case 7:
							Conversor.conversion("Euro", "PesoArg", 297.55, entrada);
							break;
						case 8:
							Conversor.conversion("Libras Esterlinas", "PesoArg", 346.44, entrada);
							break;
						case 9:
							Conversor.conversion("Yen japonés", "PesoArg", 1.91, entrada);
							break;
						case 10:
							Conversor.conversion("Won surcoreano", "PesoArg", 0.21, entrada);
							break;
						case 0:
							System.out.println("Volver al menú Inicial...");
							break;
						default:
							System.out.println("Elija una opcion válida");
							break;
							}
						}

}
public static void mostrarSubMenuTemperatura(Scanner entrada) {
	int input = -1;
		
				while(input != 0) {
					Conversor.mostrarMenuTemperatura();
					input = entrada.nextInt();
					
					switch (input) {
					case 1:
						Conversor.conversion("Celcius", "Fahrenheit", 1.8+32, entrada);
						break;
					case 2:
	                    Conversor.conversionTemperatura("Celsius", "Kelvin", 1, entrada);
	                    break;
	                case 3:
	                    Conversor.conversionTemperatura("Fahrenheit", "Celsius", 0.5556, entrada);
	                    break;
	                case 4:
	                    Conversor.conversionTemperatura("Fahrenheit", "Kelvin", 0.5556, entrada);
	                    break;
	                case 5:
	                    Conversor.conversionTemperatura("Kelvin", "Celsius", -272.15, entrada);
	                    break;
	                case 6:
	                    Conversor.conversionTemperatura("Kelvin", "Fahrenheit", -457.87, entrada);
	                    break;
	                case 0:
	                    System.out.println("Volver al menú Inicial...");
	                    break;
	                default:
	                    System.out.println("Elija una opción válida");
	                    break;
                }
            }
}
public static void mostrarSubMenuDistancia(Scanner entrada) {
	int input = -1;
	
	
				while(input != 0) {
					Conversor.mostrarMenuDistancia();
					input = entrada.nextInt();
					switch (input) {
					
					case 1:
						Conversor.conversion("centimmetros", "metros", 0.01, entrada );
						break;
					case 2:
						Conversor.conversion( "centimmetros","kilometros", 1000, entrada );
						break;
					case 3:
						Conversor.conversion( "metros","centimmetros", 0.01, entrada );
						break;
					case 4:
						Conversor.conversion( "metros","kilommetros", 100, entrada );
						break;
					case 5:
						Conversor.conversion( "kilometros","centimmetros", 0.001, entrada );
						break;
					case 6:
						Conversor.conversion( "kilometros","metros", 0.01, entrada );
						break;
					case 0:
                        System.out.println("Volver al menú Inicial...");
                        break;
                    default:
                        System.out.println("Elija una opción válida");
                        break;
					}
				}
	
	}

}
