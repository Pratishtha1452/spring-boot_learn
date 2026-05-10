package com.springboot.colorPrinter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorPrinterApplication implements CommandLineRunner {

    static void main(String[] args) {
        SpringApplication.run(ColorPrinterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ColorPrinte run = new ColorprinterIml();
        System.out.println(run.print());
    }
}
