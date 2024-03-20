package exerciciosDOWHILE;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        int num=0,soma=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");

    do {
        soma = num + soma;
        num = scanner.nextInt();
    }while (num>0);
    System.out.println(soma);
    }


}
