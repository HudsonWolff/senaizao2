package exerciciosDOWHILE;

import DIDATICA.MAIN;

import java.util.Random;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
int dado1,dado2;
String opcao;
Random random = new Random();
Scanner scanner = new Scanner(System.in);

do {
    System.out.println("Deseja continuar jogando ( sim / nao )");
    opcao=scanner.nextLine();

    dado1 = random.nextInt(1,6);
    dado2 = random.nextInt(1,6);

    System.out.println("Dado 1 : " + dado1);
    System.out.println("Dado 2 : " + dado2);
if (dado1==dado2){
    System.out.println("Voce ganhou");
}


} while (opcao.equalsIgnoreCase("sim") && dado1 != dado2);


















    }



}