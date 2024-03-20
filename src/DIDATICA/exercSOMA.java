package DIDATICA;

import java.util.Scanner;

public class exercSOMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite um segundo numero :");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("O resultado da soma.txt dos numeros é : " + soma);

        int subt = numero1 - numero2;
        System.out.println("O resultado da subtração dos numero é de : " + subt);


        int multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação dos numeros é de " + multiplicacao);

        int divisao = numero1/numero2;
        System.out.println("A divisão dos numero é de : " + divisao);











    }
}
