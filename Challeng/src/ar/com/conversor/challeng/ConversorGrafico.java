package ar.com.conversor.challeng;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ConversorGrafico extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private JMenuItem opcion4;
	private JMenuItem opcion5;
	private JMenuItem opcion6;
	private JMenuItem opcion7;
	private JMenuItem opcion8;
	private JMenuItem opcion9;
	private JMenuItem opcion10;
	private JMenuItem opcionInicio;
	private JMenuItem opcionSalir;
	private JPanel panel;
	
	public double convertirUnidad(double valor, double proporcion) {
	    double valorFinal = valor * proporcion;
	    return valorFinal;
	}
	private double obtenerValorNumerico(String mensaje) {
	    while (true) {
	        String input = JOptionPane.showInputDialog(mensaje);
	        try {
	            return Double.parseDouble(input);
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "El valor ingresado no es válido. Ingrese solo caracteres numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}

		
	public ConversorGrafico() {
		setSize(500, 100);
		setTitle("Conversor G5");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		mostrarMenuInicial();
		panel.add(menuBar);
		add(panel);
	}

	public void mostrarMenuInicial() {
		//inicializacion de los atributos
		panel.removeAll();
		menuBar = new JMenuBar();
		menu = new JMenu("Elija una opción");
		opcion1 = new JMenuItem("Conversor de Moneda");
		opcion2 = new JMenuItem("Conversor de Temperatura");
		opcion3 = new JMenuItem("Conversor de Distancia");
		opcionSalir = new JMenuItem("Salir");
		
		
		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		menu.add(opcionSalir);
		
		menuBar.add(menu);
		panel.add(menuBar);
		
		opcion1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ingresando al Conversor de Moneda...");
				menuConversorDeMoneda();
				
			}
			
		});
		opcion2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JOptionPane.showMessageDialog(null, "Ingresando al Conversor de Temperatura...");
		        menuConversorDeTemperatura();
		    }
		});
		opcion3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        JOptionPane.showMessageDialog(null, "Ingresando al Conversor de Distancia...");
		        menuConversorDeDistancia();
		    }
		});


		opcionSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saliendo del programa...");
				System.exit(0);
				
			}
			
		});
		panel.revalidate(); 
        panel.repaint();
	}
	
	public void menuConversorDeMoneda() {
		
	
		panel.removeAll();;
		menuBar = new JMenuBar();
		menu = new JMenu("Elija una opción de Conversión");
		opcion1 = new JMenuItem("PesoArg -> Dólar");
		opcion2 = new JMenuItem("PesoArg -> Euro");
		opcion3 = new JMenuItem("PesoArg -> Libras Esterlinas");
		opcion4 = new JMenuItem("PesoArg -> Yen japonés");
		opcion5 = new JMenuItem("PesoArg -> Won surcoreano");
		opcion6 = new JMenuItem("Dólar -> PesoArg");
		opcion7 = new JMenuItem("Euro -> PesoArg");
		opcion8 = new JMenuItem("Libras Esterlinas -> PesoArg");
		opcion9 = new JMenuItem("Yen japonés -> PesoArg");
		opcion10 = new JMenuItem("Won sul-coreano -> PesoArg");
		opcionInicio = new JMenuItem("Volver al menú Inicial");
		opcionSalir = new JMenuItem("Salir");
		

		 
		 menu.add(opcion1);
		    menu.add(opcion2);
		    menu.add(opcion3);
		    menu.add(opcion4);
		    menu.add(opcion5);
		    menu.add(opcion6);
		    menu.add(opcion7);
		    menu.add(opcion8);
		    menu.add(opcion9);
		    menu.add(opcion10);
		    menu.add(opcionInicio);
		    menu.add(opcionSalir);

		    menuBar.add(menu);
		    panel.add(menuBar);
		    
		    opcion1.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: PesoArg -> Dólar");
		            
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 0.0038; // Proporción de conversión específica para PesoArg a Dólar
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en Dólar: " + resultado);
		           
		        }
		    });
		        

		    opcion2.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: PesoArg -> Euro");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 0.0034; // Proporción de conversión específica para PesoArg a Dólar
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en Euro: " + resultado);
		        }
		    });

		    opcion3.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: PesoArg -> Libras Esterlinas");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 0.0029; // Proporción de conversión específica para PesoArg a Dólar
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en Libras Esterlinas: " + resultado);
		        }
		    });

		    opcion4.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: PesoArg -> Yen japonés");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 0.52; // Proporción de conversión específica para PesoArg a Dólar
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en Yen japonés: " + resultado);
		        }
		    });

		    opcion5.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: PesoArg -> Won surcoreano");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 4.80; // Proporción de conversión específica para PesoArg a Dólar
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en Won surcoreano: " + resultado);
		        }
		    });

		    opcion6.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: Dólar -> PesoArg");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 264; 
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en PesosArg: " + resultado);
		        }
		    });

		    opcion7.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: Euro -> PesoArg");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 297.55; 
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en PesosArg: " + resultado);
		        }
		    });

		    opcion8.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: Libras Esterlinas -> PesoArg");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 346.44; 
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en PesosArg: " + resultado);
		        }
		    });

		    opcion9.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: Yen japonés -> PesoArg");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 1.91; 
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en PesosArg: " + resultado);
		        }
		    });

		    opcion10.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Realizar conversión: Won surcoreano -> PesoArg");
		            double valor = obtenerValorNumerico("Ingrese la cantidad que desea Convertir");
		            double proporcion = 297.55; 
		            double resultado = convertirUnidad(valor, proporcion);
		            JOptionPane.showMessageDialog(null, "Valor Final en PesosArg: " + resultado);
		        }
		    });

		    opcionInicio.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Volviendo al menú Inicial...");
		            mostrarMenuInicial();
		        }
		    });

		    opcionSalir.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            JOptionPane.showMessageDialog(null, "Saliendo del programa...");
		            System.exit(0);
		        }
		    });
		    panel.revalidate(); 
	        panel.repaint();
	}

	
	public void menuConversorDeTemperatura() {
	    panel.removeAll();
	    menuBar= new JMenuBar();
	    menu = new JMenu("Elija una opción de Conversión");
	    opcion1 = new JMenuItem("Celcius -> Fahrenheit");
	    opcion2 = new JMenuItem("Celcius -> Kelvin");
	    opcion3 = new JMenuItem("Fahrenheit -> Celsius");
	    opcion4 = new JMenuItem("Fahrenheit -> Kelvin");
	    opcion5 = new JMenuItem("Kelvin -> Celsius");
	    opcion6 = new JMenuItem("Kelvin -> Fahrenheit");
	    opcionInicio = new JMenuItem("Volver al menú Inicial");
	    opcionSalir = new JMenuItem("Salir");
	    
	    menu.add(opcion1);
	    menu.add(opcion2);
	    menu.add(opcion3);
	    menu.add(opcion4);
	    menu.add(opcion5);
	    menu.add(opcion6);
	    menu.add(opcionInicio);
	    menu.add(opcionSalir);
	    
	    menuBar.add(menu);
	    panel.add(menuBar);
	    
	    opcion1.addActionListener(e -> {
	    	JOptionPane.showMessageDialog(null, "Realizar conversión: Celsius -> Fahrenheit");

	        JTextField celsiusField = new JTextField(10);
	        JButton convertirButton = new JButton("Convertir");
	        JTextField fahrenheitField = new JTextField(10);
	        fahrenheitField.setEditable(false);

	        JPanel conversionPanel = new JPanel();
	        conversionPanel.add(new JLabel("Celsius:"));
	        conversionPanel.add(celsiusField);
	        conversionPanel.add(convertirButton);
	        conversionPanel.add(new JLabel("Fahrenheit:"));
	        conversionPanel.add(fahrenheitField);

	        convertirButton.addActionListener(evt -> {
	            try {
	                double celsius = Double.parseDouble(celsiusField.getText());
	                double fahrenheit = (celsius * 9 / 5) + 32;
	                fahrenheitField.setText(Double.toString(fahrenheit));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido para Celsius.");
	            }
	        });
	        
	        JButton volverButton = new JButton("Volver al menú anterior");
	        volverButton.addActionListener(evt -> menuConversorDeTemperatura());

	        panel.removeAll();
	        panel.add(conversionPanel);
	        panel.add(volverButton);
	        panel.revalidate();
	        panel.repaint();
	    });
	    
	    opcion2.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Realizar conversión: Celsius -> Kelvin");

	        JTextField celsiusField = new JTextField(10);
	        JButton convertirButton = new JButton("Convertir");
	        JTextField kelvinField = new JTextField(10);
	        kelvinField.setEditable(false);

	        JPanel conversionPanel = new JPanel();
	        conversionPanel.add(new JLabel("Celsius:"));
	        conversionPanel.add(celsiusField);
	        conversionPanel.add(convertirButton);
	        conversionPanel.add(new JLabel("Kelvin:"));
	        conversionPanel.add(kelvinField);

	        convertirButton.addActionListener(evt -> {
	            try {
	                double celsius = Double.parseDouble(celsiusField.getText());
	                double kelvin = celsius + 273.15;
	                kelvinField.setText(Double.toString(kelvin));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido para Celsius.");
	            }
	        });
	        JButton volverButton = new JButton("Volver al menú anterior");
	        volverButton.addActionListener(evt -> menuConversorDeTemperatura());

	        panel.removeAll();
	        panel.add(conversionPanel);
	        panel.add(volverButton);
	        panel.revalidate();
	        panel.repaint();
	    });

	    opcion3.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Realizar conversión: Fahrenheit -> Celsius");

	        JTextField fahrenheitField = new JTextField(10);
	        JButton convertirButton = new JButton("Convertir");
	        JTextField celsiusField = new JTextField(10);
	        celsiusField.setEditable(false);

	        JPanel conversionPanel = new JPanel();
	        conversionPanel.add(new JLabel("Fahrenheit:"));
	        conversionPanel.add(fahrenheitField);
	        conversionPanel.add(convertirButton);
	        conversionPanel.add(new JLabel("Celsius:"));
	        conversionPanel.add(celsiusField);

	        convertirButton.addActionListener(evt -> {
	            try {
	                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
	                double celsius = (fahrenheit - 32) * 5 / 9;
	                celsiusField.setText(Double.toString(celsius));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido para Fahrenheit.");
	            }
	        });
	        JButton volverButton = new JButton("Volver al menú anterior");
	        volverButton.addActionListener(evt -> menuConversorDeTemperatura());

	        panel.removeAll();
	        panel.add(conversionPanel);
	        panel.add(volverButton);
	        panel.revalidate();
	        panel.repaint();
	    });

	    opcion4.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Realizar conversión: Fahrenheit -> Kelvin");

	        JTextField fahrenheitField = new JTextField(10);
	        JButton convertirButton = new JButton("Convertir");
	        JTextField kelvinField = new JTextField(10);
	        kelvinField.setEditable(false);

	        JPanel conversionPanel = new JPanel();
	        conversionPanel.add(new JLabel("Fahrenheit:"));
	        conversionPanel.add(fahrenheitField);
	        conversionPanel.add(convertirButton);
	        conversionPanel.add(new JLabel("Kelvin:"));
	        conversionPanel.add(kelvinField);

	        convertirButton.addActionListener(evt -> {
	            try {
	                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
	                double kelvin = (fahrenheit + 459.67) * 5 / 9;
	                kelvinField.setText(Double.toString(kelvin));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido para Fahrenheit.");
	            }
	        });

	        JButton volverButton = new JButton("Volver al menú anterior");
	        volverButton.addActionListener(evt -> menuConversorDeTemperatura());

	        panel.removeAll();
	        panel.add(conversionPanel);
	        panel.add(volverButton);
	        panel.revalidate();
	        panel.repaint();
	    });

	    opcion5.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Realizar conversión: Kelvin -> Celsius");

	        JTextField kelvinField = new JTextField(10);
	        JButton convertirButton = new JButton("Convertir");
	        JTextField celsiusField = new JTextField(10);
	        celsiusField.setEditable(false);

	        JPanel conversionPanel = new JPanel();
	        conversionPanel.add(new JLabel("Kelvin:"));
	        conversionPanel.add(kelvinField);
	        conversionPanel.add(convertirButton);
	        conversionPanel.add(new JLabel("Celsius:"));
	        conversionPanel.add(celsiusField);

	        convertirButton.addActionListener(evt -> {
	            try {
	                double kelvin = Double.parseDouble(kelvinField.getText());
	                double celsius = kelvin - 273.15;
	                celsiusField.setText(Double.toString(celsius));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido para Kelvin.");
	            }
	        });
	        JButton volverButton = new JButton("Volver al menú anterior");
	        volverButton.addActionListener(evt -> menuConversorDeTemperatura());

	        panel.removeAll();
	        panel.add(conversionPanel);
	        panel.add(volverButton);
	        panel.revalidate();
	        panel.repaint();
	    });

	    opcion6.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Realizar conversión: Kelvin -> Fahrenheit");

	        JTextField kelvinField = new JTextField(10);
	        JButton convertirButton = new JButton("Convertir");
	        JTextField fahrenheitField = new JTextField(10);
	        fahrenheitField.setEditable(false);

	        JPanel conversionPanel = new JPanel();
	        conversionPanel.add(new JLabel("Kelvin:"));
	        conversionPanel.add(kelvinField);
	        conversionPanel.add(convertirButton);
	        conversionPanel.add(new JLabel("Fahrenheit:"));
	        conversionPanel.add(fahrenheitField);

	        convertirButton.addActionListener(evt -> {
	            try {
	                double kelvin = Double.parseDouble(kelvinField.getText());
	                double fahrenheit = kelvin * 9 / 5 - 459.67;
	                fahrenheitField.setText(Double.toString(fahrenheit));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido para Kelvin.");
	            }
	        });
	        JButton volverButton = new JButton("Volver al menú anterior");
	        volverButton.addActionListener(evt -> menuConversorDeTemperatura());

	        panel.removeAll();
	        panel.add(conversionPanel);
	        panel.add(volverButton);
	        panel.revalidate();
	        panel.repaint();
	    });

	    opcionInicio.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Volviendo al menú Inicial...");
	        mostrarMenuInicial();
	    });

	    opcionSalir.addActionListener(e -> {
	        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
	        System.exit(0);
	    });

	    panel.revalidate();
	    panel.repaint();
	}
	
	
	public void menuConversorDeDistancia() {
	    panel.removeAll();
	    panel.setLayout(new FlowLayout());

	    JLabel conversionLabel = new JLabel("Conversor de Distancia");
	    panel.add(conversionLabel);
	    JLabel conversionLabe2 = new JLabel("Ingrese la cantidad ==>==>==>==>==> Resultado");
	    panel.add(conversionLabe2);
	    JPanel conversionPanel = new JPanel();
	    conversionPanel.setLayout(new GridLayout(0, 3, 10, 10));

	    JTextField inputField = new JTextField(10);
	    JButton convertButton = new JButton("Convertir");
	    JTextField resultField = new JTextField(10);
	    resultField.setEditable(false);

	    conversionPanel.add(inputField);
	    conversionPanel.add(convertButton);
	    conversionPanel.add(resultField);

	    panel.add(conversionPanel);

	    convertButton.addActionListener(evt -> {
	        try {
	            double inputValue = Double.parseDouble(inputField.getText());
	            double result = 0;

	            String selectedOption = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión:",
	                    "Opciones de Conversión", JOptionPane.QUESTION_MESSAGE, null,
	                    new String[] { "Centímetros -> Metros", "Centímetros -> Kilómetros", "Metros -> Centímetros",
	                            "Metros -> Kilómetros", "Kilómetros -> Centímetros", "Kilómetros -> Metros" },
	                    "Centímetros -> Metros");

	            if (selectedOption != null) {
	                switch (selectedOption) {
	                    case "Centímetros -> Metros":
	                        result = convertirUnidad(inputValue, 0.01);
	                        break;
	                    case "Centímetros -> Kilómetros":
	                        result = convertirUnidad(inputValue, 0.00001);
	                        break;
	                    case "Metros -> Centímetros":
	                        result = convertirUnidad(inputValue, 100);
	                        break;
	                    case "Metros -> Kilómetros":
	                        result = convertirUnidad(inputValue, 0.001);
	                        break;
	                    case "Kilómetros -> Centímetros":
	                        result = convertirUnidad(inputValue, 100000);
	                        break;
	                    case "Kilómetros -> Metros":
	                        result = convertirUnidad(inputValue, 1000);
	                        break;
	                }
	                resultField.setText(Double.toString(result));
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Ingrese un valor válido.");
	        }
	    });

	    JButton volverButton = new JButton("Volver al menú anterior");
	    volverButton.addActionListener(evt -> mostrarMenuInicial());

	    panel.add(volverButton);
	    panel.revalidate();
	    panel.repaint();
	}


	public static void main(String[] args) {
		ConversorGrafico ventana= new ConversorGrafico();
		ventana.setVisible(true);
	
	}

}