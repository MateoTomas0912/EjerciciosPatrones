package org.example.Listas;

public class ArrayList {
    java.util.ArrayList<String> lista1 = new java.util.ArrayList<>();

    public void agregarPorIndice(int indice, String valor){
        lista1.add(valor);
    }

    public String ObtenerElemento(int indice){
        return lista1.get(indice);
    }

    public void eliminarPorIndice(int indice){
        lista1.remove(indice);
    }
}
