package com.team.itb.wave8.demo.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int ano;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static final String CARACTER_UNION_FECHA = "/";


    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 0;
    }

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean validarFecha(){
        this.sdf.setLenient(false);
        try {
            this.sdf.parse(this.toString());
            return true;
        } catch (ParseException e){
            return false;
        }
    }

    public void incrementarDia() throws Exception {
        if(validarFecha()){
            Calendar calendario = GregorianCalendar.getInstance();
            calendario.set(Calendar.DAY_OF_MONTH,this.dia);
            calendario.set(Calendar.MONTH,this.mes-1);
            calendario.set(Calendar.YEAR,this.ano);

            calendario.add(Calendar.DAY_OF_MONTH,1);

            String nuevaFecha[] = sdf.format(calendario.getTime()).split("/");
            this.dia = Integer.parseInt(nuevaFecha[0]);
            this.mes = Integer.parseInt(nuevaFecha[1]);
            this.ano = Integer.parseInt(nuevaFecha[2]);

        } else {
            throw new Exception("Error, la fecha no esta configurada correctamente");
        }
    }

    @Override
    public String toString() {
        return dia + CARACTER_UNION_FECHA + mes + CARACTER_UNION_FECHA + ano;
    }
}
