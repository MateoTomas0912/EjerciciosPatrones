package org.example.PatronAbstractFactory;

public class FabricaAnimalesSalvajes implements FabricaAnimales{
    @Override
    public Animal createAnimal(String TipoAnimal) {
        switch (TipoAnimal){
            case "Tigre": return new Tigre();
            case "Leon": return new Leon();
        }
        return null;
    }
}
