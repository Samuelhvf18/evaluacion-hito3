package com.ejemplo1.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AulaService {
    // Matriz de 5x5: 0 libre, 1 ocupado
    private int[][] asientos = new int[5][5];

    public String ocuparAsiento(int fila, int columna) {
        asientos[fila][columna] = 1; // [cite: 44]
        return "Asiento [" + fila + "][" + columna + "] ocupado";
    }

    public String liberarAsiento(int fila, int columna) {
        asientos[fila][columna] = 0;
        return "Asiento [" + fila + "][" + columna + "] liberado";
    }

    public int[][] mostrarMatriz() {
        return asientos;
    }

    public int contarOcupados() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asientos[i][j] == 1) total++;
            }
        }
        return total;
    }
}