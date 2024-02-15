package Modelo;

import java.util.List;

public class Administrador extends Persona {

    public Administrador(String nombre, String apellido, String id) {
        super(nombre, apellido, id);
    }

    // Asignar un docente a una materia
    public void asignarDocenteAMateria(Docente docente, Asignatura asignatura) {
        asignatura.setDocente(docente);
    }

    // Registrar un nuevo estudiante en el sistema
    public void registrarEstudiante(Estudiante estudiante, List<Estudiante> estudiantes) {
        estudiantes.add(estudiante);
    }

    // Registrar una nueva asignatura en el sistema
    public void registrarAsignatura(Asignatura asignatura, List<Asignatura> asignaturas) {
        asignaturas.add(asignatura);
    }

    // Ingresar calificaciones para un estudiante en una asignatura
    public void ingresarCalificacionesEstudiante(Estudiante estudiante, String codigoAsignatura, int nota) {
        estudiante.agregarCalificacion(codigoAsignatura, nota);
    }


    // Cerrar inscripciones para una materia
    public void cerrarInscripcionesAsignatura(Asignatura asignatura) {
        asignatura.setEstadoApertura(Asignatura.EstadoApertura.CERRADO);
    }

    // Abrir inscripciones para una materia
    public void abrirInscripcionesAsignatura(Asignatura asignatura) {
        asignatura.setEstadoApertura(Asignatura.EstadoApertura.ABIERTO);
    }
    
    // Método para habilitar o deshabilitar una asignatura
    public void cambiarEstadoHabilitacionAsignatura(Asignatura asignatura, boolean habilitada) {
        int indicador = habilitada ? 1 : 0;
        asignatura.setIndicadorHabilitacion(indicador);
    }
}
