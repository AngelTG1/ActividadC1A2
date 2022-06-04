package com.upchiapas.Pizza.modelos;

public class Cliente {
    private String nombre;
    private int turno;

    public Cliente(String nombre,int turno) {
        this.nombre = nombre;
        this.turno = turno;
    }
    public Cliente(){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
