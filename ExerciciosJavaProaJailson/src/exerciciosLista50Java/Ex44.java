package exerciciosLista50Java;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o n�mero de linhas para Tri�ngulo de Pascal: ");
        int linhas = leia.nextInt();

        mostrarTriangulo(linhas);
        
        leia.close();
    }
    
    static void mostrarTriangulo(int linhas){
        for (int i = 0; i <= linhas; i++){
            int numero = 1;
            for (int j = 0; j <= i; j++){
                System.out.println(numero + " ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
