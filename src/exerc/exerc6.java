package exerc;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        int soma= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva 20 idades aleatorias : ");

        for (int i = 0; i < 5; i++) {

            soma=scanner.nextInt()+soma;

        }

        System.out.println("A soma de todas as idades Digitadas é de : " +soma);

    }
}
