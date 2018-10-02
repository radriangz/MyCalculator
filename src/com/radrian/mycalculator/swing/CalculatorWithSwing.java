package com.radrian.mycalculator.swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.radrian.mycalculator.listeners.CalculatorListener;

public class CalculatorWithSwing {

	private JFrame frame;
	private JTextField pantallaCalculadora;
	private long valorA;
	private long valorB;
	private long resultado;
	private boolean operadorSuma;
	private boolean operadorResta;
	private boolean operadorMulti;
	private boolean operadorDiv;

	/**
	 * Crea la app.
	 */
	public CalculatorWithSwing() {
		initializeCalculator();
	}

	/**
	 * Inicializa el contenido del frame.
	 */
	private void initializeCalculator() {
		frame = new JFrame(); // Se crea el objeto tipo JFrame de nombre frame
		frame.setBounds(100, 100, 328, 426); // Se establecen las medidas del frame.
		frame.setLocationRelativeTo(null);// la ventana del jframe se abrir� en el centro de la pantalla
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se establece como cerrar la app
		frame.setTitle("Calculador con Swing");
		frame.getContentPane().setLayout(null);// Se crean los componentes y se colocan dentrodel mismo
		frame.setResizable(false);// No se le va a poder cambiar de tama�o a la pantalla

		pantallaCalculadora = new JTextField();// cuadro de texto, con todos sus datos
		pantallaCalculadora.setBounds(11, 11, 291, 43);
		pantallaCalculadora.setHorizontalAlignment(SwingConstants.RIGHT);
		pantallaCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(pantallaCalculadora);
		pantallaCalculadora.setColumns(1);
		pantallaCalculadora.setEditable(false);

		JButton botonIgual = new JButton("=");
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonIgual.setBounds(232, 256, 70, 111);
		botonIgual.setActionCommand("=");
		frame.getContentPane().add(botonIgual);
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				valorB = Long.parseLong(pantallaCalculadora.getText());
				operacion(valorA, valorB);
			}
		});

		JButton botonPuntoDecimal = new JButton(".");
		botonPuntoDecimal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonPuntoDecimal.setBounds(159, 315, 70, 52);
		frame.getContentPane().add(botonPuntoDecimal);
		botonPuntoDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("."));
			}
		});

		JButton botonSuma = new JButton("+");
		botonSuma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonSuma.setBounds(232, 193, 70, 52);
		frame.getContentPane().add(botonSuma);
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				valorA = Long.parseLong(pantallaCalculadora.getText());
				operadorSuma = true;
				pantallaCalculadora.setText("");
			}
		});

		JButton botonResta = new JButton("-");
		botonResta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonResta.setBounds(232, 133, 70, 52);
		frame.getContentPane().add(botonResta);
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				valorA = Long.parseLong(pantallaCalculadora.getText());
				operadorResta = true;
				pantallaCalculadora.setText("");
			}
		});

		JButton botonDelete = new JButton("Del");
		botonDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonDelete.setBounds(232, 68, 70, 52);
		botonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String screenText = pantallaCalculadora.getText();
				pantallaCalculadora.setText("");

				for (int i = 0; i < screenText.length() - 1; i++) {
					pantallaCalculadora.setText(pantallaCalculadora.getText() + screenText.charAt(i));
				// Preguntar a karim qu� hace esto.
				}
			}
		});
		frame.getContentPane().add(botonDelete);

		JButton botonDivision = new JButton("/");
		botonDivision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonDivision.setBounds(158, 68, 70, 52);
		frame.getContentPane().add(botonDivision);
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				valorA = Long.parseLong(pantallaCalculadora.getText());
				operadorDiv = true;
				pantallaCalculadora.setText("");
			}
		});

		JButton botonMultiplicacion = new JButton("*");
		botonMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonMultiplicacion.setBounds(84, 68, 70, 52);
		frame.getContentPane().add(botonMultiplicacion);
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				valorA = Long.parseLong(pantallaCalculadora.getText());
				operadorMulti = true;
				pantallaCalculadora.setText("");
			}
		});

		JButton botonClear = new JButton("C");
		botonClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonClear.setBounds(10, 68, 70, 52);
		frame.getContentPane().add(botonClear);
		botonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText("");
				operadorSuma = false;
				operadorResta = false;
				operadorMulti = false;
				operadorDiv = false;
			}
		});

		JButton botonNumCero = new JButton("0");
		botonNumCero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumCero.setBounds(11, 315, 145, 52);
		frame.getContentPane().add(botonNumCero);
		botonNumCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("0"));
			}
		});

		JButton botonNumUno = new JButton("1");
		botonNumUno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonNumUno.setBounds(10, 256, 70, 52);
		frame.getContentPane().add(botonNumUno);
		botonNumUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("1"));
			}
		});

		JButton botonNumDos = new JButton("2");
		botonNumDos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumDos.setBounds(84, 256, 70, 52);
		frame.getContentPane().add(botonNumDos);
		botonNumDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("2"));
			}
		});

		JButton botonNumTres = new JButton("3");
		botonNumTres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumTres.setBounds(158, 256, 70, 52);
		frame.getContentPane().add(botonNumTres);
		botonNumTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("3"));
			}
		});

		JButton botonNumCuatro = new JButton("4");
		botonNumCuatro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumCuatro.setBounds(10, 193, 70, 52);
		frame.getContentPane().add(botonNumCuatro);
		botonNumCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("4"));
			}
		});

		JButton botonNumCinco = new JButton("5");
		botonNumCinco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumCinco.setBounds(84, 193, 70, 52);
		frame.getContentPane().add(botonNumCinco);
		botonNumCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("5"));
			}
		});

		JButton botonNumSeis = new JButton("6");
		botonNumSeis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumSeis.setBounds(158, 193, 70, 52);
		frame.getContentPane().add(botonNumSeis);
		botonNumSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("6"));
			}
		});

		JButton botonNumSiete = new JButton("7");
		botonNumSiete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumSiete.setBounds(10, 133, 70, 52);
		frame.getContentPane().add(botonNumSiete);
		botonNumSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("7"));
			}
		});

		JButton botonNumOcho = new JButton("8");
		botonNumOcho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumOcho.setBounds(84, 133, 70, 52);
		frame.getContentPane().add(botonNumOcho);
		botonNumOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("8"));
			}
		});

		JButton botonNumNueve = new JButton("9");
		botonNumNueve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumNueve.setBounds(158, 133, 70, 52);
		frame.getContentPane().add(botonNumNueve);
		
		CalculatorListener listener = new CalculatorListener(this);
		botonNumNueve.addActionListener(this);
		
		
		botonNumNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				pantallaCalculadora.setText(pantallaCalculadora.getText().concat("9"));
			}
		});
	}

	public void operacion(long valorA, long valorB) {
		if (operadorSuma) {
			resultado = (valorA) + (valorB);
			pantallaCalculadora.setText(Long.valueOf(resultado).toString());
		} else if (operadorResta) {
			resultado = (valorA) - (valorB);
			pantallaCalculadora.setText(Long.valueOf(resultado).toString());
		} else if (operadorDiv) {
			resultado = (valorA) / (valorB);
			pantallaCalculadora.setText(Long.valueOf(resultado).toString());
		} else if (operadorMulti) {
			resultado = (valorA) * (valorB);
			pantallaCalculadora.setText(Long.valueOf(resultado).toString());
		}
		operadorSuma = false;
	}

	/**
	 * Lanza la app.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWithSwing window = new CalculatorWithSwing();
					window.frame.setVisible(true);
				} catch (Exception exceptionalEvent) {
					exceptionalEvent.printStackTrace();
				}
			}
		});
	}

}
