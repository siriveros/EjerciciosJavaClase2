package com.team.itb.wave8.demo.negocio;

public class CuentaCorriente {

    private String numeroCuenta;
    private double saldo;
    private double limiteTransferencia;
    private double limiteEgreso;
    private double limiteSobregiro;

    public CuentaCorriente() {
        this.numeroCuenta = "";
        this.saldo = 0;
        this.limiteTransferencia = 0;
        this.limiteEgreso = 0;
        this.limiteSobregiro = 0;
    }

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteTransferencia, double limiteEgreso, double limiteSobregiro) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.limiteTransferencia = limiteTransferencia;
        this.limiteEgreso = limiteEgreso;
        this.limiteSobregiro = limiteSobregiro;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.numeroCuenta = cuentaCorriente.numeroCuenta;
        this.saldo = cuentaCorriente.saldo;
        this.limiteTransferencia = cuentaCorriente.limiteTransferencia;
        this.limiteEgreso = cuentaCorriente.limiteEgreso;
        this.limiteSobregiro = cuentaCorriente.limiteSobregiro;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteTransferencia() {
        return limiteTransferencia;
    }

    public void setLimiteTransferencia(double limiteTransferencia) {
        this.limiteTransferencia = limiteTransferencia;
    }

    public double getLimiteEgreso() {
        return limiteEgreso;
    }

    public void setLimiteEgreso(double limiteEgreso) {
        this.limiteEgreso = limiteEgreso;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public void ingreso(double montoIngreso){
        this.saldo += montoIngreso;
    }

    public void egreso(double montoEgreso) throws Exception {
        if(montoEgreso > this.limiteEgreso){
            throw new Exception("El monto del egreso supera el limite definido");
        }

        if(this.saldo - montoEgreso < this.limiteSobregiro){
            throw new Exception("Nos quedamos pobres :(");
        }

        this.saldo -= montoEgreso;
    }

    public void reintegro(double montoReintegro){
        this.ingreso(montoReintegro);
    }

    public void transferencia(double montoTransferencia, CuentaCorriente cuentaDestino) throws Exception {
        if(montoTransferencia > this.limiteTransferencia){
            throw new Exception("El monto del egreso supera el limite definido");
        }

        if(this.saldo - montoTransferencia < 0){
            throw new Exception("Nos quedamos pobres :(");
        }

        this.saldo -= montoTransferencia;
        cuentaDestino.ingreso(montoTransferencia);
    }
}
