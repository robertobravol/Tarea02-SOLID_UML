package com.ds;

public abstract class Asientos {

    private String num;
    private String clase;
    private boolean disponible;

    public boolean verificarDisponibilidad(){
        return disponible;
    }
    
}
