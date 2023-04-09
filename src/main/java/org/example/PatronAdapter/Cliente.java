package org.example.PatronAdapter;

public class Cliente {
    public void Enviar(Mensaje mensaje){
        ConexionEthernet conexionEthernet = new ConexionEthernet();
        conexionEthernet.enviarMensaje(mensaje);
    }
}
