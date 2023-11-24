package com.atenea.practicaviewmodel.Models;

public class Usuario {
    private String nombre;
    private int edad;
    private String contrasena;

    public Usuario(String nombre, int edad, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
