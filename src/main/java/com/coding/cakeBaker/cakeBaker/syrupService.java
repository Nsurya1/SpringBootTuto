package com.coding.cakeBaker.cakeBaker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class syrupService {
    @Autowired
    syrup syrup;
    public String bakeCake(){
//        System.out.println("cake making by using syrup");
        return syrup.getSyrupType();
    }
}
