import java.util.UUID;

class Colectivo {
    private UUID idColectivo;
    public String modelo;
    public int capacidad;
    private DateTime horaSalida;
    public String estado;

    public Colectivo(String modelo, int capacidad, DateTime horaSalida) {
        this.idColectivo = UUID.random();
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.horaSalida = horaSalida;
        this.estado = "Detenido";
    }

    public void arrancar() {
        this.estado = "Encendido"
        System.out.println(String.format("Arrancando el colectivo %s", idColectivo));
    }

    public void detener() {
        this.estado = "Detenido"
        System.out.println(String.format("Deteniendo el colectivo %s", idColectivo));
    }

    public DateTime verHorario() {
        return this.horaSalida;
    }
}