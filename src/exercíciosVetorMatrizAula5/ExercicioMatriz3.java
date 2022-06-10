package exercíciosVetorMatrizAula5;

import java.util.Random;
import java.util.Scanner;

import jdk.jshell.execution.Util;

public class ExercicioMatriz3 {

	public static void main(String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
		 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
		 * matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
		 * elementos de mesma posição das matrizes N1 e N2.
		 */

		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				Random gerador = new Random();
				N1[linha][coluna] = gerador.nextInt(1, 10);
				N2[linha][coluna] = gerador.nextInt(1, 10);

			}

		}
		
		for(int linha = 0; linha <4; linha++) {
			for(int coluna = 0; coluna<4; coluna ++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.println(M1[linha][coluna] + "\n");
				
				M2[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.println(M2[linha][coluna]+ "\n");
			}
		}

	}

}
