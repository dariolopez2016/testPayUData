package com.payu.Data_Service.infrastucture.controller;

import com.payu.Data_Service.application.port.in.GetNetworkDataUseCase;
import com.payu.Data_Service.domain.model.NetworkData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/networks")
@Tag(name = "Network Data", description = "APIs para obtener información de la red") // Categoría en Swagger

public class NetworkDataController {
    private final GetNetworkDataUseCase useCase;

    public NetworkDataController(GetNetworkDataUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/data")
    @Operation(summary = "Obtener datos de la red", description = "Devuelve la información actual de la red.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Datos de la red obtenidos correctamente"),
            @ApiResponse(responseCode = "500", description = "Error en el servidor")
    })
    public NetworkData getNetworkData() {
        return useCase.getNetworkData();
    }
}