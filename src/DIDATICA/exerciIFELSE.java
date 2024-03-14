package DIDATICA;

import java.util.Scanner;

public class exerciIFELSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero : ");
        int num1 = scanner.nextInt();

        System.out.print("Digit outro numero : ");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("O numero 1 é maior");

        } else {
            System.out.println("o numero 2 é maior");
        }

    }
}
