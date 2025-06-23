package com.ds;

public class NotiEmail implements Notificador {

    @Override
    public void enviarNotificacion(Usuario usuario, String mensaje) {
        System.out.println("Enviando notificación al usuario por Email...");
    }
    
}
