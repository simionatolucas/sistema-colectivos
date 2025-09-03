package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Colectivo {
    private final UUID idColectivo;
    public String modelo;
    public int capacidad;
    private String horaSalida;
    public String estado;

    public Colectivo(String modelo, int capacidad, String horaSalida) {
        this.idColectivo = UUID.randomUUID();
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.horaSalida = horaSalida;
        this.estado = "Detenido";
    }

    public UUID getId() {
        return idColectivo;
    }

    public void arrancar() {
        this.estado = "Encendido";
        System.out.println(String.format("Arrancando el colectivo ID: %s", idColectivo));
    }

    public void detener() {
        this.estado = "Detenido";
        System.out.println(String.format("Deteniendo el colectivo ID: %s", idColectivo));
    }

    public String verHorario() {
        return this.horaSalida;
    }
}