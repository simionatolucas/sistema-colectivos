package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Tarjeta {
    private final UUID idTarjeta;
    public UUID pasajero;
    private double saldo;

    public Tarjeta(UUID pasajero) {
        UUID uuid = UUID.randomUUID();

        this.idTarjeta = uuid;
        this.pasajero = pasajero;
        this.saldo = 10000;
    }

    public UUID getId() {
        return idTarjeta;
    }

    public void actualizarSaldo(String abonoTarjeta, double monto) {
        if (abonoTarjeta == "Medio") {
            monto = monto/2;
        } else if (abonoTarjeta == "Total") {
            monto = 0;
        }
        this.saldo -= monto;
        System.out.println(String.format("El pasajero ID: %s pagó su pasaje. ; Nuevo saldo: %.2f", this.pasajero, this.saldo));
    }

    public void verSaldo() {
        System.out.println(this.saldo);
    }
}