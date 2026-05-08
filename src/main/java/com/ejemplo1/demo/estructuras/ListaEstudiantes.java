package com.ejemplo1.demo.estructuras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ejemplo1.demo.model.Estudiante;
import com.ejemplo1.demo.model.Nodo;

@Component
public class ListaEstudiantes {
    private Nodo cabeza = null;

    public void insertar(Estudiante estudiante) {
        Nodo nuevo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public List<Estudiante> listar() {
        List<Estudiante> lista = new ArrayList<>();
        Nodo temp = cabeza;
        while (temp != null) {
            lista.add(temp.estudiante);
            temp = temp.siguiente;
        }
        return lista;
    }

    public void ordenarPorPuntaje() {
        if (cabeza == null || cabeza.siguiente == null) return;
        boolean huboCambio;
        do {
            huboCambio = false;
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.estudiante.puntaje < actual.siguiente.estudiante.puntaje) {
            
                    Estudiante temp = actual.estudiante;
                    actual.estudiante = actual.siguiente.estudiante;
                    actual.siguiente.estudiante = temp;
                    huboCambio = true;
                }
                actual = actual.siguiente;
            }
        } while (huboCambio);
    }

    public Estudiante buscar(String nombre) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.estudiante.nombre.equalsIgnoreCase(nombre)) {
                return temp.estudiante;
            }
            temp = temp.siguiente;
        }
        return null;
    }
}