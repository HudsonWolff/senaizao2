package exerc;

import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        int num;
        int aux = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva 20 numeros");

        for (int i = 0; i < 5 ; i++) {
            num = scanner.nextInt();

        if (num > 0 && num < 100){
            aux =aux+1;

        }

        }
        System.out.println(aux + "São entre 0 e 100");

    }
}
