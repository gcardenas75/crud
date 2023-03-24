package com.practica.crud.models;

import jakarta.persistence.*;

@Entity
@Table (name = "articulos")
public class Articulo {


    //1. Entidades
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCliente;
    private String nombre;
    private String color;

    //2. Constructores
    public Articulo (){

    }

    public Articulo(Long id, Long idCliente, String nombre, String color) {
        this.id = id;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.color = color;
    }

    //3. Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
