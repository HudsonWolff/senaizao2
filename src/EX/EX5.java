package EX;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        int tabuada;
        int inicio = 0;
        int fim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número : ");
        tabuada = scanner.nextInt();
        System.out.println("Quer q tabuada começe em : " );
        inicio=scanner.nextInt();
        System.out.println("Quer q tabuada termine em : ");
        fim = scanner.nextInt();
        System.out.println("A tabuada do  " + tabuada + " : De " + inicio +  " Até  " + fim);


        for (int i = inicio; i <= fim; i++) {

            System.out.print(tabuada + " X " + i + " = ");
            System.out.println(i * tabuada);

        }











    }
}
