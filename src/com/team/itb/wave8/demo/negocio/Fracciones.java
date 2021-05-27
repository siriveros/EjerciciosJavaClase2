package com.team.itb.wave8.demo.negocio;

public class Fracciones {

    private int numerador;
    private int denominador;

    public Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracciones(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fracciones sumarFracciones(Fracciones f1) {
        return sumarFracciones(this, f1);
    }

    public Fracciones sumarFracciones(int numero) {
        return sumarFracciones(new Fracciones(numero));
    }

    public static Fracciones sumarFracciones(Fracciones f1, Fracciones f2) {
        int denominador = f1.getDenominador() * f2.getDenominador();
        int numerador = f1.getNumerador() * f2.getDenominador() + f2.getNumerador() * f1.getDenominador();

        Fracciones resultado = new Fracciones(numerador, denominador);
        resultado.simplificar();

        return resultado;
    }

    public Fracciones restarFracciones(Fracciones f1) {
        return restarFracciones(this, f1);
    }

    public Fracciones restarFracciones(int numero) {
        return restarFracciones(new Fracciones(numero));
    }

    public static Fracciones restarFracciones(Fracciones f1, Fracciones f2) {
        int denominador = f1.getDenominador() * f2.getDenominador();
        int numerador = f1.getNumerador() * f2.getDenominador() - f2.getNumerador() * f1.getDenominador();

        Fracciones resultado = new Fracciones(numerador, denominador);
        resultado.simplificar();

        return resultado;
    }

    public Fracciones multiplicarFracciones(Fracciones f1) {
        return multiplicarFracciones(this, f1);
    }

    public Fracciones multiplicarFracciones(int numero) {
        return multiplicarFracciones(new Fracciones(numero));
    }

    public static Fracciones multiplicarFracciones(Fracciones f1, Fracciones f2) {
        int denominador = f1.getDenominador() * f2.getDenominador();
        int numerador = f1.getNumerador() * f2.getNumerador();

        Fracciones resultado = new Fracciones(numerador, denominador);
        resultado.simplificar();

        return resultado;
    }

    public Fracciones dividirFracciones(Fracciones f1) {
        return dividirFracciones(this, f1);
    }

    public Fracciones dividirFracciones(int numero) {
        return dividirFracciones(new Fracciones(numero));
    }

    public static Fracciones dividirFracciones(Fracciones f1, Fracciones f2) {
        int denominador = f1.getDenominador() * f2.getNumerador();
        int numerador = f1.getNumerador() * f2.getDenominador();

        Fracciones resultado = new Fracciones(numerador, denominador);
        resultado.simplificar();

        return resultado;
    }

    public void simplificar() {
        int i = 2;
        while (i <= this.numerador && i <= this.denominador) {
            if (this.numerador % i == 0 && this.denominador % i == 0) {
                this.numerador = this.numerador / i;
                this.denominador = this.denominador / i;
            } else {
                i++;
            }
        }
    }
}
