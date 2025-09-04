package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class MaquinaCobro {
    private double monto;

    public MaquinaCobro(double monto) {
        this.monto = monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return this.monto;
    }

    public void procesarPago(UUID pasajero) {
        System.out.println(String.format("Procesando pago de %f al pasajero ID:%s", monto, pasajero));
    }
}