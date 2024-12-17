//Primero en entrar es el primero en salir 
//Fifo (first-in first-out)

import java.util.LinkedList;
import java.util.Queue;;

public class Cola{

    public static void main(String [] args){
        Queue<Integer> cola = new LinkedList<>(); //Declarala cola

        cola.add(2); //introduce datos a la cola 
        cola.add(3);
        cola.add(2);
        cola.add(2);

        System.out.println(cola); // Muestra toda la cola

        cola.poll(); //Elimna datos de la cola 
        System.out.println(cola);

        System.out.println(cola.element()); // Devuelve el ultimo datos
        System.out.println(cola.peek()); // lanza una excepecion
    }
} 