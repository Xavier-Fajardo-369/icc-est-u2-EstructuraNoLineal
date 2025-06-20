package Materia.Controllers;

import Materia.Models.Node;

public class BinaryTree {
    private Node root;
    private int peso;

    public BinaryTree() {
        this.root = null;
        this.peso = 0;
    }

    

    

    public void insert(int valor) { //50
           // null
        root = insertRec(root, valor);    
    }
    private Node insertRec(Node padre, int valor) { // null, 50
        if (padre == null) {
            peso++;
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
    public boolean findeValue(int valor) {
        return findeValueRec(root, valor);
    }
    private boolean findeValueRec(Node nodo, int valor) {
        if (nodo == null) {
            return false;
        }
        if (nodo.getValor() == valor) {
            return true;
        }
        return valor < nodo.getValor() ? 
            findeValueRec(nodo.getIzquierda(), valor) : 
            findeValueRec(nodo.getDerecha(), valor);
    }
    public int getHeightTree() {
        return getHeightRec(root);
    }
    private int getHeightRec(Node nodo) {
        if (nodo == null) {
            return 0;
        }
        int leftHeight = getHeightRec(nodo.getIzquierda());
        int rightHeight = getHeightRec(nodo.getDerecha());
        return Math.max(leftHeight, rightHeight) + 1;
        
    }
    public void printWithHeightTree() {
        System.out.println("Altura del árbol: " + getHeightTree());
    }
    public void printInOrderWithHeight() {
        printInOrderWithHeightRec(root);
    }
    private void printInOrderWithHeightRec(Node nodo) {
        if (nodo != null) {
            printInOrderWithHeightRec(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " (Altura: " + getHeightRec(nodo) + ") | ");
            printInOrderWithHeightRec(nodo.getDerecha());
        }
    }
    public void printInOrderBalancedFactory() {
        printInOrderBalancedFactoryRec(root);
    }
    private void printInOrderBalancedFactoryRec(Node nodo) {
        if (nodo != null) {
            printInOrderBalancedFactoryRec(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " (bf = " + (getHeightRec(nodo.getIzquierda()) - getHeightRec(nodo.getDerecha())) + ") | ");
            printInOrderBalancedFactoryRec(nodo.getDerecha());
        }
    }



    public Node getRoot() {
        return root;
    }



    public void setRoot(Node root) {
        this.root = root;
    }



    public int getPeso() {
        return peso;
    }



    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void printPeso() {
        System.out.println("Peso del árbol: " + peso);
    }
    public boolean isBalanced() {
        return isBalancedRec(root);
    }
    private boolean isBalancedRec(Node nodo) {
        if (nodo == null) {
            return true;
        }
        int leftHeight = getHeightRec(nodo.getIzquierda());
        int rightHeight = getHeightRec(nodo.getDerecha());
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalancedRec(nodo.getIzquierda()) && isBalancedRec(nodo.getDerecha());
    }
    public void printNodosDesiquilibrados() {
        System.out.println("Nodos desiquilibrados:");
        printNodosDesiquilibradosRec(root);
    }
    private void printNodosDesiquilibradosRec(Node nodo) {
        if (nodo != null) {
            int leftHeight = getHeightRec(nodo.getIzquierda());
            int rightHeight = getHeightRec(nodo.getDerecha());
            if (Math.abs(leftHeight - rightHeight) > 1) {
                System.out.println("Nodo desiquilibrado: " + nodo.getValor() + " (bf = " + (leftHeight - rightHeight) + ")");
            }
            printNodosDesiquilibradosRec(nodo.getIzquierda());
            printNodosDesiquilibradosRec(nodo.getDerecha());
        }
    }
    

    

   
 
}