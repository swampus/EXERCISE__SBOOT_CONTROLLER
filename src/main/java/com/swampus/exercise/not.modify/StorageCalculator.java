package com.swampus.exercise.not.modify;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Component
public class StorageCalculator {

    double interests;

    @PostConstruct
    private void init(){
        interests = 1.11;
    }


    public BigDecimal applyStorageInterests(BigDecimal money) {
        return new BigDecimal(Math.round(money.doubleValue() * interests));
    }
}
