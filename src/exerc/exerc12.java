package exerc;

import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        int num;
        int aux=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 numeros");

        for (int i = 0; i < 5; i++) {
            num = scanner.nextInt();

            if(num % 2 == 0){
                aux = aux+1;

            }
        }
        System.out.println(aux + " Numeros São pares" );
    }
}
