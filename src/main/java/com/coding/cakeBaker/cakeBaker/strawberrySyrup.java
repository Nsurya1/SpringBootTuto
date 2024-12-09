package com.coding.cakeBaker.cakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name="deploy.env", havingValue="strawberry")
public class strawberrySyrup implements syrup{
    @Override
    public String getSyrupType() {
        return "syrup is strawberry type";
    }
}
