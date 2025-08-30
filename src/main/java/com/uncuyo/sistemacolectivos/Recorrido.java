package com.uncuyo.sistemacolectivos;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Iterator;

class Recorrido {
    private UUID idRuta;
    public String nombreRuta;
    public ArrayList<Parada> paradas;
    public int tiempoViaje;

    public Recorrido(String nombreRuta, int tiempoViaje) {
        this.idRuta = UUID.randomUUID();
        this.nombreRuta = nombreRuta;
        this.tiempoViaje = tiempoViaje;
        this.paradas = new ArrayList<Parada>();
    }

    public void anexarParada(Parada parada) {
        this.paradas.add(parada);
    }

    public int calcularTiempoViaje() {
        return this.tiempoViaje;
    }

    public void listarParadas() {
        Iterator<Parada> itrParadas = paradas.iterator();
        while(itrParadas.hasNext()) {
            Parada parada = itrParadas.next();
            System.out.println(String.format("Nombre: %s ; Ubicación: %s ; Hora de llegada estimada: %s", parada));
        }
    }
}