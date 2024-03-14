package DIDATICA;

import java.util.Scanner;

public class LOGIN  {
    public static void main(String[] args) {
        String login;
        int senha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu login");
        login= scanner.nextLine();

        System.out.println("Digite sua Senha");
        senha= scanner.nextInt();

        if (login.equals("admin") && senha==12345 ){

            System.out.println("Login Feito com Sucesso");

        } else {
            System.out.println("Dados incorretos");
        }








    }

}
