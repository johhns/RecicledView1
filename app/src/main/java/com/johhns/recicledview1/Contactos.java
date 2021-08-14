package com.johhns.recicledview1;

public class Contactos {

    private int    foto ;
    private String nombre ;
    private String telefono ;


    public Contactos(  int p_foto , String p_nombre , String p_telefono ) {
        this.foto     = p_foto ;
        this.nombre   = p_nombre ;
        this.telefono = p_telefono ;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
