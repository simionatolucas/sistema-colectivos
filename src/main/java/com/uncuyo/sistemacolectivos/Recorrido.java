package com.uncuyo.sistemacolectivos;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Iterator;

class Recorrido {
    private final UUID idRuta;
    public String nombreRuta;
    public ArrayList<Parada> paradas;
    public String tiempoViaje;

    public Recorrido(String nombreRuta, String tiempoViaje) {
        this.idRuta = UUID.randomUUID();
        this.nombreRuta = nombreRuta;
        this.tiempoViaje = tiempoViaje;
        this.paradas = new ArrayList<Parada>();
    }
    
    public UUID getId() {
        return this.idRuta;
    }

    public void anexarParada(Parada parada) {
        this.paradas.add(parada);
    }

    public void quitarParada(Parada parada) {
        this.paradas.remove(parada);
    }

    public String calcularTiempoViaje() {
        return this.tiempoViaje;
    }

    public void listarParadas() {
        Iterator<Parada> itrParadas = paradas.iterator();

        System.out.println(String.format("Listando paradas para el recorrido %s.", this.nombreRuta));
        while(itrParadas.hasNext()) {
            Parada parada = itrParadas.next();
            System.out.println(parada.verDetalles());
        }
    }
}