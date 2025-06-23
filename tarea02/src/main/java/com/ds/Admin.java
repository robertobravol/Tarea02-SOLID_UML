package com.ds;

public class Admin {
    private String nombre;

    public Admin(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarItinerario(Vuelo vuelo, String nuevoOrigen, String nuevoDestino, String nuevaAerolinea, Sistema sistema) {
        System.out.println(nombre + " está cambiando el itinerario del vuelo " + vuelo.getNum());

        // Paso 1: Modificar y confirmar
        System.out.println("Nuevo itinerario propuesto: " + nuevoOrigen + " → " + nuevoDestino + " con " + nuevaAerolinea);

        // Paso 2: Registrar cambio en el sistema
        sistema.registrarCambio(vuelo, nuevoOrigen, nuevoDestino, nuevaAerolinea);

        // Paso 3: Notificar a los usuarios
        sistema.notificarUsuarios(vuelo);
    }
}