package org.example.PatronSingleton;

import java.util.Date;

public class Configuracion {
    private static Configuracion configuracion;
    public String Nombre;
    public Date Fecha;

    private Configuracion(String Nombre, Date Fecha){
        this.Nombre = Nombre;
        this.Fecha = Fecha;
    }

    public static Configuracion getConfiguracion(String Nombre, Date Fecha){
        if (configuracion == null){
            configuracion = new Configuracion(Nombre, Fecha);
        }

        return configuracion;
    }
}
