package com.coding.cakeBaker.cakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration
@ConditionalOnProperty(name="deploy.env", havingValue="strawberry")
public class strawberryFrosting implements frosting{
    @Bean
    public String getFrostingType() {
        return "frosting is strawberry type";
    }
}
