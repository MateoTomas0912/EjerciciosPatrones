package org.example.Listas;

public class LinkedList {
    java.util.LinkedList<String> lista1 = new java.util.LinkedList<String>();

    public java.util.LinkedList<String> agregarPorIndice(int indice, String valor){
        lista1.add(indice, valor);
        return lista1;
    }

    public String ObtenerElemento(int indice){
        return lista1.get(indice);
    }

    public java.util.LinkedList<String> eliminarPorIndice(int indice, String valor){
        lista1.remove(indice);
        return lista1;
    }
}
