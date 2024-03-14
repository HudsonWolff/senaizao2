package DIDATICA;

import java.util.Scanner;

public class forFigito {
    public static void main(String[] args) {
        int []vetor = new int[5];
        Scanner scanner= new Scanner(System.in);
        int aux = 0;

        for (int i = 0; i < vetor.length ; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            vetor[i]=scanner.nextInt();

            if (aux<vetor[i]){
                aux=vetor[i];
            }


        }
        for (int i = 0; i < 1; i++) {
            System.out.println("O maior é :" + aux );

        }


    }
}
