# 🧩 Demo: DTO (Request & Response) en Spring Boot

Este proyecto demuestra el uso de **DTOs (Data Transfer Objects)** en una aplicación **Spring Boot** siguiendo la arquitectura MVC.  
Su objetivo es **mostrar cómo separar las entidades de la base de datos de las clases que se comunican con el cliente (API REST)**.

---

## 🚀 Objetivo

Comprender cómo funcionan los **DTO de entrada (Request)** y los **DTO de salida (Response)** en una API REST con Spring Boot, y cómo ayudan a:

- Evitar exponer las entidades directamente al cliente.
- Controlar qué datos entran y salen de la aplicación.
- Mejorar la seguridad (por ejemplo, no devolver contraseñas).
- Separar las capas de presentación y persistencia.

---

## 🧠 ¿Qué es un DTO?

Un **DTO (Data Transfer Object)** es un objeto usado para **transferir datos entre capas** de la aplicación.  
En este caso, entre el **cliente (Postman)** y la **API Spring Boot**.

- 📨 **Request DTO** → representa los datos que el cliente envía.  
- 📦 **Response DTO** → representa los datos que el servidor devuelve.

---

## 🏗️ Estructura del proyecto

---

## ⚙️ Requisitos

- **Java 17** o superior  
- **Maven**  
- **Spring Boot 3+**  
- **Base de datos H2 (en memoria)**  

---

## ▶️ Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/dto-springboot-demo.git
   cd dto-springboot-demo
2. Ejecutar la aplicación:
   ```bash
    mvn spring-boot:run
   
La API estará disponible en:

👉 http://localhost:8080

##💡 Beneficios del uso de DTOs

Beneficio	Descripción

Seguridad	No exponemos información sensible como contraseñas o IDs internos.
Control	Podemos decidir qué datos recibe y devuelve la API.
Flexibilidad	Podemos cambiar el formato de la respuesta sin afectar la base de datos.
Validación	El RequestDTO nos permite validar campos antes de guardar.


## 🧰 Tecnologías usadas

Spring Boot 3

Spring Web

Spring Data JPA

H2 Database

Jakarta Validation

## 🧑‍💻 Autora

Proyecto desarrollado como parte del curso Femcoders – Píldora: DTO en Spring Boot
[Luisa Moreno - GitHub](https://github.com/LuMorenoM), 2025.
