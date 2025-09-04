package com.uncuyo.sistemacolectivos;

import com.uncuyo.sistemacolectivos.empleados.Chofer;
import com.uncuyo.sistemacolectivos.empleados.Inspector;
import com.uncuyo.sistemacolectivos.empleados.Mecanico;


public class SistemaColectivos {

    public static void main(String[] args) {
        
        Recorrido ruta1 = new Recorrido("Calle 1 - Calle 2", "1 hora");
        Parada parada1 = new Parada("Parada 1", "Calle 1: Km 2", "19:00 hs");
        Parada parada2 = new Parada("Parada 2", "Calle 2: Km 3", "19:30 hs");
        
        ruta1.anexarParada(parada1);
        ruta1.anexarParada(parada2);

        MaquinaCobro maquinaCobro1 = new MaquinaCobro(1000.00);
        MaquinaCobro maquinaCobro2 = new MaquinaCobro(2000.00);

        Colectivo colectivo1 = new Colectivo("Mercedes-Benz", 40, "18:30 hs", maquinaCobro1);
        Colectivo colectivo2 = new Colectivo("Mercedes-Benz", 40, "10:00 hs", maquinaCobro2);

        Chofer chofer1 = new Chofer("Juan Perez", "261-3123123", "juanperez@ejemplo.com", ruta1.getId());
        Mecanico mecanico1 = new Mecanico("Carlos Gómez", "262-5123456", "carlosgomez@ejemplo.com", colectivo1.getId());

        System.out.println(); // Salto de línea.
        chofer1.setTurno("Tarde-Noche");
        chofer1.setSalario(1200000.00);
        chofer1.iniciarTurno();
        colectivo1.arrancar();
        chofer1.manejando = true;

        System.out.println(); // Salto de línea.
        mecanico1.setTurno("Mañana");
        mecanico1.setSalario(1100000.00);
        mecanico1.iniciarTurno();
        mecanico1.realizarMantenimiento(colectivo2.getId(), "Cambio de aceite.");

        System.out.println(); // Salto de línea.
        Pasajero pasajero1 = new Pasajero("María López", "254-4532324", "marialopez@ejemplo.com", "Guaymallén", "Medio");
        pasajero1.pagarPasaje(colectivo1.maquinaCobro.getMonto());

        System.out.println(); // Salto de línea.
        ruta1.listarParadas();

        System.out.println();
        Terminal terminal1 = new Terminal("Terminal de Ómnibus de Mendoza", "Mendoza Capital");
        terminal1.agregarColectivo(colectivo1.getId());
        terminal1.agregarColectivo(colectivo2.getId());
        terminal1.agregarEmpleado(chofer1.getId());
        terminal1.agregarEmpleado(mecanico1.getId());
    }
}
