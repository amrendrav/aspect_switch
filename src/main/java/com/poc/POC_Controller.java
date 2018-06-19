package com.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vim758 on 6/19/18.
 */
@RestController
public class POC_Controller {
    @Autowired
    POC_Service poc_service;

    @GetMapping("/a2c-endpoint")
    public String getA2CData(){
        return poc_service.something();
    }

}
