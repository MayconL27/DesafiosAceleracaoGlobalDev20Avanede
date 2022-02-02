import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) throws Exception {
        /** Você recebeu desafio para determinar qual dos produtos é o 
         * preferêncial dos clientes de um posto de abastecimento de 
         * combustível. Para isso você deve escrever um algoritmo para 
         * ler o tipo de combustível abastecido (codificado da seguinte 
         * forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário 
         * informe um código inválido (fora da faixa de 1 a 4) deve ser 
         * solicitado um novo código (até que seja válido). O programa 
         * será encerrado quando o código informado for o número 4. 
         * 
         * */

        Scanner sc = new Scanner(System.in);
			
		int combustivel, stop=1;
		int soma1=0, soma2=0, soma3=0;

		//System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
		while (stop != 2){    
			if (stop == 1){
				combustivel = sc.nextInt();
				if (combustivel == 1){
					soma1 = soma1 + 1;
				}
				else if (combustivel == 2){
					soma2++;
				}
				else if (combustivel == 3){
					soma3++;
				}
				else if (combustivel == 4){
					stop=2;
				}
				else {
					System.out.println("Código inválido");
				}
			}
			if (stop == 2){
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\n",soma1);
				System.out.printf("Gasolina: %d\n",soma2);
				System.out.printf("Diesel: %d\n",soma3);
			}
		}
		sc.close();
    }
}
