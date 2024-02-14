package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MenuAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdministrador frame = new MenuAdministrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 452, 440);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Administrador");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel.setBounds(122, 10, 208, 26);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Cristhian lopez\\Downloads\\logo.png"));
		lblNewLabel_1.setBounds(203, 34, 249, 159);
		panel.add(lblNewLabel_1);

		JButton botonADocente = new JButton("Añadir Docente");
		botonADocente.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		botonADocente.setBounds(10, 86, 167, 33);
		panel.add(botonADocente);
		botonADocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abre la ventana de Añadir Docente
				AñadirDocentes ventanaAñadirDocente = new AñadirDocentes();
				ventanaAñadirDocente.setVisible(true);
				dispose(); // Cierra la ventana actual
			}
		});

		JButton botonAestudiante = new JButton("Añadir Estudiantes");
		botonAestudiante.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		botonAestudiante.setBounds(10, 149, 167, 33);
		panel.add(botonAestudiante);
		botonAestudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abre la ventana de Añadir Estudiante
				AnadirEstudiante ventanaAñadirEstudiante = new AnadirEstudiante();
				ventanaAñadirEstudiante.setVisible(true);
				dispose(); // Cierra la ventana actual
			}
		});

		JButton btnListarDocentes = new JButton("Listar Docentes");
		btnListarDocentes.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnListarDocentes.setBounds(10, 214, 167, 33);
		panel.add(btnListarDocentes);

		JButton btnListarEstudiantes = new JButton("Listar Estudiantes");
		btnListarEstudiantes.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnListarEstudiantes.setBounds(10, 277, 167, 33);
		panel.add(btnListarEstudiantes);

		JButton btnAtras = new JButton("Atrás");
		btnAtras.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAtras.setBounds(341, 409, 85, 21);
		panel.add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Crea una instancia de la ventana del menú principal y hazla visible
		        Login menuPrincipal = new Login();
		        menuPrincipal.setVisible(true);
		        // Cierra la ventana actual
		        dispose();
		    }
		});
	}

}
