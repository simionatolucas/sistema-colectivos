package com.uncuyo.sistemacolectivos;

import java.util.UUID;
import java.util.ArrayList;

class Terminal {
    private UUID idTerminal;
    public String nombre;
    public String ubicacion;
    public ArrayList<UUID> colectivos;
    public ArrayList<String> empleados;

    public Terminal(String nombre, String ubicacion) {
        this.idTerminal = UUID.randomUUID();
        this.colectivos = new ArrayList<UUID>();
        this.empleados = new ArrayList<String>();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarColectivo(UUID idColectivo) {
        this.colectivos.add(idColectivo);
        System.out.println(String.format("Se agregó el colectivo %s a la terminal %s", idColectivo, this.nombre));
    }

    public void eliminarColectivo(UUID idColectivo) {
        this.colectivos.remove(idColectivo);
        System.out.println(String.format("Se eliminó el colectivo %s a la terminal %s", idColectivo, this.nombre));
    }

    public void agregarEmpleado(UUID idEmpleado) {
        this.colectivos.add(idEmpleado);
        System.out.println(String.format("Se agregó el empleado %s a la terminal %s", idEmpleado, this.nombre));
    }

    public void eliminarEmpleado(UUID idEmpleado) {
        this.colectivos.remove(idEmpleado);
        System.out.println(String.format("Se eliminó el empleado %s a la terminal %s", idEmpleado, this.nombre));
    }
}