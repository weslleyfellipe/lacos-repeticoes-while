package lacoswhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		//Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
		
		
	    Scanner leia = new Scanner(System.in);
		
	    int numero;
	    int positivos = 0 ;
	    
	  
	    do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            
            if (numero > 0) {
               positivos = numero + positivos;
            }
        } while (numero != 0);
	   
	    System.out.println("A soma dos números positivos é: " + positivos);
	    
	    leia.close();
	}

}
