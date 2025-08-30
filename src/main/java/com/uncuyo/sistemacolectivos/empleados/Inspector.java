package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

class Inspector extends Empleado {
    private UUID idInspector;
    public String turno;
    public UUID colectivoAsignado;

    public Inspector(String turno, UUID colectivoAsignado) {
        this.idInspector = UUID.randomUUID();
        this.turno = turno;
        this.colectivoAsignado = colectivoAsignado;
    }

    public void cambiarColectivo(UUID colectivoAsignado) {
        this.colectivoAsignado = colectivoAsignado;
    }

    public void solicitarBoleto() {
        System.out.println("Solicitando boleto...");
    }

    public void verReporte() {
        System.out.println(String.format("Mostrando reporte del colectivo %s", colectivoAsignado));
    }
}