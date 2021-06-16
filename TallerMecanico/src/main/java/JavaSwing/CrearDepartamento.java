package JavaSwing;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import Modelos.*;

public class CrearDepartamento {

	private JFrame frame;
	private JTextField textID;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearDepartamento window = new CrearDepartamento();
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
	public CrearDepartamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//creo listas de cada departamento
		List<ChapaPintura> todosChapaPintura=new ArrayList<>();
		List<Mecanica> todosMecanica=new ArrayList<>();
		List<Ventas> todosVentas=new ArrayList<>();
		
		//creo listas de cada trabajador y su respectivo departamento
		List<Trabajador> listaTrabajadoresCP = null;
		List<Trabajador> listaTrabajadoresM = null;
		List<Trabajador> listaTrabajadoresV = null;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JRadioButton rdbtnChapa = new JRadioButton("Departamento Chapa y pintura");
		rdbtnChapa.setBounds(29, 39, 212, 23);
		frame.getContentPane().add(rdbtnChapa);

		JRadioButton rdbtnMecanica = new JRadioButton("Departamento Mecanica");
		rdbtnMecanica.setBounds(29, 65, 177, 23);
		frame.getContentPane().add(rdbtnMecanica);

		JRadioButton rdbtnVentas = new JRadioButton("Departamento Ventas");
		rdbtnVentas.setBounds(29, 92, 164, 23);
		frame.getContentPane().add(rdbtnVentas);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnChapa);
		buttonGroup.add(rdbtnVentas);
		buttonGroup.add(rdbtnMecanica);
		
		JRadioButton rdbtnZgz = new JRadioButton("Zaragoza");
		rdbtnZgz.setBounds(29, 161, 212, 23);
		frame.getContentPane().add(rdbtnZgz);

		JRadioButton rdbtnHuesca = new JRadioButton("Huesca");
		rdbtnHuesca.setBounds(29, 187, 177, 23);
		frame.getContentPane().add(rdbtnHuesca);

		JRadioButton rdbtnTeruel = new JRadioButton("Teruel");
		rdbtnTeruel.setBounds(29, 217, 164, 23);
		frame.getContentPane().add(rdbtnTeruel);
		
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnTeruel);
		buttonGroup2.add(rdbtnHuesca);
		buttonGroup2.add(rdbtnZgz);
		
		textID = new JTextField();
		textID.setBounds(377, 93, 96, 20);
		frame.getContentPane().add(textID);
		textID.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(377, 218, 96, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(319, 96, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(319, 221, 48, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Añadir trabajador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id= Integer.parseInt(textID.getText());
				String nombre=textNombre.getText();
				
				
				if(rdbtnChapa.isSelected()) {
					if(rdbtnZgz.isSelected()) {
						Trabajador trabajador=new Trabajador(id, nombre);
						//listaTrabajadoresCP.add(trabajador);
						System.out.println("Trabajador añadido");
						ChapaPintura departamentoCP=DepartamentosBuilder.crearChapaPintura(id, listaTrabajadoresCP, "Zaragoza");
					}
					if(rdbtnHuesca.isSelected()) {
						Trabajador trabajador=new Trabajador(id, nombre);
						listaTrabajadoresCP.add(trabajador);
						System.out.println("Trabajador añadido");
						ChapaPintura departamentoCP=DepartamentosBuilder.crearChapaPintura(id, listaTrabajadoresCP, "Huesca");
					}
					if(rdbtnTeruel.isSelected()) {
						Trabajador trabajador=new Trabajador(id, nombre);
						listaTrabajadoresCP.add(trabajador);
						System.out.println("Trabajador añadido");
						ChapaPintura departamentoCP=DepartamentosBuilder.crearChapaPintura(id, listaTrabajadoresCP, "Teruel");
					}
				}
				
			}
		});
		btnNewButton.setBounds(157, 358, 164, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIrADar = new JButton("Ir a dar de alta");
		btnIrADar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				WindowEvent closeWindow = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
				
				
				DardeAlta ventana=new DardeAlta();
				ventana.frame.setVisible(true);
				ventana.frame.setDefaultCloseOperation(2);
			}
		});
		btnIrADar.setBounds(435, 358, 142, 23);
		frame.getContentPane().add(btnIrADar);
		
		

	}
}
