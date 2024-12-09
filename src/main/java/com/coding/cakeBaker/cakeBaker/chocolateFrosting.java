package com.coding.cakeBaker.cakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name="deploy.env", havingValue="chocolate")
public class chocolateFrosting implements frosting{

    @Override
    public String getFrostingType() {
        return "frosting is chocolate type";
    }
}
