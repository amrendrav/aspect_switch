package com.poc;

import org.springframework.stereotype.Service;

/**
 * Created by vim758 on 6/19/18.
 */
@Service
public class POC_Service {


    @EnableFeature(value = MOMSFeatures.A2C_MANAGEMENT_FEATURE)
    public String something(){
        return "A2C Response";
    }

}
