package exerciciosLista50Java;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um número pra saber se ele é (positivo, negativo ou zero): ");
        int numero = leia.nextInt();

        if (numero > 0){
            System.out.println("positivo");
        } else if (numero == 0){
            System.out.println("zero");
        } else {
            System.out.println("negativo");
        }

        leia.close();
    }
}
