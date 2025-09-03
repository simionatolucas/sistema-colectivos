package com.uncuyo.sistemacolectivos;

public class Empleado extends Persona { // Empleado tiene que ser public para que sea accesible desde la subcarpeta de empleados.
    public String turno;
    private double salario;

    public Empleado(String nombre, String telefono, String email) {
        super(nombre, telefono, email);
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void iniciarTurno() {
        System.out.println(String.format("El empleado %s inició su turno.", this.nombre));
    }

    public void terminarTurno() {
        System.out.println(String.format("El empleado %s terminó su turno.", this.nombre));
    }
}