package com.payu.Data_Service.infrastucture.persistence;

import com.payu.Data_Service.application.port.out.NetworkDataRepository;
import com.payu.Data_Service.domain.model.NetworkData;


public class InMemoryNetworkDataRepository implements NetworkDataRepository {
    @Override
    public NetworkData findNetworkData() {
        return NetworkData.builder()
                .responseTimes(new int[]{20, 15, 100, 15, 50, 9})  // Tiempos
                .costs(new int[]{50, 60, 30, 55, 40, 70})          // Costos
                .build();
    }
}