package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProductTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar?");
        int n = scan.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.println("Qual o nome do produto?");
            String name = scan.next();
            System.out.println("Qual o preco do produto?");
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0.0;
        double media = 0.0;
        for(int i = 0; i < vect.length; i++) {

            soma = soma + vect[i].getPrice();
            media = soma / vect.length;
        }
        System.out.println("A media eh " + media);

        for (Product v: vect) {
            System.out.println("Valores dos produtos: " + v.getPrice());
        }

        System.out.println("Nomes dos produtos:");
        for (Product nome: vect) {
            System.out.println(nome.getName());
        }
    }
}
