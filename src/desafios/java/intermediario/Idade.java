/**
 * Idade
 *
 * Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
 * O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade
 * média deste grupo de indivíduos.
 *
 * Entrada
 * A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.
 *
 * Saída
 * A saída contém um valor correspondente à média de idade dos indivíduos.
 *
 * A média deve ser impressa com dois dígitos após o ponto decimal.
 * *
 * Exemplo de Entrada
 * 34
 * 56
 * 44
 * 23
 * -2
 * Exemplo de Saída
 *
 * 39.25
 *
 *
 */

package desafios.java.intermediario;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
	// write your code here
        var leitor = new Scanner(System.in);

        int cont = 0;
        double soma = 0;
        double n = 0;
        System.out.println("Digite o numero das idades, para interromper coloque uma idade negativa: ");


        while ((n = leitor.nextInt()) > 0) {
            cont++;
            soma += n;
        }
        double media = soma /cont;
        System.out.println(String.format("%.2f", media));
     }
}
