package com.payu.Data_Service.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NetworkData {
    private int[] responseTimes;
    private int[] costs;


}