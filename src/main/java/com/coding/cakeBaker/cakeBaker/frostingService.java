package com.coding.cakeBaker.cakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class frostingService {
    @Autowired
    frosting frosting;
    public String bakeCake() {

       return frosting.getFrostingType();
   }

}
