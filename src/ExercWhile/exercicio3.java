package ExercWhile;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        String nome = "";
        String sexo = "";
        String ec = "";
        int idade = 0;
        double salario = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        System.out.println("Digite seu salario");
        salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite seu sexo (f/m)");
        sexo = scanner.nextLine();
        System.out.println("Digite seu Estado civil (s/c/v/d)");
        ec = scanner.nextLine();




        while (!(nome.length()>3 && (idade>0&&idade<150) && salario>0 && (sexo.equals("f") || sexo.equals("m")) && (ec.equals("s") || ec.equals("c") || ec.equals("v") || ec.equals("d")) )){

            System.out.println("Alguma entrada está incorreta. Por favor, digite novamente.");
            System.out.println("Digite seu nome");
            nome = scanner.nextLine();
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
            System.out.println("Digite seu salario");
            salario = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite seu sexo (f/m)");
            sexo = scanner.nextLine();
            System.out.println("Digite seu Estado civil (s/c/v/d)");
            ec = scanner.nextLine();


        }
        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade);
        System.out.println("Seu salario é de : R$" + salario);
        System.out.println("Seu sexo é : " + sexo);
        System.out.println("Seu estado civil é : " + ec);




    }
}
