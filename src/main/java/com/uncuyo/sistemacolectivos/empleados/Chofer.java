package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

public class Chofer extends Empleado {
    private final UUID idChofer;
    public UUID rutaAsignada;
    public boolean manejando;

    public Chofer(String nombre, String telefono, String email, UUID rutaAsignada) {
        super(nombre, telefono, email);
        this.idChofer = UUID.randomUUID();
        this.rutaAsignada = rutaAsignada;
        this.manejando = false;
    }

    public UUID getId() {
        return this.idChofer;
    }

    public void cambiarRuta(UUID nuevaRuta) {
        this.rutaAsignada = nuevaRuta;
        System.out.println(String.format("Nueva ruta para el chofer: %s", nuevaRuta));
    }

    @Override
    public void iniciarTurno() {
        System.out.println(String.format("El chofer %s inició su turno.", this.nombre));
    }

    public void manejar() {
        this.manejando = true;
    }
}