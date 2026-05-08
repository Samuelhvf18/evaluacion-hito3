package com.ejemplo1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo1.demo.estructuras.ListaEstudiantes;
import com.ejemplo1.demo.model.Estudiante;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private ListaEstudiantes lista;

    @GetMapping("/agregar")
    public String agregar(@RequestParam String nombre, @RequestParam int puntaje) {
        lista.insertar(new Estudiante(nombre, puntaje));
        return "Estudiante " + nombre + " agregado con éxito.";
    }

    @GetMapping
    public List<Estudiante> verTodos() {
        return lista.listar();
    }

    @GetMapping("/ordenados")
    public List<Estudiante> verOrdenados() {
        lista.ordenarPorPuntaje();
        return lista.listar();
    }

    @GetMapping("/buscar/{nombre}")
    public Estudiante buscar(@PathVariable String nombre) {
        return lista.buscar(nombre);
    }
}