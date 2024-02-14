package Modelo;

public class Estudiante extends Persona {
	String edad;
	int nota1;
	int nota2;
	int nota3;
	int nota4;
	int promedio;

	public Estudiante(String nombre, String apellido, String id, String edad, int nota1, int nota2, int nota3,
			int nota4, int promedio) {
		super(nombre, apellido, id);
		// TODO Auto-generated constructor stub
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public int getNota4() {
		return nota4;
	}

	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

}
