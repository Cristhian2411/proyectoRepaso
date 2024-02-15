package Modelo;

public class Asignatura {
    private String nombre;
    private String codigo;
    private int capacidadMax;
    private int indicadorHabilitacion;
    private EstadoApertura estadoApertura;
    private Docente docente; // Relación con Docente

    public enum EstadoApertura {
        ABIERTO, CERRADO
    }

    public Asignatura(String nombre, String codigo, int capacidadMax, int indicadorHabilitacion, EstadoApertura estadoApertura) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidadMax = capacidadMax;
        this.indicadorHabilitacion = indicadorHabilitacion;
        this.estadoApertura = estadoApertura;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
        return estadoApertura;
    }

    public void setEstadoApertura(EstadoApertura estadoApertura) {
        this.estadoApertura = estadoApertura;
    }

    // Métodos para manejar la relación con Docente
    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
