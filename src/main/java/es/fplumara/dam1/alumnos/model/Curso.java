package es.fplumara.dam1.alumnos.model;

public class Curso {
    private int id;
    private String nombre;
    private Boolean activo;

    //Constructores
    public Curso(int id, String nombre, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", activo=" + activo +
                '}';
    }
}
