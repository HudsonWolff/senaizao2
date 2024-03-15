package EX;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        int quantidade , idade , somaIdades = 0 , media , cont = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas vc deseja receber a idade");
        quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite sua idade");
idade= scanner.nextInt();

if (idade >= 18){
    cont++;
    somaIdades=idade+somaIdades;

}

        }
        media = somaIdades/quantidade;
        System.out.println("A media das idades é de : " + media );

















    }
}
