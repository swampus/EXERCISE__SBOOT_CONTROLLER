package com.swampus.exercise.not.modify;

import com.swampus.exercise.not.modify.annotations.DataParser;
import org.springframework.stereotype.Component;

@Component("jsonDataParser")
public class JsonDataParser implements DataParser {
    @Override
    public String parseData() {
        return "JSON";
    }
}
