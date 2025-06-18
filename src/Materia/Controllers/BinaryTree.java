package Materia.Controllers;

import Materia.Models.Node;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int valor) { //50
           // null
        root = insertRec(root, valor);    
    }
    private Node insertRec(Node padre, int valor) { // null, 50
        if (padre == null) {
            return new Node(valor);
        }
        if (valor < padre.getValor()) {
            padre.setIzquierda(insertRec(padre.getIzquierda(), valor));
        } else if (valor > padre.getValor()) {
            padre.setDerecha(insertRec(padre.getDerecha(), valor));
        }
        return padre;
    }
     
     
    public void imprimirArbol(){
        imprimirArbolRec(root);
    }
    private void imprimirArbolRec(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " | ");
            imprimirArbolRec(nodo.getIzquierda());
            imprimirArbolRec(nodo.getDerecha());
        }
    }
    public void printPreOrder() {
        printPreOrderRec(root);
    }
    private void printPreOrderRec(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " | ");
            printPreOrderRec(nodo.getIzquierda());
            printPreOrderRec(nodo.getDerecha());
        }
    }
    public void printPostOrder() {
        printPostOrderRec(root);
    }
    private void printPostOrderRec(Node nodo) {
        if (nodo != null) {
            printPostOrderRec(nodo.getIzquierda());
            printPostOrderRec(nodo.getDerecha());
            System.out.print(nodo.getValor() + " | ");
        }
    }
    public void printInOrder() {
        printInOrderRec(root);
    }
    private void printInOrderRec(Node nodo) {
        if (nodo != null) {
            printInOrderRec(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " | ");
            printInOrderRec(nodo.getDerecha());
        }
    }
    

    
}
