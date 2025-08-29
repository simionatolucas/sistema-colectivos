import java.util.UUID;

class Boleto {
    private UUID idBoleto;
    public String fechaEmision;
    public float precio;
    public UUID pasajero;

    public Boleto(String fechaEmision, float precio, UUID pasajero) {
        this.idBoleto = UUID.randomUUID();
        this.fechaEmision = fechaEmision;
        this.precio = precio;
        this.pasajero = pasajero; 
    }

    public void verDetalles() {
        System.out.println(String.format("Mostrando detalles de la tarjeta %s asociada al pasajero %s", this.idBoleto, this.pasajero));
    }

    public UUID getId() {
        return this.idBoleto;
    }
}