package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

public class Mecanico extends Empleado {
    private final UUID idMecanico;
    public UUID colectivoAsignado;

    public UUID getId() {
        return idMecanico;
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

    public void realizarMantenimiento(UUID idColectivo) {
        System.out.println(String.format("El mecánico %s arregló el colectivo %s.", this.idMecanico, idColectivo));
    }
}