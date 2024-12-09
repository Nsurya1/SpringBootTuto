package com.coding.cakeBaker.cakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env", havingValue="chocolate")
public class chocolateSyrup implements syrup{
    @Override
    public String getSyrupType() {
        return "syrup is chocolate type";
    }
}
