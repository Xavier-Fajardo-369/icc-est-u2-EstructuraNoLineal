package Materia.Models;

public class Node {
    private int height;
    private int valor;
    private Node izquierda;
    private Node derecha;
    

    public Node(int valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }


    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }


    public Node getIzquierda() {
        return izquierda;
    }


    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }


    public Node getDerecha() {
        return derecha;
    }


    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }
    @Override
    public String toString() {
        return "Node{" +
                "valor=" + valor +
                ", izquierda=" + izquierda +
                ", derecha=" + derecha +
                '}';
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }
   
    

    
    

    



    
}
