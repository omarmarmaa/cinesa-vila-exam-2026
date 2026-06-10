package edu.iesam.domain; //cambiar por la ruta correcta

public class Pelicula {
    private String nombre;
    private String año;
    private String categoria;
    private String id;

    public Pelicula(String nombre, String año, String categoria, String id) {
        this.nombre = nombre;
        this.año = año;
        this.categoria = categoria;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", año='" + año + '\'' +
                ", categoria='" + categoria + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
