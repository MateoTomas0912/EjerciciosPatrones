package org.example.PatronBuilder;

public class Auto {
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    private String marca;
    private String modelo;
    private String color;

    private Auto (Builder builder){
        this.color = builder.color;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
    }
}
