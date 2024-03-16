package Ex1503;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero 1 a 10");
        numero = scanner.nextInt();

        while (numero > 0 && numero<10){
            System.out.println("Digite outro numero valido");
            numero= scanner.nextInt();




        }






    }
}
