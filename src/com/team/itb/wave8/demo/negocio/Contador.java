package com.team.itb.wave8.demo.negocio;

public class Contador {

    private int numeroActual;

    public Contador() {
        this.numeroActual = 0;
    }

    public Contador(int numeroActual) {
        this.numeroActual = numeroActual;
    }

    public Contador(Contador contador) {
        this.numeroActual = contador.numeroActual;
    }

    public int getNumeroActual() {
        return numeroActual;
    }

    public void setNumeroActual(int numeroActual) throws Exception {
        if(numeroActual < 0){
            throw new Exception("Error el contador quedo negativo");
        }
        this.numeroActual = numeroActual;
    }

   public void incrementarContador(){
        this.numeroActual++;
   }

   public void reiniciarContador(){
        this.numeroActual = 0;
   }

   public void decrementarContador() throws Exception {
        if(this.numeroActual - 1 < 0){
            throw new Exception("Error el contador quedo negativo");
        }
        this.numeroActual--;
   }

}
