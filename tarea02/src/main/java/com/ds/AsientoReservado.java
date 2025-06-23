package com.ds;

public class AsientoReservado extends Asientos {

    private Usuario usuario;

    public AsientoReservado(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public boolean verificarDisponibilidad() {
        return false;
    }
}