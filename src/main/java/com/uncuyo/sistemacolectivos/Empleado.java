class Empleado extends Persona {
    public String turno;
    private String salario;
    
    public void establecerTurno(String turno) {
        this.turno = turno;
    }

    public void iniciarTurno() {
        System.out.println(String.format("El empleado %s inició su turno", this.nombre));
    }

    public void terminarTurno() {
        System.out.println(String.format("El empleado %s terminó su turno", this.nombre));
    }
}