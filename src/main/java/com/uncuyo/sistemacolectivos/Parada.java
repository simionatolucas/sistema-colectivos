class Parada {
    private UUID idParada;
    public String nombre;
    public String ubicacion;
    private String horaLlegadaEstimada;

    public Parada(String nombre, String ubicacion, DateTime horaLlegadaEstimada) {
        this.idParada = UUID.randomUUID();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.horaLlegadaEstimada = horaLlegadaEstimada;
    }

    public void actualizarHoraLlegada(DateTime horaLlegadaEstimada) {
        this.horaLlegadaEstimada = horaLlegadaEstimada;
    }  

    public String verDetalles() {
        System.out.println(String.format("ID Parada: %s ; Nombre: %s ; Ubicación: %s ; Hora de llegada estimada: %s", idParada, nombre, ubicacion, horaLlegadaEstimada));
    }
}