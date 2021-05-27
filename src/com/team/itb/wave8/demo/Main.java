package com.team.itb.wave8.demo;

import com.team.itb.wave8.demo.negocio.Fecha;
import com.team.itb.wave8.demo.negocio.Libro;

public class Main {
    public static void main(String[] args) throws Exception {
        Libro libro = new Libro();
        libro.setTitulo("Harry Potter");
        libro.setAutor("J. K Rowling");
        libro.setIsbn("9780545582889");

        System.out.println(libro.toString());

        Fecha fecha = new Fecha(31,1,2014);
        System.out.println(fecha.validarFecha());
        fecha.incrementarDia();
        System.out.println(fecha.toString());
    }
}
