package DIDATICA;

import java.util.Scanner;

public class revisao2 {
    public static void main(String[] args) {
       int numero;
       String texto="Numero par : ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para decrementar");
        numero= scanner.nextInt();


        for (int i = numero; i > 0 ; i--) {
            if (i%2==0){
                System.out.println(texto+i);
            }
    }
}
}
