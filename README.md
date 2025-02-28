# Network Data Service API

Este proyecto contiene una API RESTful desarrollada en Spring Boot para obtener información de la red utilizando el patrón de diseño de arquitectura limpia (Clean Architecture).

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
