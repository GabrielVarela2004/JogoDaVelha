package jogo_da_velha_java;

import java.util.Scanner;

public class teste_loop_principal {
    
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner scan = new Scanner(System.in);
        boolean vezDoJogador = true;
        int coluna = 0;
        int linha = 0;
        int coluna2 = 0;
        int linha2 = 0;


        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println();
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " " + "|");
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            while (vezDoJogador = true) {
                System.out.println("   VEZ DO JOGADOR 1!   ");
                System.out.println("Digite a coluna e a linha de 1-3: ");
                coluna = scan.nextInt();
                linha = scan.nextInt();
                if (coluna > 3 || coluna < 1 || linha > 3 || linha < 1) {
                    System.out.println("   JOGADA INVÁLIDA!  ");
                    System.out.println("Digite a coluna e a linha de 1-3: ");
                    linha = scan.nextInt();
                    coluna = scan.nextInt();


                }
                linha--;
                coluna--;
                tabuleiro[linha][coluna] = 'X';

                for (int k = 0; k < tabuleiro.length; k++) {
                    System.out.println();
                    for (int j = 0; j < tabuleiro[k].length; j++) {
                        System.out.print(tabuleiro[k][j] + " " + "|");
                        System.out.print(" ");
                    }
                    System.out.println();
                    vezDoJogador = false;

                }



            }
        }

    }

}
