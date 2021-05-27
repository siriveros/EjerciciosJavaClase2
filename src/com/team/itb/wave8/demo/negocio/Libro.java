package com.team.itb.wave8.demo.negocio;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private String propietario;
    private boolean estaDisponible;

    public static final String NOMBRE_TIENDA = "Libritos Juan";

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.isbn = "";
        this.propietario = NOMBRE_TIENDA;
        this.estaDisponible = true;
    }

    public Libro(String titulo, String autor, String isbn, String propietario, boolean estaDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.propietario = propietario;
        this.estaDisponible = estaDisponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public void prestarLibro(String nombreCliente) throws Exception {
        if(!estaDisponible){
            throw  new Exception("Error el libro ya esta prestado");
        }
        this.estaDisponible = false;
        this.propietario = nombreCliente;
    }

    public void devolverLibro() throws Exception {
        if(estaDisponible){
            throw new Exception("Que paso aca? ");
        }
        this.estaDisponible = true;
        this.propietario = NOMBRE_TIENDA;
    }

    @Override
    public String toString() {
        return this.titulo + " - " + this.autor + " - " + this.isbn +  " - " + (estaDisponible?"El libro esta disponible":"El libro no esta disponible");
    }
}
