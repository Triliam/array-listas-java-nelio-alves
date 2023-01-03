package vetores.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos dados pretende salvar?");
        int n = scan.nextInt();

        double[] dados = new double[n];

        for (int i = 0; i < n; i++) {
            dados[i] = 20;
        }

        System.out.println(Arrays.toString(dados));

        double soma = 0.0;
        for (int i = 1; i < n; i++) { //se colocar for (int i = 1; i < n; i++) vai ignorar a posicao 0 do vetor, e assim ignora o valor contido na posicao
            soma = soma + dados[i]; // vai buscar o VALOR que esta na POSICAO[0], [1], [2]
            System.out.println("Valor solicitado da posicao: " + i + " = " + dados[i]);
        }
        double media = soma / n;

        System.out.printf("A media dos valores solicitados eh %.2f%n", media);

        scan.close();
    }
}
