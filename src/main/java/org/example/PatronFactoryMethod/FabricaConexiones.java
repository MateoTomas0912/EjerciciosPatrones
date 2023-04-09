package org.example.PatronFactoryMethod;

public class FabricaConexiones {
    public Conexion ObtenerConexiones(String conexionDeseada){
        switch (conexionDeseada){
            case "MySql": return new ConexionMySQL();
            case "Oracle": return new ConexionOracle();
        }
        return null;
    }
}
