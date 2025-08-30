package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

class Mecanico extends Empleado {
    private UUID idMecanico;
    public UUID colectivoAsignado;

    public Mecanico(UUID colectivoAsignado) {
        UUID uuid = UUID.randomUUID();

        this.colectivoAsignado = colectivoAsignado;
        this.idMecanico = uuid;
    }

    public void realizarMantenimiento(UUID idColectivo) {
        System.out.println(String.format("El mecánico %s arregló el colectivo %s", this.idMecanico, idColectivo));
    }
}