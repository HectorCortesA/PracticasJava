import java.util.Scanner;

public class switch1{
    int n;

    void ejemplo1(){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Switch");   
            n = sc.nextInt();

        switch (n){
            case 1:
                    System.out.println("Prime switch ");
                break;
            case 2:
                    System.out.println("Segundo switch");
                break;
            case 3:
                    System.out.println("Tercer switch");
                break;
            default:
                System.out.println("Salir.......");
            break;
        }
    }while(n<4);

    sc.close();
    }

    public static void main(String [] args){
        switch1 p1 = new switch1();

        p1.ejemplo1();

    }
}