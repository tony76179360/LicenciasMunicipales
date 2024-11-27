/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package licenciasmunicipales;

/**
 *
 * @author PC_TONY
 */
public class Nodo {
    public String[] datos; // Los datos que almacena el nodo
    public Nodo siguiente; // Referencia al siguiente nodo

    // Constructor
    public Nodo(String[] datos) {
        this.datos = datos;
        this.siguiente = null; // Por defecto, no apunta a ningún nodo
    }

    // Métodos getter y setter
    public String[] getDatos() {
        return datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
