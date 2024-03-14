package exerc;

import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        int num;
        int aux=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite x numero ");


        for (int i = 0; i < 3 ; i++) {

            num = scanner.nextInt();

            if (num > 8 ){
                aux=aux+1;



            }


        }

        System.out.println(aux);
    }
}
