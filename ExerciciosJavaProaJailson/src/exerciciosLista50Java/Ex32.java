package exerciciosLista50Java;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número pra saber se é uma potência de 2: ");
        int numero = leia.nextInt();

        if (potenciaDois(numero)){
            System.out.printf("O %d é uma potência de 2.", numero);
        } else {
            System.out.printf("O %d não é uma potência de 2.", numero);
        }

        leia.close();
    }

    static boolean potenciaDois(int numero) {
        return (numero > 0) && ((numero & (numero - 1)) == 0);
    }
}
