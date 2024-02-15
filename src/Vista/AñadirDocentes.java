package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AñadirDocentes extends JFrame {

    private JPanel contentPane;
    private JTextField contIdentificacion;
    private JTextField contNombre;
    private JTextField contApellido;
    private JTable tablaDocentes;
    private JTextField contAsignatura;
    private DefaultTableModel modeloTabla;

    public AñadirDocentes() {
        setTitle("Añadir Docentes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 780, 572);
        contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // Panel para formularios
        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 10, 10));
        contentPane.add(panelFormulario, BorderLayout.NORTH);

        // Agrega componentes al panelFormulario
        panelFormulario.add(new JLabel("Identificación:"));
        contIdentificacion = new JTextField();
        panelFormulario.add(contIdentificacion);

        panelFormulario.add(new JLabel("Nombre:"));
        contNombre = new JTextField();
        panelFormulario.add(contNombre);

        panelFormulario.add(new JLabel("Apellido:"));
        contApellido = new JTextField();
        panelFormulario.add(contApellido);

        panelFormulario.add(new JLabel("Asignatura:"));
        contAsignatura = new JTextField();
        panelFormulario.add(contAsignatura);

        // Tabla para mostrar los docentes añadidos
        tablaDocentes = new JTable();
        modeloTabla = new DefaultTableModel(new Object[][]{}, new String[]{"Identificación", "Nombre", "Apellido", "Asignatura"});
        tablaDocentes.setModel(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaDocentes);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Panel para botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        contentPane.add(panelBotones, BorderLayout.SOUTH);

        // Botón Añadir
        JButton btnAñadir = new JButton("Añadir");
        btnAñadir.addActionListener(this::accionAñadirDocente);
        panelBotones.add(btnAñadir);

        // Botón Eliminar
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this::accionEliminarDocente);
        panelBotones.add(btnEliminar);

        // Botón Actualizar
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(this::accionActualizarDocente);
        panelBotones.add(btnActualizar);

        // Botón Atrás
        JButton btnAtras = new JButton("Atrás");
        btnAtras.addActionListener(e -> {
            MenuAdministrador menuPrincipal = new MenuAdministrador();
            menuPrincipal.setVisible(true);
            dispose();
        });
        panelBotones.add(btnAtras);
    }

    private void accionAñadirDocente(ActionEvent e) {
        String identificacion = contIdentificacion.getText();
        String nombre = contNombre.getText();
        String apellido = contApellido.getText();
        String asignatura = contAsignatura.getText();
        
        modeloTabla.addRow(new Object[]{identificacion, nombre, apellido, asignatura});
        
        contIdentificacion.setText("");
        contNombre.setText("");
        contApellido.setText("");
        contAsignatura.setText("");
    }

    private void accionEliminarDocente(ActionEvent e) {
        int filaSeleccionada = tablaDocentes.getSelectedRow();
        if (filaSeleccionada != -1) {
            modeloTabla.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un docente para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void accionActualizarDocente(ActionEvent e) {
        int filaSeleccionada = tablaDocentes.getSelectedRow();
        if (filaSeleccionada != -1) {
            modeloTabla.setValueAt(contIdentificacion.getText(), filaSeleccionada, 0);
            modeloTabla.setValueAt(contNombre.getText(), filaSeleccionada, 1);
            modeloTabla.setValueAt(contApellido.getText(), filaSeleccionada, 2);
            modeloTabla.setValueAt(contAsignatura.getText(), filaSeleccionada, 3);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un docente para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}
