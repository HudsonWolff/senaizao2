package DIDATICA;

import java.util.Scanner;

public class revisao {
    public static void main(String[] args) {
        int numero;
        String texto = "Este numero é impar : ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 0 até 1000");
        numero = scanner.nextInt();
        for (int i = 0; i <= numero ; i++) {
            if (!(i%2==0)){
                System.out.println(texto+i);

            }

        }
    }
}
