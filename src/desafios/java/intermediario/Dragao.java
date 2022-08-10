package desafios.java.intermediario;

import java.util.Scanner;

public class Dragao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de visitantes: ");
        while (leitor.hasNext()) {
            int N = leitor.nextInt(); // Número de Visitantes
            System.out.println("Digite a altura mínima: ");
            int min = leitor.nextInt(); // Altura mínima
            System.out.println("Digite a altura máxima: ");
            int max = leitor.nextInt(); // Altura máxima
            int cont = 0;
            System.out.println("Digite o valor em centímetros das alturas dos visitantes cadastrados: ");
            for (int i =0; i < N  ; i++) {
                int A = leitor.nextInt();
                if (A >= min && A <= max ) cont++;
            }
            System.out.println(cont); // cont pessoas que poderão andar na montanha-russa.
        }
       }
}
