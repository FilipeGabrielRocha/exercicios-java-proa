package exerciciosLista50Java;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número de termos da sequência da Fibonnaci: ");

        while (!leia.hasNextInt()){
            System.out.println("Digite um número válido.");
            leia.next();
        }

        int n = leia.nextInt();

        gerarFibonnaci(n);

        leia.close();
    }

    static void gerarFibonnaci(int n){
        int termoUm = 0;
        int termoDois = 1;

        System.out.printf("Os primeiros %d termos da sequência de Fibonacci são: ", n);

        for (int i = 0; i < n; i++){
            System.out.printf("%d ", termoUm);

            int proximoTermo = termoUm + termoDois;
            termoUm = termoDois;
            termoDois = proximoTermo;
        }

    }
}
