package org.example.PatronFactoryMethod;

public class ConexionOracle implements Conexion{
    @Override
    public void conectar() {
        System.out.println("conectarse a oracle");
    }

    @Override
    public void salir() {
        System.out.println("salir de oracle");
    }
}
