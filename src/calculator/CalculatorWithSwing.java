package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;

public class CalculatorWithSwing {

	private JFrame frame;
	private JTextField pantallaCalculadora;

	/**
	 * Lanza la app.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*Intenta realizar lo que sea que le indique el código
					 * */
					CalculatorWithSwing window = new CalculatorWithSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					/*atrapa la excepción, un código que hace que el código 
					 * deje de funcionar, o sea, un error, el catch utiliza
					 * las líneas de código que tiene para esto.
					 * */
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea la app.
	 */
	public CalculatorWithSwing() {
		initialize();
	}

	/**
	 * Inicializa el contenido del frame.
	 */
	private void initialize() {
		frame = new JFrame(); //Se crea el objeto tipo JFrame de nombre frame
		frame.setBounds(100, 100, 328, 426); //Se establecen las medidas del frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//se establece como cerrar la app
		frame.getContentPane().setLayout(null);//Se crean los componentes y se colocan dentrodel mismo
		
		pantallaCalculadora = new JTextField();//cuadro de texto, con todos sus datos
		pantallaCalculadora.setBounds(11, 11, 291, 43);
		pantallaCalculadora.setHorizontalAlignment(SwingConstants.RIGHT);
		pantallaCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(pantallaCalculadora);
		pantallaCalculadora.setColumns(1);
		
		JButton botonPuntoDecimal = new JButton(".");
		botonPuntoDecimal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonPuntoDecimal.setBounds(159, 315, 70, 52);
		frame.getContentPane().add(botonPuntoDecimal);
		
		JButton botonIgual = new JButton("=");
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonIgual.setBounds(232, 256, 70, 111);
		frame.getContentPane().add(botonIgual);
		
		JButton botonSuma = new JButton("+");
		botonSuma.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonSuma.setBounds(232, 193, 70, 52);
		frame.getContentPane().add(botonSuma);
		
		JButton botonResta = new JButton("-");
		botonResta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonResta.setBounds(232, 133, 70, 52);
		frame.getContentPane().add(botonResta);
		
		JButton botonDelete = new JButton("Del");
		botonDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonDelete.setBounds(232, 68, 70, 52);
		frame.getContentPane().add(botonDelete);
		
		JButton botonDivision = new JButton("/");
		botonDivision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonDivision.setBounds(158, 68, 70, 52);
		frame.getContentPane().add(botonDivision);
		
		JButton botonMultiplicacion = new JButton("*");
		botonMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonMultiplicacion.setBounds(84, 68, 70, 52);
		frame.getContentPane().add(botonMultiplicacion);
		
		JButton botonClear = new JButton("C");
		botonClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonClear.setBounds(10, 68, 70, 52);
		frame.getContentPane().add(botonClear);
		
		JButton botonNumCero = new JButton("0");
		botonNumCero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumCero.setBounds(11, 315, 145, 52);
		frame.getContentPane().add(botonNumCero);
		
		JButton botonNumUno = new JButton("1");
		botonNumUno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonNumUno.setBounds(10, 256, 70, 52);
		frame.getContentPane().add(botonNumUno);
		
		JButton botonNumDos = new JButton("2");
		botonNumDos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumDos.setBounds(84, 256, 70, 52);
		frame.getContentPane().add(botonNumDos);
		
		JButton botonNumTres = new JButton("3");
		botonNumTres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumTres.setBounds(158, 256, 70, 52);
		frame.getContentPane().add(botonNumTres);
		
		JButton botonNumCuatro = new JButton("4");
		botonNumCuatro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumCuatro.setBounds(10, 193, 70, 52);
		frame.getContentPane().add(botonNumCuatro);
		
		JButton botonNumCinco = new JButton("5");
		botonNumCinco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumCinco.setBounds(84, 193, 70, 52);
		frame.getContentPane().add(botonNumCinco);
		
		JButton botonNumSeis = new JButton("6");
		botonNumSeis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumSeis.setBounds(158, 193, 70, 52);
		frame.getContentPane().add(botonNumSeis);
		
		JButton botonNumSiete = new JButton("7");
		botonNumSiete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumSiete.setBounds(10, 133, 70, 52);
		frame.getContentPane().add(botonNumSiete);
		
		JButton botonNumOcho = new JButton("8");
		botonNumOcho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumOcho.setBounds(84, 133, 70, 52);
		frame.getContentPane().add(botonNumOcho);
		
		JButton botonNumNueve = new JButton("9");
		botonNumNueve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonNumNueve.setBounds(158, 133, 70, 52);
		frame.getContentPane().add(botonNumNueve);
	}
}
