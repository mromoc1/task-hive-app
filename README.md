# Task Hive App
Este es un repositorio de aprendizaje para el desarrollo de programacion en el lenguaje de programacion Java junto con el Framework Spring. El objetivo de este desarrollo es construir una API que permita gestionar tareas, las cuales estaran asociadas a una lista y a un usuario particular.

## Requisitos
- Java 8
- Maven 3.6.3
- Spring Boot 2.4.2
- MySQL 8.0.21

## Instalacion
- Clonar el repositorio
- Crear una base de datos en MySQL con el nombre de "taskhive"
- Crear un usuario en MySQL con el nombre de "taskhive" y la contraseña "taskhive"
- Ejecutar el comando "mvn spring-boot:run" en la raiz del proyecto

## Endpoints
- GET /status - Verifica el estado de la API
- POST /users/createUser body: { "username": "string", "password": "string", "email": "string" } - Crea un usuario


