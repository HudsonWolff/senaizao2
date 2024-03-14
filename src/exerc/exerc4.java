package exerc;

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        String nome;
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite um numero");
        N = scanner.nextInt();


        for (int i = 0; i < N ; i++) {
            System.out.println(nome);

        }

    }
}
