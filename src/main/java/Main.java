import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as temperaturas da semana (7 valores separados por espaço):");
        String input = scanner.nextLine();

        String[] valores = input.split(" ");
        int[] temperaturas = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            try {
                temperaturas[i] = Integer.parseInt(valores[i]);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de inserir números inteiros separados por espaço.");
                return;
            }
        }

        Object resultado = Temperatura.diasAcimaDaMedia(temperaturas);

        if (resultado instanceof Integer) {
            System.out.println("Dias com temperaturas acima da média: " + resultado);
        } else {
            System.out.println(resultado);
        }

        scanner.close();
    }
}
