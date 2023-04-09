package org.example.PatronBuilder;

public class Builder {
    public String getMarca() {
        return marca;
    }

    public Builder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Builder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public String marca;
    public String modelo;
    public String color;

    public Auto build(){
        return new Auto(this);
    }
}
