public class Temperatura {

    public static Object diasAcimaDaMedia(int[] temperaturas) {
        if (temperaturas.length != 7) {
            return "Erro";
        }

        int soma = 0;
        for (int temperatura : temperaturas) {
            if (temperatura < -100 || temperatura > 100) {
                return "Erro";
            }
            soma += temperatura;
        }

        double media = soma / 7.0;

        int diasAcimaDaMedia = 0;
        for (int temperatura : temperaturas) {
            if (temperatura > media) {
                diasAcimaDaMedia++;
            }
        }

        return diasAcimaDaMedia;
    }
}
