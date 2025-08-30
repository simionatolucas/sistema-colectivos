package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Pasajero {
    private UUID idPasajero;
    public String destino;
    public UUID nroBoleto;
    public String abonoTarjeta;
    public Tarjeta tarjeta;
    public Historial historial;
    public boolean pagoPasaje;
    public boolean solicitoParada;

    public Pasajero(UUID nroBoleto, String destino, String abonoTarjeta, Tarjeta tarjeta, Historial historial) {
        this.destino = destino;
        this.nroBoleto = nroBoleto;
        this.idPasajero = UUID.randomUUID();
        this.abonoTarjeta = abonoTarjeta;
        this.tarjeta = tarjeta;
        this.historial = historial;
        this.pagoPasaje = false;
        this.solicitoParada = false;
    }

    public void pagarPasaje() {
        this.pagoPasaje = true;
        this.tarjeta.actualizarSaldo(this.abonoTarjeta);
        this.historial.agregarViaje(this.destino, this.abonoTarjeta);
    }

    public void solicitarParada() {
        this.solicitoParada = true;
    }
}