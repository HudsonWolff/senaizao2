package DIDATICA;

import java.util.Scanner;

public class exercDOUBLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite um numero? : ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite outro numero : ");
double num2 = scanner.nextDouble();
double resultado = num1/num2;

        System.out.println("A divisao do números inseridos  é : " + resultado)
        ;
    }
}
