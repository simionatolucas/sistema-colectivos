package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

public class Mecanico extends Empleado {
    private final UUID idMecanico;
    public UUID colectivoAsignado;

    public UUID getId() {
        return this.idMecanico;
    }

    public Mecanico(String nombre, String telefono, String email, UUID colectivoAsignado) {
        super(nombre, telefono, email);
        this.colectivoAsignado = colectivoAsignado;
        this.idMecanico = UUID.randomUUID();;
    }

    @Override
    public void iniciarTurno() {
        System.out.println(String.format("El mecánico %s inició su turno.", this.nombre));
    }

    // Mecánico implementa un metodo sobrecargado para realizar mantenimiento, diferenciando mantenimiento general de cosas específicas.
    public void realizarMantenimiento(UUID idColectivo) {
        System.out.println(String.format("El mecánico %s realizó mantenimiento general en el colectivo ID: %s.", this.idMecanico, idColectivo));
    }

    public void realizarMantenimiento(UUID idColectivo, String tarea) {
        System.out.println(String.format("El mecánico %s realizó mantenimiento en el colectivo ID: %s. Trabajo realizado: %s", this.nombre, idColectivo, tarea));
    }
}