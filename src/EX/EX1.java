package EX;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        int aux = 0;


        for (int i = 0; i <=3; i++) {

            if ( (!(i%2==0)) && i%3==0  ){
                aux++;

            }


        }
        System.out.println(aux);
    }
}
