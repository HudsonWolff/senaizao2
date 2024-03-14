package EXERCICIO;

import java.util.Scanner;

public class EXERCICIO5 {
    public static void main(String[] args) {
        int []vetor = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero : ");

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i]=scanner.nextInt();
            
        }

    }
}
