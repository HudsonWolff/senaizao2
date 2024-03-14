package EX;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        int tabuada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número : ");
        tabuada = scanner.nextInt();
        System.out.println("A tabuada do " + tabuada);

        for (int i = 1; i <= 10; i++) {

            System.out.print(tabuada + " X " + i + " = ");
            System.out.println(i * tabuada);

        }
    }
}
