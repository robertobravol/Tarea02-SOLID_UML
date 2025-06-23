package com.ds;

public class Agente {
    public void registrarReporte() {
        ServicioCliente servicioCliente = new ServicioCliente();
        servicioCliente.revisarReporte();

        servicioCliente.notificarSolucion();

        servicioCliente.escalarReporte();
    }
}
