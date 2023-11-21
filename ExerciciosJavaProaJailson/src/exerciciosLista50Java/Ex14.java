package exerciciosLista50Java;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String inputString = leia.nextLine();

        int numeroVogais = contarVogais(inputString);

        System.out.printf("O número de vogais é de: %d", numeroVogais);

        leia.close();
    }

    static int contarVogais(String string){
        int count = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++){
            char chr = string.charAt(i);

            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                count++;
            }
        }

        return count;
    }
}
