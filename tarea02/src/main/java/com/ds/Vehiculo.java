package com.ds;

public class Vehiculo {
    boolean disponible;

    boolean verificarDisponibilidad(){
        System.out.println("El vehiculo esta disponible");
        return true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}
