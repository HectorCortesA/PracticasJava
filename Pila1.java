import java.util.Scanner;
import java.util.Stack;
public class Pila1{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        int num;
        do{ //dentro del do te muestra el menu antes de colocar el switch
            System.out.println("1 agregar num a la Pila");
            System.out.println("2 Eliminar de la pila");
            System.out.println("3 pila esta llena");
            System.out.println("4 Tamano de la pila");
        
            System.out.println("Ingresa el primer numero");
             num = sc.nextInt();
            
            switch (num) {
                case 1:
                    System.out.println("Ingrese el valor");
                    int num1 = sc.nextInt(); //Entrada de teclado
                    pila.push(num1); //Ingresa a la pila lo que tiene en la variable 
                    System.out.println("Ingresate a la pila: "+pila); //Muestra en la dato que ingresastes en la pila 
                    break;
                case 2:
                if(!pila.empty()){ //Verfiica que la pila esta vacia 
                   int numE = pila.pop(); // en la variable numE borra el elemento de la pila = pila.pop();
                   System.out.println("Eliminaste a de la pila: "+numE); //Muestra el dato borrado con la variable numE
                }else{
                    System.out.println("Esta vacia la pila"); // Si la pila esta vacia lee el else y te muestra que esta vacia 
                }
                break;
                case 3:
                        System.out.println("La pila esta Vacia: "+pila.empty());  //Te dice que que si esta vacia con un True o falaso si tiene datos 
                    
                break;
                case 4:
                if(!pila.empty()){ // Verifica que la pila si esta vacia, si tiene datos pasa a la siguiente dato
                    System.out.println("tamano de la pila es de: "+pila.size()); // // Te muestra el numero total de datos que tiene la pila
                }else{
                    System.out.println("No hay elementos en la pila "); //Si esta vacia pasa la siguiente instruccion y te muestra que esta vacia la pila
                }
                    break;
                case 5:
                    if(!pila.empty()){
                        System.out.println(pila); //Te muestra toda la pila
                    }else{
                        System.out.println("No hay elementos en la pila, pila vacia"); //pasa a esta intrunccion si la pila esta vacia 
                    }  
                break;
                default:
                    break;
            }
        }while(num !=6);
        sc.close();//Se cierra la entrada de teclado  
    }
}