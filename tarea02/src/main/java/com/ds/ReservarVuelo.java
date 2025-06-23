package com.ds;

public class ReservarVuelo implements Reserva{
    public void confirmar(){
        ReservaManager reserva = new ReservaManager();
        reserva.procesarReservaVuelo();
        

    }
    public void cancelar(){
        
    }

    public void reservarVuelo(){
        Vuelo vuelo = new Vuelo();
        boolean disponible = vuelo.verificarDisponibilidad();
        if (disponible) {
            vuelo.setDisponible(false); // Marcar el vuelo como no disponible
        } else {
            mostrarNoDisponible();
        }
    }

    private void mostrarNoDisponible() {
        System.out.println("No hay disponibilidad para este vuelo.");
    }

     
}
