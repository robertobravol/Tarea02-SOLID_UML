package com.ds;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void recibirNotificacion(String mensaje) {
        // método referencial
    }
    public static void main(String[] args) {
        ReservarVuelo vuelo = new ReservarVuelo();
        vuelo.reservarVuelo();

        ServicioAdicional.ofrecerServicioAdicional();

        vuelo.confirmar();


    }


}
