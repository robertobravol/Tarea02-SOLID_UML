package com.ds;

public class Sistema {

    public void registrarCambio(Vuelo vuelo, String nuevoOrigen, String nuevoDestino, String nuevaAerolinea) {
        vuelo.cambiarItinerario(nuevoOrigen, nuevoDestino, nuevaAerolinea);
        System.out.println("Sistema: Itinerario actualizado para el vuelo " + vuelo.getNum());
    }

    public void notificarUsuarios(Vuelo vuelo) {
        vuelo.verReservas();
    }
}