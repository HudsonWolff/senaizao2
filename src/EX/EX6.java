package EX;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
       int idade,soma=0,media = 0,quantidade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A idade de quantas pessoas deseja digitar ?");
        quantidade = scanner.nextInt();
        System.out.println("Digite as idades");

        for (int i = 0; i<quantidade  ; i++) {
            idade = scanner.nextInt();
            soma = idade+soma;
            media = soma/quantidade;

        }
        System.out.println("O total da soma das idades é de : " + soma);
        System.out.println("A media das idades digitadas é de : " + media);

    }
}
