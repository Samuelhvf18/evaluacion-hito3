package com.ejemplo1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo1.demo.service.AulaService;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaService service;

    @GetMapping
    public int[][] mostrar() {
        return service.mostrarMatriz();
    }

    @GetMapping("/ocupar")
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        return service.ocuparAsiento(fila, columna);
    }

    @GetMapping("/liberar")
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        return service.liberarAsiento(fila, columna);
    }

    @GetMapping("/ocupados")
    public int totalOcupados() {
        return service.contarOcupados();
    }
}