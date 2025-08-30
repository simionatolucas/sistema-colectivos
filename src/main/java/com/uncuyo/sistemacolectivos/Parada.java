package com.uncuyo.sistemacolectivos;

import java.util.UUID;

class Parada {
    private UUID idParada;
    public String nombre;
    public String ubicacion;
    private String horaLlegadaEstimada;

    public Parada(String nombre, String ubicacion, String horaLlegadaEstimada) {
        this.idParada = UUID.randomUUID();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.horaLlegadaEstimada = horaLlegadaEstimada;
    }

    public void actualizarHoraLlegada(String horaLlegadaEstimada) {
        this.horaLlegadaEstimada = horaLlegadaEstimada;
    }  

    public void verDetalles() { // Esto debería tener un return.
        System.out.println(String.format("ID Parada: %s ; Nombre: %s ; Ubicación: %s ; Hora de llegada estimada: %s", idParada, nombre, ubicacion, horaLlegadaEstimada));
    }
}