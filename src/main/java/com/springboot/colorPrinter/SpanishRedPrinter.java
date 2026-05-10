package com.springboot.colorPrinter;

import org.springframework.stereotype.Component;

@Component
public class SpanishRedPrinter implements RedPrinter{

    @Override
    public String print() {
        return "ROJO";
    }
}
