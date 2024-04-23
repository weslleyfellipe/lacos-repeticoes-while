package lacoswhile;

import java.util.Scanner;

public class LacosWhile {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas
       //cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
       // A leitura dos dados 
       // deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:
          
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int totalmenores21= 0;
		int totalmaiores50= 0;
		
		System.out.println("Digite uma idade");
		idade = leia.nextInt();
		
		while (idade >=0) {
			 if (idade < 21) {
	                totalmenores21++;
	            } else if (idade > 50) {
	            	totalmaiores50++;
	            }

	            System.out.print("Digite uma idade: ");
	            idade = leia.nextInt();
	            
	            
	            
			
		}
	        System.out.println("Total de pessoas menores de 21 anos: " + totalmenores21);
		 
            System.out.println("Total de pessoas maiores de 50 anos: " + totalmaiores50);
            
            leia.close();
	}

}
