package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Parada {
    private final UUID idParada;
    public String nombre;
    public String ubicacion;
    private String horaLlegadaEstimada;

    public Parada(String nombre, String ubicacion, String horaLlegadaEstimada) {
        this.idParada = UUID.randomUUID();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.horaLlegadaEstimada = horaLlegadaEstimada;
    }

    public UUID getId() {
        return idParada;
    }

    public void actualizarHoraLlegada(String horaLlegadaEstimada) {
        this.horaLlegadaEstimada = horaLlegadaEstimada;
    }  

    public String verDetalles() { // Esto debería tener un return.
        return String.format("ID Parada: %s ; Nombre: %s ; Ubicación: %s ; Hora de llegada estimada: %s", idParada, nombre, ubicacion, horaLlegadaEstimada);
    }
}