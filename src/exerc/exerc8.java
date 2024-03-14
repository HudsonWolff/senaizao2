package exerc;

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        int idade;
        int aux = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 idades aleatorias");


        for (int i = 0; i < 8; i++) {
            idade = scanner.nextInt();


            if (aux < idade) {
                aux = idade;
            }


        }
        for (int i = 0; i < 1; i++) {
            System.out.println("O maior é :" + aux);

        }
    }
}
