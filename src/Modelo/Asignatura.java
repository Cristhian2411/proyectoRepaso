package Modelo;

public class Asignatura extends Docente {
	String codigo;
	int capacidadMax;
	int indicadorHabilitacion;

	public enum EstadoApertura {
		ABIERTO, CERRADO

	}

	private EstadoApertura EstadoApertura;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getIndicadorHabilitacion() {
		return indicadorHabilitacion;
	}

	public void setIndicadorHabilitacion(int indicadorHabilitacion) {
		this.indicadorHabilitacion = indicadorHabilitacion;
	}

	public EstadoApertura getEstadoApertura() {
		return EstadoApertura;
	}

	public void setEstadoApertura(EstadoApertura estadoApertura) {
		EstadoApertura = estadoApertura;
	}

	public Asignatura(String nombre, String apellido, String id, String codigo, int capacidadMax,
			int indicadorHabilitacion, Modelo.Asignatura.EstadoApertura estadoApertura) {
		super(nombre, apellido, id);
		this.codigo = codigo;
		this.capacidadMax = capacidadMax;
		this.indicadorHabilitacion = indicadorHabilitacion;
		EstadoApertura = estadoApertura;
	}

}
