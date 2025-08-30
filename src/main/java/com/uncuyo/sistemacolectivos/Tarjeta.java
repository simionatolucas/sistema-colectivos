package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Tarjeta {
    private UUID idTarjeta;
    public UUID pasajero;
    private double saldo;

    public Tarjeta(UUID pasajero) {
        UUID uuid = UUID.randomUUID();

        this.idTarjeta = uuid;
        this.pasajero = pasajero;
        this.saldo = 10000;
    }

    public void actualizarSaldo(String abonoTarjeta) {
        double monto = 1000;
        if (abonoTarjeta == "Medio") {
            monto = 500;
        } else if (abonoTarjeta == "Total") {
            monto = 0;
        }
        this.saldo -= monto;
        System.out.println(String.format("Nuevo saldo: %f", this.saldo));
    }

    public void verSaldo() {
        System.out.println(this.saldo);
    }
}