package exerc;

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
nome= scanner.nextLine();


        for (int i = 0; i < 10  ; i++) {
            System.out.println(nome);
        }

        }
}
