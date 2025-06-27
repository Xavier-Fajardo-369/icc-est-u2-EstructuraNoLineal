package Materia.Controllers;

import Materia.Models.Node;

public class AVLTree {
    private Node root;
    

    public AVLTree() {
        this.root = null;
    }

    public void insert(int valor) {
        root = insertRec(root, valor);

    }
    private Node insertRec(Node nodo, int valor) {
        if (nodo == null) {
            Node nuevoNodo = new Node(valor);
            nuevoNodo.setHeight(1);
            System.out.println("Nodo insertado -> " + valor + " con balance 0");
            return nuevoNodo;
           
        }
        if (valor < nodo.getValor()) {
            nodo.setIzquierda(insertRec(nodo.getIzquierda(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecha(insertRec(nodo.getDerecha(), valor));
        } else {
            return nodo; 
        }

        System.out.println("Nodo acutal -> " + nodo.getValor());
        
        int altura = 1 + Math.max(height(nodo.getIzquierda()), height(nodo.getDerecha()));
        nodo.setHeight(altura);
        System.out.println("\nAltura del nodo -> " + altura);
        int balance = getBalance(nodo);
        System.out.println("\nBalance del nodo -> " + balance);

        
        if (balance > 1 && valor < nodo.getIzquierda().getValor()) {
            System.out.println("\nRotación derecha en el nodo -> " + nodo.getValor());
            return rotateRight(nodo);
        }

        
        if (balance < -1 && valor > nodo.getDerecha().getValor()) {
            System.out.println("\nRotación izquierda en el nodo -> " + nodo.getValor());
            return rotateLeft(nodo);
        }

        //caso derecha - izquierda
        if (balance > 1 && valor > nodo.getIzquierda().getValor()) {
            System.out.println("Cambio");
            nodo.setIzquierda(rotateLeft(nodo.getIzquierda()));
            System.out.println("Rotacion simple derecha");
            return rotateRight(nodo);
        }

        
        if (balance < -1 && valor < nodo.getDerecha().getValor()) {
            System.out.println("Cambio");
            nodo.setDerecha(rotateRight(nodo.getDerecha()));
            System.out.println("Rotacion simple izquierda");
            return rotateLeft(nodo);
        }

        return nodo;
    }
    public int height(Node nodo) {
        return nodo == null ? 0 : nodo.getHeight();
    } 
   
    public int getBalance(Node nodo) {
        if (nodo == null) {
            return 0;
        }
        return height(nodo.getIzquierda()) - height(nodo.getDerecha());
    }
    private Node rotateLeft(Node x) {
        Node y = x.getDerecha();
        Node tem = y.getIzquierda();
        //Imprimir información antes de la rotación
        System.out.println("\nRotación izquierda en el nodo -> " + x.getValor()+ ", con balamce " + getBalance(x));
        //Realizar la rotación
        y.setIzquierda(x);
        x.setDerecha(tem);
        //Actualizar las alturas de los nodos x,y
        x.setHeight(Math.max(height(x.getIzquierda()), height(x.getDerecha())) + 1);
        y.setHeight(Math.max(height(y.getIzquierda()), height(y.getDerecha())) + 1);
        //Imprimir información después de la rotación
        System.out.println("Nueva raiz despues de la rotación izquierda: " + y.getValor() );
        // Retornar el nuevo nodo raíz
        return y;
    }
    private Node rotateRight(Node y) {
        Node x = y.getIzquierda();
        Node tem = x.getDerecha();
        // Imprimir información antes de la rotación
        System.out.println("\nRotación derecha en el nodo -> " + y.getValor() + ", con balance " + getBalance(y));
        // Realizar la rotación
        x.setDerecha(y);
        y.setIzquierda(tem);
        // Actualizar las alturas de los nodos x, y
        y.setHeight(Math.max(height(y.getIzquierda()), height(y.getDerecha())) + 1);
        x.setHeight(Math.max(height(x.getIzquierda()), height(x.getDerecha())) + 1); 
        // Imprimir información después de la rotación
        System.out.println("Nueva raiz despues de la rotación derecha: " + x.getValor() );
        // Retornar el nuevo nodo raíz

        return x;
    }

  

}
