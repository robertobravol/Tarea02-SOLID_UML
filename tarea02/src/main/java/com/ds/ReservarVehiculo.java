package com.ds;

public class ReservarVehiculo implements Reserva{
    private ProveedorVehiculo proveedorVehiculo;
    public void confirmar(){

    }

    public void cancelar(){

    }
    void alquilarVehiculo(Vehiculo vehiculo){
        boolean disponibilidad = vehiculo.verificarDisponibilidad();
        if(!disponibilidad){
            mostrarNoDisponible();
            return;
        }
        vehiculo.setDisponible(false);
        ServicioAdicional.ofrecerServicioAdicional();
        procesarReservaVehiculo(vehiculo);

    }

    void mostrarNoDisponible(){
        System.out.println("Vehiculo no disponible");
    }

    void procesarReservaVehiculo(Vehiculo vehiculo){
        System.out.println("procesar reserva, vehiculo reservado en la DB");
        proveedorVehiculo.confirmarVehiculo(vehiculo);
    }

    

}
