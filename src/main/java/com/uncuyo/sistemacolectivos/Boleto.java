package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Boleto {
    private final UUID idBoleto;
    public String fechaEmision;
    public double precio;
    public UUID pasajero;

    public Boleto(String fechaEmision, double precio, UUID pasajero) {
        this.idBoleto = UUID.randomUUID();
        this.fechaEmision = fechaEmision;
        this.precio = precio;
        this.pasajero = pasajero; 
    }

    public UUID getId() {
        return this.idBoleto;
    }

    public void verDetalles() {
        System.out.println(String.format("Detalles del boleto %s asociado al pasajero %s:", this.idBoleto, this.pasajero));
        System.out.println(String.format("Fecha de emisión: %s ; Precio del boleto: %f", this.fechaEmision, this.precio));
    }
}