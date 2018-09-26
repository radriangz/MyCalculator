package calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class CalculatorWithSwing {

	private JFrame frame;

	/**
	 * Lanza la app.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWithSwing window = new CalculatorWithSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
