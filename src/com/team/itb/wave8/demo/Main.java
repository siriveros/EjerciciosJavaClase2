package com.team.itb.wave8.demo;

import com.team.itb.wave8.demo.negocio.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CuentaCorriente cuentaCorriente = new CuentaCorriente("605-000000-1234", 50000, 500, 100000, -1000);

        System.out.println(cuentaCorriente);

        cuentaCorriente.ingreso(2400);

        System.out.println(cuentaCorriente);

        cuentaCorriente.egreso(52500);

        System.out.println(cuentaCorriente);

        cuentaCorriente.reintegro(10000);

        System.out.println(cuentaCorriente);

        cuentaCorriente.transferencia(500,new CuentaCorriente());

        System.out.println(cuentaCorriente);

        System.out.println("==========================================================");

        Contador contador = new Contador(2);

        System.out.println(contador);

        contador.decrementarContador();
        contador.decrementarContador();

        System.out.println(contador);

        contador.incrementarContador();

        System.out.println(contador);

        System.out.println("==========================================================");


        Fracciones fraccion1 = new Fracciones(8);
        Fracciones fraccion2 = new Fracciones(4, 3);
        Fracciones resultadoSuma = fraccion1.sumarFracciones(fraccion2);

        System.out.println("La suma de fracciones = " + resultadoSuma);

        Fracciones resultadoResta = fraccion1.restarFracciones(fraccion2);

        System.out.println("La resta de fracciones = " + resultadoResta);

        Fracciones resultadoMultiplicacion = fraccion1.multiplicarFracciones(fraccion2);

        System.out.println("La multiplicacion de Fracciones = " + resultadoMultiplicacion);

        Fracciones resultadoDivision = fraccion1.dividirFracciones(fraccion2);

        System.out.println("La division de Fracciones = " + resultadoDivision);

        System.out.println("==========================================================");

        Libro libro = new Libro();
        libro.setTitulo("Harry Potter");
        libro.setAutor("J. K Rowling");
        libro.setIsbn("9780545582889");

        System.out.println(libro);

        libro.prestarLibro("Simon");

        System.out.println(libro);

        libro.devolverLibro();

        System.out.println(libro);

        System.out.println("==========================================================");

        Fecha fecha = new Fecha(31, 12, 2014);
        System.out.println(fecha.validarFecha());
        fecha.incrementarDia();
        System.out.println(fecha.toString());

        Fecha fecha2 = new Fecha(32, 22, 2014);
        System.out.println(fecha2.validarFecha());

        System.out.println("==========================================================");

        System.out.print("-");
        System.out.print(StringUtils.indexOfN("Hola Mundo", 'o', 3));
        System.out.print("-");
    }
}
