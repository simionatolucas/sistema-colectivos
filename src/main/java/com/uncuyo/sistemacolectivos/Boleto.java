import java.util.UUID;

class Boleto {
    private UUID idBoleto;
    public DateTime fechaEmision;
    public float precio;
    public UUID pasajero;

    public Boleto(DateTime fechaEmision, float precio, UUID pasajero) {
        this.idBoleto = UUID.randomUUID();
        this.fechaEmision = fechaEmision;
        this.precio = precio;
        this.pasajero = pasajero; 
    }

    public String verDetalles() {
        System.out.println("Mostrando detalles de la tarjeta %s asociada al pasajero %s", idBoleto, pasajero);
    }

    public String getId() {
        return idBoleto;
    }
}ccc