import java.util.Scanner;

public class comparadores{
    Scanner sc = new Scanner(System.in);

    void comparador(){
        int num1, num2;

        System.out.println("Ingrese el primer valor");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo valor");
        num2 = sc.nextInt();
        sc.close();

        if(num1 == num2){
            System.out.println("Los valores son iguales: "+num1+" y "+num2);
        }else{
            System.out.println("Los valores no son iguales: "+num1+" y "+num2);
        }
    }

    public static void main (String []args){
        comparadores p1 = new comparadores();

        p1.comparador();
        
    }
}