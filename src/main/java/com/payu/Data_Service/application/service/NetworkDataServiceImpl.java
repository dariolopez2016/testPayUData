package com.payu.Data_Service.application.service;

import com.payu.Data_Service.application.port.in.GetNetworkDataUseCase;
import com.payu.Data_Service.application.port.out.NetworkDataRepository;
import com.payu.Data_Service.domain.model.NetworkData;

public class NetworkDataServiceImpl implements GetNetworkDataUseCase {
    private final NetworkDataRepository repository;

    public NetworkDataServiceImpl(NetworkDataRepository repository) {

        this.repository = repository;
    }

    @Override
    public NetworkData getNetworkData() {
        return repository.findNetworkData();
    }
}