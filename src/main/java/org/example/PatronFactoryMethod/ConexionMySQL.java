package org.example.PatronFactoryMethod;

public class ConexionMySQL implements Conexion{

    @Override
    public void conectar() {
        System.out.println("conectarse a mysql");
    }

    @Override
    public void salir() {
        System.out.println("salir de mysql");
    }
}
