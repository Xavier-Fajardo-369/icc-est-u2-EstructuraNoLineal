import Materia.Controllers.AVLTree;
//import Materia.Controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        //BinaryTree arbol = new BinaryTree();
        /* 
        arbol.insert(50);
        arbol.insert(17);
        arbol.insert(76);
        arbol.insert(9);
        arbol.insert(23);
        arbol.insert(54);
        arbol.insert(14);
        arbol.insert(19);
        */
        AVLTree arbol = new AVLTree();
        arbol.insert(5);
        arbol.insert(20);
        arbol.insert(15);
        

        /* 
        arbol.imprimirArbol();
        System.out.println();
        arbol.printPreOrder();
        System.out.println();
        arbol.printPostOrder();
        
        System.out.println("Arbol InOrder: ");
        arbol.printInOrder();
        System.out.println();
        
        if(arbol.findeValue(23)) {
            System.out.println("El valor 23 se encuentra en el árbol.");
        } else {
            System.out.println("El valor 23 no se encuentra en el árbol.");
        }
        if(arbol.findeValue(77)) {
            System.out.println("El valor 77 se encuentra en el árbol.");
        } else {
            System.out.println("El valor 77 no se encuentra en el árbol.");
        }
        

        
        arbol.printWithHeightTree();
        arbol.printInOrderWithHeight();
        System.out.println("Arbol InOrder con Factor de equilibrio: ");
        arbol.printInOrderBalancedFactory();
        System.out.println("Peso del árbol: " );
        arbol.printPeso();
        
        System.out.println("Arbol esta balanceado  " + arbol.isBalanced());

        if (arbol.findeValue(15)) {
         System.out.println("Existe el nodo 15 ");
        } else {
        System.out.println("Existe el 15 ");
        arbol.insert(15);
        System.out.println("Agregamos el  15");
        }

        System.out.println("Arbol esta balanceado " + arbol.isBalanced());

        if (!arbol.isBalanced()) {
        arbol.printNodosDesiquilibrados();
        }
        System.out.println("Arbol InOrder con Factor de equilibrio: ");
        arbol.printInOrderBalancedFactory();
        */
   

    }   

    
}
