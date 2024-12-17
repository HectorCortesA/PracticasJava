import java.util.Stack;

public class Pila{
    
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        
        pila.push(2); //agregar elemento a la pila
        pila.push(3);
        pila.push(3);

        System.out.println(pila);

        System.out.println(pila.size()); // Te muestra el Tamano de la pila

        pila.pop(); // eliminar elemento de la pila 
        pila.pop();
        pila.pop();
        

        System.out.println(pila);
        System.out.println(pila.empty()); //determinar la pila si esta vacia 

    }

}