package exerciciosLista50Java;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um n�mero pra ser gerado n�meros primos at� o n�mero que digitou: ");
        int numero = leia.nextInt();
        
        System.out.print("Os n�mero s�o: ");

        for (int i = 2; i <= numero; i++){
            if (primo(i)){
                System.out.printf("%d ", i);
            }
        }

        leia.close();
    }

    static boolean primo(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
