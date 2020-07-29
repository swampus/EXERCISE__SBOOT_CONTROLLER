package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.DeliveryCalculator;
import com.swampus.exercise.not.modify.StorageCalculator;
import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import com.swampus.exercise.not.modify.annotations.DoNotModifySignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


/**
 * Make method that is accessible by GET "/task0/hello" and return String "Hello World"
 */
@RestController
@RequestMapping("/task0")
public class Task0Junior {

}
