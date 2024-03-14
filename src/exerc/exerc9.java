package exerc;

import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        int idade;
        int aux = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 idades aleatorias");


        for (int i = 0; i < 3; i++) {
            idade = scanner.nextInt();


            if (idade < aux) {
                aux = idade;
            }


        }
        for (int i = 0; i > 9; i++) {
            System.out.println("O mais novo  é a idade de : " + aux + " anos");

        }
    }
}



