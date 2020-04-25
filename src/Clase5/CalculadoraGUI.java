package Clase5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class CalculadoraGUI {

	private JFrame frame;
	private JTextField txtNro1;
	private JTextField txtNro2;
	private static Calculadora calculadora;
	private int divide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGUI window = new CalculadoraGUI();
					calculadora = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(34, 113, 172, 31);
		frame.getContentPane().add(lblResultado);
		
		txtNro1 = new JTextField();
		txtNro1.setBounds(34, 14, 116, 22);
		frame.getContentPane().add(txtNro1);
		txtNro1.setColumns(10);
		
		txtNro2 = new JTextField();
		txtNro2.setBounds(34, 52, 116, 22);
		frame.getContentPane().add(txtNro2);
		txtNro2.setColumns(10);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setOperacion(0);
			}
		});
		btnSumar.setBounds(218, 13, 97, 25);
		frame.getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.setOperacion(1);
			}
		});
		btnRestar.setBounds(323, 13, 97, 25);
		frame.getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.setOperacion(2);
			}
		});
		btnMultiplicar.setBounds(218, 51, 97, 25);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.setOperacion(3);
				divide = 1;
			}
		});
		btnDividir.setBounds(323, 51, 97, 25);
		frame.getContentPane().add(btnDividir);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.setPrimerNro(Double.parseDouble(txtNro1.getText()));
				calculadora.setSegundoNro(Double.parseDouble(txtNro2.getText()));
				calculadora.calcular();
				if (divide == 1 && Double.parseDouble(txtNro2.getText()) == 0 ) {
					lblResultado.setText("No se puede dividir por 0");
				}
				else {
					lblResultado.setText("" + calculadora.getResultado());
				}
			}
		});
		btnIgual.setBounds(218, 124, 97, 25);
		frame.getContentPane().add(btnIgual);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.borrar();
				txtNro1.setText("");
				txtNro2.setText("");
				lblResultado.setText("");
				divide = 0;
			}
		});
		btnClear.setBounds(323, 124, 97, 25);
		frame.getContentPane().add(btnClear);
		
	}
}
