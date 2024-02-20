/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab4;

/**
 *
 * @author Humbert
 */
public class Persona {
    protected String nombre;
    protected String carnetIdentidad;

    public Persona() {
    }

    public Persona(String nombre, String carnetIdentidad) {
        this.nombre = nombre;
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(String carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", carnetIdentidad=" + carnetIdentidad + '}';
    }
    
    
}
