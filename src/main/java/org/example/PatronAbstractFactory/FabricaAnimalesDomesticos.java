package org.example.PatronAbstractFactory;

public class FabricaAnimalesDomesticos implements FabricaAnimales {
    @Override
    public Animal createAnimal(String TipoAnimal) {
        switch (TipoAnimal){
            case "Perro": return new Perro();
            case "Gato": return new Gato();
        }
        return null;
    }
}
