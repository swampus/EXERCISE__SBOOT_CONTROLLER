package com.swampus.exercise.not.modify;

import com.swampus.exercise.not.modify.annotations.DataParser;
import org.springframework.stereotype.Component;

@Component
public class XmlDataParser implements DataParser {
    @Override
    public String parseData() {
        return "XML";
    }
}
