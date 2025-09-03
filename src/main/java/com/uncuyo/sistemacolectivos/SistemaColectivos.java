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
        
        Colectivo colectivo1 = new Colectivo("Mercedes-Benz", 40, "18:30 hs");
        Chofer chofer1 = new Chofer("Juan Perez", "261-312312s3", "juanperez@ejemplo.com", ruta1.getIdRuta());
        Mecanico mecanico1 = new Mecanico("Carlos Gómez", "262-5123456", "carlosgomez@ejemplo.com", colectivo1.getId());

        chofer1.setTurno("Tarde-Noche");
        chofer1.setSalario(1200000.00);
        
        chofer1.iniciarTurno();
        colectivo1.arrancar();
        chofer1.manejando = true;
        
        ruta1.listarParadas();
    }
}
