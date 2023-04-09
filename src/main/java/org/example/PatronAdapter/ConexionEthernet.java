package org.example.PatronAdapter;

public class ConexionEthernet implements Conexion{
    @Override
    public void enviarMensaje(Mensaje mensaje) {
        System.out.println("Se envio el mensaje" + mensaje.Texto);
    }
}
