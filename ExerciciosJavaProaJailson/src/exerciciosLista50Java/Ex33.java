package exerciciosLista50Java;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int numeroUm = leia.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int numeroDois = leia.nextInt();

        int mdc = calcularMDC(numeroUm, numeroDois);

        System.out.printf("O MDC de %d e %d �: %d", numeroUm, numeroDois, mdc);

        leia.close();
    }

    static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
