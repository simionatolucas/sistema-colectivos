package com.uncuyo.sistemacolectivos;

class Persona {
    public String nombre;
    public String telefono;
    public String email;


    // La clase persona implementa un constructor sobrecargado que permite instanciar sus objetos sin inicializar todos sus atributos.
    public Persona() {}

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public void verPerfil() {
        System.out.println(String.format("Nombre: %s ; Telefono: %s ; Email: %s"));
    }
}