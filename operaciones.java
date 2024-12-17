import java.util.Scanner;

public class operaciones {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, op;

        System.out.println("Ingrese el primero numero");
        num1 = sc.nextInt();

        System.out.println("ingrese el segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("ingrese las opciones\n 1.suma\n 2.resta\n 3.multiplicacion\n 4.salir\n");
        op = sc.nextInt();
        switch (op) {
            case 1:
                
                System.out.println("La suma es de: "+(num1+num2));
                
                break;
            case 2: 
                System.out.println("La resta es de: "+(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion es de: "+(num1*num2));
                break;
            default: 
                System.out.println("Ingresa un numero del 1 al 3");
                break;
        }
        sc.close();
    }
}