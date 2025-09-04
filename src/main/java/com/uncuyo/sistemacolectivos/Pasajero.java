package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Pasajero extends Persona {
    private final UUID idPasajero;
    public String destino;
    public String abonoTarjeta;
    public Tarjeta tarjeta;
    public Historial historial;
    public boolean pagoPasaje;
    public boolean solicitoParada;

    public Pasajero(String nombre, String telefono, String email, String destino, String abonoTarjeta) {
        super(nombre, telefono, email);
        this.destino = destino;
        this.idPasajero = UUID.randomUUID();
        this.abonoTarjeta = abonoTarjeta;
        this.tarjeta = new Tarjeta(this.idPasajero);
        this.historial = new Historial(this.idPasajero);
        this.pagoPasaje = false;
        this.solicitoParada = false;
    }

    public UUID getId() {
        return idPasajero;
    }

    public void pagarPasaje(double monto) {
        this.pagoPasaje = true;
        this.tarjeta.actualizarSaldo(this.abonoTarjeta, monto);
        this.historial.agregarViaje(this.destino, this.abonoTarjeta);
    }

    public void solicitarParada() {
        this.solicitoParada = true;
    }
}