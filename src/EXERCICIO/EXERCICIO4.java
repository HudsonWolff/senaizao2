package EXERCICIO;

public class EXERCICIO4 {
    public static void main(String[] args) {
        char[] caracteres =  {'a','n','e','b','c','z','f','i','u','y'};

        int consoantes = 0;


        for (int i = 0; i < caracteres.length ; i++) {


            if (caracteres [i] =='a' || caracteres [i] =='e' || caracteres [i]=='i'|| caracteres [i]=='o' || caracteres [i] == 'u'){

            }
            else {
                System.out.println(caracteres[i]);
                consoantes++;
            }

        }

        System.out.print("Total de consoantes: " + consoantes);



    }
}
