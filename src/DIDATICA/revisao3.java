package DIDATICA;

import java.util.Scanner;

public class revisao3 {
    public static void main(String[] args) {
        int numero;
        int aux=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        numero = scanner.nextInt();

        for (int i = 0; i < numero ; i++) {
            if (i % 2 == 00){
                aux = aux+1; // aux++;

                System.out.println(i);
            }

        }

        System.out.println("Quantidade de pares de 0 até " + numero + " é " + aux);
    }
}
