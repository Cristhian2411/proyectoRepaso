package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuAdministrador extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField BIENVENIDO;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MenuAdministrador frame = new MenuAdministrador();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MenuAdministrador() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 430, 396);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBounds(5, 5, 401, 342);
        JButton botonADocente = new JButton("Añadir Docente");
        botonADocente.setBounds(197, 109, 160, 35);
        botonADocente.addActionListener(this::accionAnadirDocente);
        panelBotones.setLayout(null);
        panelBotones.add(botonADocente);

        JButton botonAestudiante = new JButton("Añadir Estudiantes");
        botonAestudiante.setBounds(0, 109, 160, 35);
        botonAestudiante.addActionListener(this::accionAnadirEstudiante);
        panelBotones.add(botonAestudiante);

        JButton btnListarDocentes = new JButton("Listar Docentes");
        btnListarDocentes.setBounds(197, 175, 160, 35);
        btnListarDocentes.addActionListener(this::accionListarDocentes);
        panelBotones.add(btnListarDocentes);

        JButton btnListarEstudiantes = new JButton("Listar Estudiantes");
        btnListarEstudiantes.setBounds(0, 171, 160, 43);
        btnListarEstudiantes.addActionListener(this::accionListarEstudiantes);
        contentPane.setLayout(null);
        panelBotones.add(btnListarEstudiantes);

        contentPane.add(panelBotones);
        
        BIENVENIDO = new JTextField();
        BIENVENIDO.setHorizontalAlignment(SwingConstants.CENTER);
        BIENVENIDO.setFont(new Font("Tahoma", Font.PLAIN, 17));
        BIENVENIDO.setText("BIENVENIDO ADMINISTRADOR");
        BIENVENIDO.setBounds(60, 10, 256, 44);
        panelBotones.add(BIENVENIDO);
        BIENVENIDO.setColumns(10);

        // Botón Atrás
        JButton btnAtras = new JButton("Atrás");
        btnAtras.setBounds(0, 313, 150, 21);
        panelBotones.add(btnAtras);
        
        JLabel lblNewLabel = new JLabel("¿Que desea hacer?");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel.setBounds(125, 64, 140, 35);
        panelBotones.add(lblNewLabel);
        btnAtras.addActionListener(e -> {
            Login login = new Login();
            login.setVisible(true);
            dispose();
        });
    }

    private void accionAnadirDocente(ActionEvent e) {
        AñadirDocentes ventanaAñadirDocente = new AñadirDocentes(); // Asume que esta es tu clase para añadir docentes
        ventanaAñadirDocente.setVisible(true);
        this.setVisible(false); // Opcional: Oculta la ventana actual
    }

    private void accionAnadirEstudiante(ActionEvent e) {
        AnadirEstudiante ventanaAñadirEstudiante = new AnadirEstudiante(); // Asume que esta es tu clase para añadir estudiantes
        ventanaAñadirEstudiante.setVisible(true);
        this.setVisible(false); // Opcional: Oculta la ventana actual
    }

    private void accionListarDocentes(ActionEvent e) {
        ListarDocentes ventanaListarDocentes = new ListarDocentes(); // Asume que esta es tu clase para listar docentes
        ventanaListarDocentes.setVisible(true);
        this.setVisible(true); // Opcional: Oculta la ventana actual
    }

    private void accionListarEstudiantes(ActionEvent e) {
        ListarEstudiantes ventanaListarEstudiantes = new ListarEstudiantes(); // Asume que esta es tu clase para listar estudiantes
        ventanaListarEstudiantes.setVisible(true);
        this.setVisible(true); // Opcional: Oculta la ventana actual
    }
}
