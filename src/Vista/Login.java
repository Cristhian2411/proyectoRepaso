package Vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuarioField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(492, 361);
		setLocationRelativeTo(null); // Centra la ventana en la pantalla
		setTitle("Inicio de Sesión");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBackground(new Color(24, 148, 231));
		panel.setPreferredSize(new Dimension(218, 340));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(Box.createVerticalStrut(50)); // Espacio en blanco
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		panel.add(Box.createVerticalStrut(20)); // Espacio en blanco
		panel.add(lblNewLabel_1);

		usuarioField = new JTextField();
		usuarioField.setColumns(10);
		panel.add(usuarioField);

		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		panel.add(Box.createVerticalStrut(20)); // Espacio en blanco
		panel.add(lblNewLabel_1_1);

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel.add(passwordField);

		JButton botonIngresar = new JButton("Ingresar");
		botonIngresar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		panel.add(Box.createVerticalStrut(20)); // Espacio en blanco
		panel.add(botonIngresar);

		// Panel derecho para las imágenes
		JPanel panelImagenes = new JPanel();
		panelImagenes.setBackground(Color.WHITE);
		contentPane.add(panelImagenes, BorderLayout.CENTER);
		panelImagenes.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("images.png")); // Asegúrate de tener las imágenes en el
		lblNewLabel_2.setBounds(0, 0, 250, 157);
																		// directorio correcto
		panelImagenes.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(new ImageIcon("C:\\Users\\Cristhian lopez\\Downloads\\images.png")); // Asegúrate de tener las imágenes en el
		lblNewLabel_3.setBounds(0, 157, 250, 157);
																		// directorio correcto
		panelImagenes.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 250, 314);
		panelImagenes.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Cristhian lopez\\Downloads\\logo.png"));
		lblNewLabel_4.setBounds(0, 0, 262, 175);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 173, 262, 141);
		panel_1.add(lblNewLabel_5);

		// Acción del botón Ingresar
		botonIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = usuarioField.getText();
				String password = new String(passwordField.getPassword());

				if (usuario.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(Login.this, "No puede existir un dato vacío o en blanco");
				} else {
					if (usuario.equals("1") && password.equals("2")) {
						JOptionPane.showMessageDialog(Login.this, "Bienvenido");

						// Abre la ventana llamada "Principal" para el usuario "CaSeLu"
						if (usuario.equals("1")) {
							MenuAdministrador principal = new MenuAdministrador();
							principal.setVisible(true);
							dispose();
						}

					} else {
						JOptionPane.showMessageDialog(Login.this, "Contraseña o usuario incorrectos");
					}
				}
			}
		});
	}
}