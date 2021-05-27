package com.team.itb.wave8.demo;

import com.team.itb.wave8.demo.negocio.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Harry Potter");
        libro.setAutor("J. K Rowling");
        libro.setIsbn("9780545582889");

        System.out.println(libro.toString());
    }
}
