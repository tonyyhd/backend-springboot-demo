package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;

@Entity // Se agrega la anotación @Entity para indicar que es una entidad JPA.
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    // Relación OneToMany: Una categoría puede tener muchos productos.
    @OneToMany(mappedBy = "categoria") // Se hace referencia al atributo "categoria" en la clase Productos.
    private List<Productos> productos;

    public Categorias() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categorias id(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Categorias nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "{" +
                " id='" + id + "'" +
                ", nombre='" + nombre + "'" +
                ", descripcion='" + descripcion + "'" +
                "}";
    }
}
