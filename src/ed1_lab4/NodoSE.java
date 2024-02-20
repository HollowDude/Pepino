/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab4;

/**
 *
 * @author win-dpto-info
 */
public class NodoSE <T> {
    private T dato;
    private NodoSE<T> siguiente;

    public T getDato() {
        return dato;
    }

    public NodoSE(T dato) {
        this.dato = dato;
        siguiente = null;
    }
    
    public NodoSE(T dato, NodoSE siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoSE<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSE<T> siguiente) {
        this.siguiente = siguiente;
    }
}
