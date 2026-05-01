package com.in28minutes.microservices.currencyexchangeservice.util.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class InstanceInformationService {

    private static final String HOST_NAME = "HOSTNAME";
    private static final String DEFAULT_ENV = "Default";

    @Autowired
    private Environment environment;

    public String retrieveInstanceInfo() {
        return environment.getProperty(HOST_NAME, DEFAULT_ENV)
                + " v2 ";
    }
}