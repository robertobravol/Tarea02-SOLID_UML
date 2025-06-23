package com.ds;

import java.util.List;

public class Vuelo {
    private String num;
    private String origen;
    private String destino;
    private String aerolinea;
    private List<Asientos> asientos;

    public Vuelo(String num, String origen, String destino, String aerolinea, List<Asientos> asientos) {
        this.num = num;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.asientos = asientos;
    }

    public boolean verificarDisponibilidad() {
        // método referencial
        return false;
    }

    public void verReservas() {
        for (Asientos asiento : asientos) {
            if (!asiento.verificarDisponibilidad() && asiento instanceof AsientoReservado) {
                Usuario u = ((AsientoReservado) asiento).getUsuario();
                u.recibirNotificacion("El vuelo " + num + " ha tenido un cambio de itinerario.");
            }
        }
    }

    public void cambiarItinerario(String nuevoOrigen, String nuevoDestino, String nuevaAerolinea) {
        this.origen = nuevoOrigen;
        this.destino = nuevoDestino;
        this.aerolinea = nuevaAerolinea;
        // método referencial
    }

    // Getters (opcional)
    public String getNum() {
        return num;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public List<Asientos> getAsientos() {
        return asientos;
    }
}