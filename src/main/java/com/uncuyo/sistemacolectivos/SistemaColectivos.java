package com.uncuyo.sistemacolectivos;

import com.uncuyo.sistemacolectivos.empleados.Chofer;
import java.util.UUID;

public class SistemaColectivos {

    public static void main(String[] args) {
        
        Recorrido ruta1 = new Recorrido("calle1", 2);
        Parada parada1 = new Parada("parada1", "mendoza", "20 horas");
        ruta1.anexarParada(parada1);
        
        Chofer chofer1 = new Chofer("Mañana", ruta1.getIdRuta());
        
        chofer1.iniciarTurno();
        System.out.println(chofer1.rutaAsignada);
    }
}
