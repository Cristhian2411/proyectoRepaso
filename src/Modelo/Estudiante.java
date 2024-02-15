package Modelo;

import java.util.HashMap;
import java.util.Map;

public class Estudiante extends Persona {
    private int edad;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int promedio;
    private Map<String, Integer> calificaciones; // Incluido para manejar calificaciones por asignatura

    public Estudiante(String nombre, String apellido, String id, int edad, int nota1, int nota2, int nota3, int nota4) {
        super(nombre, apellido, id);
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        calificaciones = new HashMap<>(); // Inicialización del mapa
        calcularPromedio(); // Asegura que el promedio se calcule correctamente al crear el objeto
    }

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
		calcularPromedio();
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
		calcularPromedio();
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
		calcularPromedio();
	}

	public int getNota4() {
		return nota4;
	}

	public void setNota4(int nota4) {
		this.nota4 = nota4;
		calcularPromedio();
	}

	public int getPromedio() {
		return promedio;
	}

	// Nota: No hay setPromedio ya que este se calcula automáticamente.

	private void calcularPromedio() {
		this.promedio = (nota1 + nota2 + nota3 + nota4) / 4;
	}

	// Método para agregar o actualizar la calificación de una asignatura
	public void agregarCalificacion(String codigoAsignatura, int calificacion) {
		calificaciones.put(codigoAsignatura, calificacion);
	}

	// Método para obtener la calificación de una asignatura
	public Integer obtenerCalificacion(String codigoAsignatura) {
		return calificaciones.get(codigoAsignatura);
	}
}
