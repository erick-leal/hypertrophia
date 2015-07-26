package com.example.erick.hypertrophia;



/**
 * Created by Marcelo on 04-06-2015.
 */
public class Personal {
    private String nombre;
    private String apellido;
    private String funcion;

    public Personal(String nombre, String apellido, String funcion){

        this.nombre = nombre;
        this.apellido = apellido;
        this.funcion = funcion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFuncion(String funcion) {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }





    @Override
    public String toString() {
        return "Nombre :" + nombre + " " + apellido + "                   "+
                " Cargo : " + funcion;
    }
}
