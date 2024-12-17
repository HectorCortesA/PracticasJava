import java.util.Scanner;

public class ejercicioIf1{
int num; 
    public void ejer1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        if(num<10){
            System.out.println("Es menor que 10");
        }else{
            System.out.println("El mayor que 10");
        }
        sc.close();
    }
    public static void main(String[]args){
        ejercicioIf1 p1 = new ejercicioIf1();
        p1.ejer1();
    }
}