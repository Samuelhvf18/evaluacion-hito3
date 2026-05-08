# Evaluación Hito 3 - Estructuras de Datos

**Estudiante:** Samuel Henry Villca Flores

## Descripción

API REST desarrollada con Spring Boot que implementa arreglos, matrices y listas enlazadas.

## Requisitos

- Java 25
- Maven

## Ejecución

1. Clonar el repositorio.
2. Ejecutar el comando: `./mvnw spring-boot:run`
3. El servidor iniciará en el puerto: `9999`

## Endpoints de Prueba

### 1. Calificaciones (Arreglo Unidimensional)

- **Agregar:** `http://localhost:9999/notas/agregar?valor=85`
- **Ver todas:** `http://localhost:9999/notas`
- **Promedio:** `http://localhost:9999/notas/promedio`

### 2. Aula (Arreglo Bidimensional)

- **Mostrar Aula:** `http://localhost:9999/aula`
- **Ocupar Asiento:** `http://localhost:9999/aula/ocupar?fila=1&columna=2`

### 3. Estudiantes (Lista Enlazada y Ordenamiento)

- **Agregar Estudiante:** `http://localhost:9999/estudiantes/agregar?nombre=Ana&puntaje=95`
- **Ver Ordenados:** `http://localhost:9999/estudiantes/ordenados`
- **Buscar:** `http://localhost:9999/estudiantes/buscar/Ana`
