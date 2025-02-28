# Network Data Service API

Este proyecto contiene una API RESTful desarrollada en Spring Boot para obtener información de la red utilizando el patrón de diseño de arquitectura limpia (Clean Architecture).
## Autor
- **Nombre**: Dario Lopez
- **Correo**: dario.lopez.sistemas@gmail.com
- **Fecha**: 28 de febrero de 2025

## Instalación
1. Clona el repositorio desde GitHub:
   git clone https://github.com/dariolopez2016/testPayUPriorization.git
## Descripción

El archivo `NetworkDataController.java` es un controlador REST que expone un endpoint para consultar datos de la red. Está ubicado en el paquete `com.payu.Data_Service.infrastucture.controller` y utiliza el caso de uso `GetNetworkDataUseCase` para recuperar la información.

### Endpoint Disponible
- **GET /api/networks/data**: Devuelve los datos actuales de la red en formato JSON.

## Requisitos
- Java 17 o superior
- Spring Boot 3.x
- Maven (para la gestión de dependencias)
- Swagger (OpenAPI 3) para la documentación de la API

## Instalación
1. Clona el repositorio o crea un nuevo proyecto en IntelliJ IDEA.
2. Copia y pega el código del controlador en el paquete correspondiente (`com.payu.Data_Service.infrastucture.controller`).
3. Asegúrate de que las dependencias de Spring Boot y Swagger estén configuradas en el archivo `pom.xml`.
4. Configura el caso de uso `GetNetworkDataUseCase` y el modelo `NetworkData` según las necesidades de tu dominio.


# Sistema de Gestión de Datos de Red

Este sistema está compuesto por **dos proyectos** que trabajan juntos: `data-service` y `network-service`. Ambos deben estar ejecutándose simultáneamente para el correcto funcionamiento de la aplicación.

## Proyectos

### 1. Data Service (`data-service`)
API RESTful para gestionar datos generales del sistema.

- **Endpoint principal**: `GET /api/data`
- **Swagger UI**: `http://localhost:8081/swagger-ui.html`
- **Repositorio**: `https://github.com/dariolopez2016/data-service.git`

### 2. Network Service (`network-service`)
API RESTful para obtener información específica de la red.

- **Endpoint principal**: `GET /api/networks/data`
- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **Repositorio**: `https://github.com/dariolopez2016/network-service.git`