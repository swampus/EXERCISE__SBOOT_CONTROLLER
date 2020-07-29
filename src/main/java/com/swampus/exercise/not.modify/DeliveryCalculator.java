package com.swampus.exercise.not.modify;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Component
public class DeliveryCalculator {

    double interests;

    @PostConstruct
    private void init(){
        interests = 1.26;
    }

    public BigDecimal applyDeliveryInterests(BigDecimal money) {
        return new BigDecimal(Math.round(money.doubleValue() * interests));
    }
}
