import java.util.Scanner;
public class Desafio02 {

    public static void main(String[] args) throws Exception {
        /** Desenvolva um programa que leia um valor inteiro N.
         *  Este N refere-se à quantidade de linhas de saída que
         *  serão apresentadas na execução do programa. 
         */

        Scanner sc = new Scanner(System.in);
		
		int n, aux=1;
		
        System.out.println("Digite um inteiro");
		n = sc.nextInt();
		
		//Escreva o seu código
        for (int i = 1; i <= n*4;i+=4) {
            System.out.print(i + " ");
			System.out.print(i + 1 + " ");
			System.out.print(i + 2 + " ");
			System.out.println("PUM");
		}
    sc.close();
    }
}
