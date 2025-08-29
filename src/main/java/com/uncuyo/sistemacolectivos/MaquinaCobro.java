class MaquinaCobro {
    public double monto;
    public UUID pasajero;

    public MaquinaCobro(double monto, UUID pasajero) {
        this.monto = monto;
        this.pasajero = pasajero;
    }

    public void procesarPago() {
        System.out.println(String.format("Procesando pago de %f al pasajero ID:%s", monto, pasajero));
    }

    public void emitirBoleto() {
        System.out.println(String.format("Emitiendo boleto para el pasajero ID:%s", pasajero));
    }
}