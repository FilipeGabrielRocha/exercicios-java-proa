package exerciciosLista50Java;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int numero = leia.nextInt();

        int soma = calcularDigitos(numero);

        System.out.printf("A soma entre os d�gitos %d � de: %d", numero, soma);

        leia.close();
    }

    static int calcularDigitos(int numero) {
        int soma = 0;

        while (numero != 0){
            int digito = numero % 10;
            soma += digito;
            numero /= 10;
        }

        return soma;
    }
}
