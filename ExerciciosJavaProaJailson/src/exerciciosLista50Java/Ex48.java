package exerciciosLista50Java;

public class Ex48 {
    public static void main(String[] args) {
        String texto = "2023";

        try {
            int numero = Integer.parseInt(texto);
            System.out.printf("O %s � um n�mero inteiro.", texto);
        } catch (NumberFormatException e) {
            System.out.printf("O %s n�o � um n�mero inteiro.", texto);
        }
    }
}
