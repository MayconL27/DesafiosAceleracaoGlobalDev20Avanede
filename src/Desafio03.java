import java.util.Scanner;
public class Desafio03 {

    public static void main(String[] args) throws Exception {
    /** Escreva um programa que leia 2 valores X e Y e que 
     * imprima todos os valores entre eles cujo resto da 
     * divisão dele por 5 for igual a 2 ou igual a 3. 
     * Entrada
     * O arquivo de entrada contém 2 valores positivos inteiros quaisquer,
     *  não necessariamente em ordem crescente.
     * Saída 
     * Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente. 
     * */

        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();

        for (int i = x + 1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
        inp.close();
    }
}
