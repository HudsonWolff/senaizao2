package ExercWhile;

import java.util.Scanner;

public class exercico4 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");


        while(numero != -1){

            numero= scanner.nextInt();
            soma = numero+soma;

        }
        System.out.println(soma++);
    }

}
