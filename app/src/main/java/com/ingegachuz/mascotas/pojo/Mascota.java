package com.ingegachuz.mascotas.pojo;

/**
 * Created by Inge on 29/05/2016.
 */
public class Mascota {

    private int id;
    private String nombre;
    private int foto;
    private int cantidad;


    public Mascota(int foto, String nombre, int cantidad) {
        this.foto = foto;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Mascota() {

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
