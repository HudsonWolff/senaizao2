package exerciciosDOWHILE;

import java.util.Scanner;

public class supercalculadora {
    public static void main(String[] args) {
        String operacao;
        Scanner scanner = new Scanner(System.in);
        double resultado = 0,valor;


        do {
            System.out.println("Digite sua operação ");
            operacao=scanner.nextLine();

            if (operacao.equals("+")){
                System.out.println("Digite um numero");
                valor = scanner.nextDouble();
                scanner.nextLine();
                resultado=valor+resultado;



            }
            if (operacao.equals("-")){
                System.out.println("Digite um numero");
                valor=scanner.nextDouble();
                scanner.nextLine();
                resultado=resultado-valor;

            }
            if (operacao.equals("*")){
                System.out.println("Digite um numero");
                valor=scanner.nextDouble();
                scanner.nextLine();
                resultado=resultado*valor;

            }
            if (operacao.equals("/")){
                System.out.println("Digite um numero");
                valor=scanner.nextDouble();
                scanner.nextLine();
                resultado=resultado/valor;

            }


        }while (!operacao.equals("="));
        System.out.println("Resultado da calculadora é = " + resultado);






    }
}
