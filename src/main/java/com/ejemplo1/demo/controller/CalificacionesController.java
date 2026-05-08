package com.ejemplo1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo1.demo.service.CalificacionesService;

@RestController
@RequestMapping("/notas")
public class CalificacionesController {

    @Autowired
    private CalificacionesService service;

    @GetMapping("/agregar")
    public String agregar(@RequestParam double valor) {
        return service.agregarNota(valor);
    }

    @GetMapping
    public double[] listar() {
        return service.obtenerTodas();
    }

    @GetMapping("/promedio")
    public double promedio() {
        return service.calcularPromedio();
    }

    @GetMapping("/max")
    public double maximo() {
        return service.obtenerMax();
    }

    @GetMapping("/min")
    public double minimo() {
        return service.obtenerMin();
    }
}