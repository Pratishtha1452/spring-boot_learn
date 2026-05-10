package com.springboot.colorPrinter;

import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter implements BluePrinter{


    @Override
    public String print() {
        return "azul";
    }
}
