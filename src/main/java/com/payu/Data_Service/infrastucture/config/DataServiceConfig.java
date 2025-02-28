package com.payu.Data_Service.infrastucture.config;

import com.payu.Data_Service.application.port.in.GetNetworkDataUseCase;
import com.payu.Data_Service.application.port.out.NetworkDataRepository;
import com.payu.Data_Service.application.service.NetworkDataServiceImpl;
import com.payu.Data_Service.infrastucture.persistence.InMemoryNetworkDataRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataServiceConfig {
    @Bean
    public NetworkDataRepository networkDataRepository() {
        return new InMemoryNetworkDataRepository();
    }

    @Bean
    public GetNetworkDataUseCase getNetworkDataUseCase(NetworkDataRepository repository) {
        return new NetworkDataServiceImpl(repository);
    }
}