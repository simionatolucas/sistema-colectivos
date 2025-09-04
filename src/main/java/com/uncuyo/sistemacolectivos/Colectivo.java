package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Colectivo {
    private final UUID idColectivo;
    public String modelo;
    public int capacidad;
    private String horaSalida;
    public String estado;
    public MaquinaCobro maquinaCobro; // Agregación de la clase MaquinaCobro.

    public Colectivo(String modelo, int capacidad, String horaSalida, MaquinaCobro maquinaCobro) {
        this.idColectivo = UUID.randomUUID();
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.horaSalida = horaSalida;
        this.estado = "Detenido";
        this.maquinaCobro = maquinaCobro;
    }

    public UUID getId() {
        return idColectivo;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraSalida() {
        return this.horaSalida;
    }

    public void arrancar() {
        this.estado = "Encendido";
        System.out.println(String.format("Arrancando el colectivo ID: %s", idColectivo));
    }

    public void detener() {
        this.estado = "Detenido";
        System.out.println(String.format("Deteniendo el colectivo ID: %s", idColectivo));
    }

    public void verDetalles() {
        System.out.println(String.format("Listando detalles del colectivo ID: %s", this.idColectivo));
        System.out.println(String.format("Modelo: %s ; Capacidad: %d ; Hora de salida: %s ; Estado: %s", this.modelo, this.capacidad, this.horaSalida, this.estado));
    }
}