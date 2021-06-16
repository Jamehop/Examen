package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DardeAlta {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DardeAlta window = new DardeAlta();
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
	public DardeAlta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JRadioButton rdbtnChapa = new JRadioButton("Departamento Chapa y pintura");
		rdbtnChapa.setBounds(50, 67, 212, 23);
		frame.getContentPane().add(rdbtnChapa);
		
		JRadioButton rdbtnMecanica = new JRadioButton("Departamento Mecanica");
		rdbtnMecanica.setBounds(50, 160, 177, 23);
		frame.getContentPane().add(rdbtnMecanica);
		
		JRadioButton rdbtnVentas = new JRadioButton("Departamento Ventas");
		rdbtnVentas.setBounds(50, 253, 164, 23);
		frame.getContentPane().add(rdbtnVentas);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnChapa);
		buttonGroup.add(rdbtnVentas);
		buttonGroup.add(rdbtnMecanica);

		JButton btnNewButton = new JButton("Dar de alta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(205, 315, 146, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
