package com.ds;

public class Usuario {

    public static void main(String[] args) {
        ReservarVuelo vuelo = new ReservarVuelo();
        vuelo.reservarVuelo();

        ServicioAdicional servicio = new ServicioAdicional();
        servicio.aplicarServicio();

        vuelo.confirmar();


    }


}
