package com.ds;

public abstract class Asientos {

    private String num;
    private String clase;
    private boolean disponible;

    public boolean verificarDisponibilidad() {
        return disponible;
    }

    // Getters opcionales
    public String getNum() {
        return num;
    }

    public String getClase() {
        return clase;
    }

    public boolean isDisponible() {
        return disponible;
    }
}