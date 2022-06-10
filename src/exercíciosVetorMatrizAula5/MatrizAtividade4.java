package exercíciosVetorMatrizAula5;

import java.util.Scanner;

public class MatrizAtividade4 {

	public static void main(String[] args) {
		/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal. */
		
		
		int[][] matriz = new int[3][3];
		int soma= 0;
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha<3; linha ++) {
			for(int coluna = 0; coluna<3; coluna++ ) {
				System.out.println("Por favor informe um numero");
				matriz[linha][coluna]= leia.nextInt();			
				if(linha == coluna) {
					soma += matriz[linha][coluna];
				}
			}
		}
		//mostrando os valores da matriz
		for(int linha = 0; linha <3; linha++) {
			for(int coluna= 0; coluna < 3; coluna++) {
				System.out.printf(matriz[linha][coluna] + "|");
			}
			System.out.println();
		}
		System.out.println("A soma dos valores da diagonal principal foi de: " +soma);
	}
}
