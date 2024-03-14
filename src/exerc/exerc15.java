package exerc;

import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        int num;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros");

        for (int i = 0; i < 4 ; i++) {
            num =scanner.nextInt();

            if (num < 0){
                System.out.println(soma);
               return; // para encerrar a execução

            }
            soma = soma + num;
        }

    }

}
