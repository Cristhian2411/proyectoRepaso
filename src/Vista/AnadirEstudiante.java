package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnadirEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField contIdentificacion;
	private JTextField contNombre;
	private JTextField contApellido;
	private JTable Tabla2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirDocentes frame = new AñadirDocentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AnadirEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 572);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 775, 539);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Cristhian lopez\\Downloads\\images.png"));
		lblNewLabel.setBounds(509, 0, 256, 159);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Administrador");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(167, 10, 138, 29);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Identificacion");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(26, 112, 100, 21);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Nombre");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(147, 112, 100, 21);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Apellido");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(258, 112, 100, 21);
		panel.add(lblNewLabel_2_2);

		contIdentificacion = new JTextField();
		contIdentificacion.setBounds(30, 143, 96, 19);
		panel.add(contIdentificacion);
		contIdentificacion.setColumns(10);

		contNombre = new JTextField();
		contNombre.setColumns(10);
		contNombre.setBounds(147, 143, 96, 19);
		panel.add(contNombre);

		contApellido = new JTextField();
		contApellido.setColumns(10);
		contApellido.setBounds(258, 143, 96, 19);
		panel.add(contApellido);

		Tabla2 = new JTable();
		Tabla2.setModel(new DefaultTableModel(
				new Object[][] {
						{ "Identificacion", "Nombre", "Apellido", "nota1", "Nota2", "Nota3", "nota4", "promedio" }, },
				new String[] { "Identificacion", "Nombre", "Apellido", "New column", "New column", "New column",
						"New column", "New column" }));
		Tabla2.setBounds(23, 190, 672, 193);
		panel.add(Tabla2);

		JButton AÑADIR = new JButton("Añadir");
		AÑADIR.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		AÑADIR.setBounds(26, 494, 100, 21);
		panel.add(AÑADIR);

		AÑADIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String identificacion = contIdentificacion.getText();
				String nombre = contNombre.getText();
				String apellido = contApellido.getText();

				DefaultTableModel model = (DefaultTableModel) Tabla2.getModel();
				model.addRow(new Object[] { identificacion, nombre, apellido, "" });

				contIdentificacion.setText("");
				contNombre.setText("");
				contApellido.setText("");

			}
		});

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnEliminar.setBounds(167, 496, 100, 21);
		panel.add(btnEliminar);

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = Tabla2.getSelectedRow();
				if (selectedRow != -1) {
					DefaultTableModel model = (DefaultTableModel) Tabla2.getModel();
					model.removeRow(selectedRow);
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAtras.setBounds(651, 494, 100, 21);
		panel.add(btnAtras);

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Crea una instancia de la ventana del menú principal y hazla visible
				MenuAdministrador menuPrincipal = new MenuAdministrador();
				menuPrincipal.setVisible(true);
				// Cierra la ventana actual
				dispose();
			}
		});

		JLabel lblNewLabel_1_1 = new JLabel("Añadir Estudiante");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(23, 73, 181, 29);
		panel.add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("Actualizar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setBounds(308, 496, 138, 21);
		panel.add(btnNewButton);
	}
}
