package com.uncuyo.sistemacolectivos.empleados;

import java.util.UUID;
import com.uncuyo.sistemacolectivos.Empleado;

public class Inspector extends Empleado {
    private final UUID idInspector;
    public String turno;
    public UUID colectivoAsignado;

    public Inspector(String nombre, String telefono, String email, String turno, UUID colectivoAsignado) {
        super(nombre, telefono, email);
        this.idInspector = UUID.randomUUID();
        this.turno = turno;
        this.colectivoAsignado = colectivoAsignado;
    }

    public UUID getId() {
        return this.idInspector;
    }

    public void cambiarColectivo(UUID colectivoAsignado) {
        this.colectivoAsignado = colectivoAsignado;
    }

    public void solicitarBoleto() {
        System.out.println("Solicitando boleto...");
    }

    @Override
    public void iniciarTurno() {
        System.out.println(String.format("El inspector %s inició su turno.", this.nombre));
    }

    public void verReporte() {
        System.out.println(String.format("Mostrando reporte del colectivo %s.", colectivoAsignado));
    }
}