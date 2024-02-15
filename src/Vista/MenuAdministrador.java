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

public class MenuAdministrador extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

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
        setBounds(100, 100, 452, 477);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(10, 10));

        // Panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(5, 1, 5, 5));
        JButton botonADocente = new JButton("Añadir Docente");
        botonADocente.addActionListener(this::accionAnadirDocente);
        panelBotones.add(botonADocente);

        JButton botonAestudiante = new JButton("Añadir Estudiantes");
        botonAestudiante.addActionListener(this::accionAnadirEstudiante);
        panelBotones.add(botonAestudiante);

        JButton btnListarDocentes = new JButton("Listar Docentes");
        btnListarDocentes.addActionListener(this::accionListarDocentes);
        panelBotones.add(btnListarDocentes);

        JButton btnListarEstudiantes = new JButton("Listar Estudiantes");
        btnListarEstudiantes.addActionListener(this::accionListarEstudiantes);
        panelBotones.add(btnListarEstudiantes);

        contentPane.add(panelBotones, BorderLayout.CENTER);

        // Botón Atrás
        JButton btnAtras = new JButton("Atrás");
        btnAtras.addActionListener(e -> {
            Login login = new Login();
            login.setVisible(true);
            dispose();
        });
        contentPane.add(btnAtras, BorderLayout.SOUTH);
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
        this.setVisible(false); // Opcional: Oculta la ventana actual
    }

    private void accionListarEstudiantes(ActionEvent e) {
        ListarEstudiantes ventanaListarEstudiantes = new ListarEstudiantes(); // Asume que esta es tu clase para listar estudiantes
        ventanaListarEstudiantes.setVisible(true);
        this.setVisible(false); // Opcional: Oculta la ventana actual
    }

}
