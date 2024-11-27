/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package licenciasmunicipales;

import javax.swing.JOptionPane;

/**
 *
 * @author PC_TONY
 */
public class ListaEnlazada {
   public Nodo cabeza; // Primer nodo de la lista
    private int tamaño;  // Cantidad de nodos en la lista

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    // Método para agregar un nodo al final de la lista
    public void agregar(String[] datos) {
        Nodo nuevo = new Nodo(datos);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamaño++;
    }

    // Método para convertir la lista a una matriz bidimensional
    public String[][] obtenerDatos() {
        String[][] datos = new String[tamaño][];
        Nodo actual = cabeza;
        int i = 0;
        while (actual != null) {
            datos[i++] = actual.getDatos();
            actual = actual.getSiguiente();
        }
        return datos;
    }
    
    private String convertirALineaCSV(String[] datos) {
        StringBuilder lineaCSV = new StringBuilder();
        for (int i = 0; i < datos.length; i++) {
            // Agregar comillas para manejar datos con comas
            lineaCSV.append("\"").append(datos[i] != null ? datos[i] : "").append("\"");
            
            // Agregar coma entre elementos, excepto para el último
            if (i < datos.length - 1) {
                lineaCSV.append(",");
            }
        }
        return lineaCSV.toString();
    }
    
 

    // Getter para la cabeza de la lista
    public Nodo getCabeza() {
        return cabeza;
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    
    
}
