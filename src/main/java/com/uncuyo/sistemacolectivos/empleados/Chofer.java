package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

public class Chofer extends Empleado {
    private UUID idChofer;
    public String turno;
    public UUID rutaAsignada;
    public boolean manejando;

    public Chofer(String turno, UUID rutaAsignada) {
        this.idChofer = UUID.randomUUID();
        this.turno = turno;
        this.rutaAsignada = rutaAsignada;
        this.manejando = false;
    }

    public void cambiarRuta(UUID nuevaRuta) {
        this.rutaAsignada = nuevaRuta;
        System.out.println(String.format("Nueva ruta para el chofer: %s", nuevaRuta));
    }

    public void manejar() {
        this.manejando = true;
    }   
}