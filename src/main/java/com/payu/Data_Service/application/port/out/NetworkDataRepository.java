package com.payu.Data_Service.application.port.out;

import com.payu.Data_Service.domain.model.NetworkData;

public interface NetworkDataRepository {
    NetworkData findNetworkData();
}