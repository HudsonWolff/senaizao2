package DIDATICA;

import java.util.Scanner;

public class exercIFELSE2 {
    public static void main(String[] args) {
        int num1 , num2 , num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite primeiro valor : ");
        num1=scanner.nextInt();
        System.out.print("Digite segundo valor : ");
        num2=scanner.nextInt();
        System.out.print("DiGite terceiro valor : ");
        num3=scanner.nextInt();

        if(num1>=num2 & num1>=num3){
            System.out.println(num1 + " é o maior");

        }  else {

        } if (num2>=num1 & num2>=num3){
            System.out.println(num2 + " é o maior");

        } else{
            System.out.println(num3 + " é o maior");
        }

    }
}
