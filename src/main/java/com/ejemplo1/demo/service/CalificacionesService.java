package com.ejemplo1.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalificacionesService {
    // Este es el arreglo unidimensional para 10 estudiantes
    private double[] notas = new double[10];
    private int contador = 0;

    public String agregarNota(double valor) {
        if (contador < 10) {
            notas[contador] = valor;
            contador++;
            return "Nota agregada: " + valor;
        }
        return "El arreglo está lleno";
    }

    public double[] obtenerTodas() {
        return notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length; 
    }

    public double obtenerMax() {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) max = nota;
        }
        return max;
    }

    public double obtenerMin() {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) min = nota;
        }
        return min;
    }
}