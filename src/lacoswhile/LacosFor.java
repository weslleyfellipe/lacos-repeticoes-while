package lacoswhile;

import java.util.Scanner;

public class LacosFor {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia 10 números inteiros via
		//teclado e mostre na tela quantos números são pares
		//e quantos número são ímpares. Veja o exemplo abaixo:
		
		Scanner leia = new Scanner(System.in);
		
		int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Total de números pares: " + numerosPares);
        System.out.println("Total de números ímpares: " + numerosImpares);

         leia.close();
       

	}

}
