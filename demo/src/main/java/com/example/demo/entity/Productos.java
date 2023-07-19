package com.example.demo.entity;

import java.util.Date;

import javax.persistence.*;

@Entity // Se agrega la anotación @Entity para indicar que es una entidad JPA.
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double precio;

    @Temporal(TemporalType.TIMESTAMP) // Se especifica el tipo de dato temporal para fechas.
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP) // Se especifica el tipo de dato temporal para fechas.
    private Date fechaActualizacion;

    // Relación ManyToOne: Un producto pertenece a una categoría.
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categoria;

    public Productos() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return this.fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Categorias getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }




    @Override
    public String toString() {
        return "{" +
                " id='" + id + "'" +
                ", nombre='" + nombre + "'" +
                ", descripcion='" + descripcion + "'" +
                ", precio='" + precio + "'" +
                ", fechaCreacion='" + fechaCreacion + "'" +
                ", fechaActualizacion='" + fechaActualizacion + "'" +
                ", categoria='" + categoria + "'" +
                "}";
    }
}
