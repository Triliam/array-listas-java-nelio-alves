package vetores.application;

import vetores.entities.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class PensionatoTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = scan.nextInt();

        Pensionato[] pensionato = new Pensionato[10];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Room: #" + i);
            System.out.println("Name: ");
            String name = scan.next();

            System.out.println("Email: ");
            String email = scan.next();

            System.out.println("Room: ");
            int p = scan.nextInt();

            pensionato[p] = new Pensionato(name, email);
        }

        for (int i = 0; i < pensionato.length; i++) {
            if (pensionato[i] != null) {
                System.out.println(i + ": " + pensionato[i]);
            }
        }
    }
}
