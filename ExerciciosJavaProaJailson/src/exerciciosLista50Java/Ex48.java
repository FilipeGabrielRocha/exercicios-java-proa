package exerciciosLista50Java;

public class Ex48 {
    public static void main(String[] args) {
        String texto = "2023";

        try {
            int numero = Integer.parseInt(texto);
            System.out.printf("O %s é um número inteiro.", texto);
        } catch (NumberFormatException e) {
            System.out.printf("O %s não é um número inteiro.", texto);
        }
    }
}
