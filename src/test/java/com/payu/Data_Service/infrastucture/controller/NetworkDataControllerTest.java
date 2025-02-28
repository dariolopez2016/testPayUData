package com.payu.Data_Service.infrastucture.controller;

import com.payu.Data_Service.application.port.in.GetNetworkDataUseCase;
import com.payu.Data_Service.domain.model.NetworkData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class NetworkDataControllerTest {

    private MockMvc mockMvc;

    @Mock
    private GetNetworkDataUseCase useCase;

    @InjectMocks
    private NetworkDataController controller;

    @BeforeEach
    void setUp() {
        // Inicializa los mocks de Mockito
        MockitoAnnotations.openMocks(this);
        // Configura MockMvc manualmente con el controlador
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void testGetNetworkData_Success() throws Exception {
        // Datos de prueba usando Builder
        NetworkData mockData = NetworkData.builder()
                .responseTimes(new int[]{20, 15, 100, 15, 50, 9})
                .costs(new int[]{50, 60,  30, 55, 40, 70})
                .build();

        // Configura el comportamiento del mock
        when(useCase.getNetworkData()).thenReturn(mockData);

        // Realiza la solicitud GET y verifica la respuesta
        mockMvc.perform(get("/api/networks/data"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.responseTimes[0]").value(20))
                .andExpect(jsonPath("$.responseTimes[1]").value(15))
                .andExpect(jsonPath("$.responseTimes[2]").value(100))
                .andExpect(jsonPath("$.responseTimes[3]").value(15))
                .andExpect(jsonPath("$.responseTimes[4]").value(50))
                .andExpect(jsonPath("$.responseTimes[5]").value(9))
                .andExpect(jsonPath("$.costs[0]").value(50))
                .andExpect(jsonPath("$.costs[1]").value(60))
                .andExpect(jsonPath("$.costs[2]").value(30))
                .andExpect(jsonPath("$.costs[3]").value(55))
                .andExpect(jsonPath("$.costs[4]").value(40))
                .andExpect(jsonPath("$.costs[5]").value(70));


        // Verifica que el caso de uso fue llamado
        verify(useCase, times(1)).getNetworkData();
    }

}
