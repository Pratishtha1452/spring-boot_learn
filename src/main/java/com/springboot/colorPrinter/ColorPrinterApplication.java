package com.springboot.colorPrinter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorPrinterApplication implements CommandLineRunner {

    private ColorPrinte colorPrinte;

    public ColorPrinterApplication(ColorPrinte colorPrinte){
        this.colorPrinte = colorPrinte;
    }

    static void main(String[] args) {

        SpringApplication.run(ColorPrinterApplication.class, args);
    }

    @Override
    public void run(final String... args){
        System.out.println(colorPrinte.print());
    }
}
