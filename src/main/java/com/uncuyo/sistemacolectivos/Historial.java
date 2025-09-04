package com.uncuyo.sistemacolectivos;

import java.util.ArrayList;
import java.util.UUID;

class Historial {
   private UUID pasajero;
   public ArrayList<String> viajesRealizados;
   public double totalGastado;

   public Historial(UUID pasajero) {
        this.pasajero = pasajero;
        this.viajesRealizados = new ArrayList<String>();
        this.totalGastado = 0;
   }

   public UUID getPasajero() {
       return this.pasajero;
   }

   public void agregarViaje(String recorrido, String abono) {
        double monto = 1000;
        if (abono == "Medio") {
            monto = 500;
        } else if (abono == "Total") {
            monto = 0;
        }
        this.viajesRealizados.add(recorrido);
        this.totalGastado += monto;
   }

   public ArrayList<String> consultarHistorial() {
        return this.viajesRealizados;
   }
}