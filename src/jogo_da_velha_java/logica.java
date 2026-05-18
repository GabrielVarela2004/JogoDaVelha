package jogo_da_velha_java;

import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };

        boolean vezDoJogador = true;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println();
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " " + "|");
                System.out.print(" ");
            }
        }
        System.out.println();
        if (vezDoJogador = true) {
            int validador = 4;
            while (validador > 3 || validador < 0) {
                System.out.println("vez do jogador 1,Digite a linha de 1 a 3: ");
                validador = scan.nextInt();
                System.out.println("Jogada inválida, digite novamente: ");
                validador = scan.nextInt();
            }
            int linha = scan.nextInt();



            System.out.println("Digite a coluna de 1 a 3: ");
            validador = scan.nextInt();
            while (validador > 3 || validador < 0) {
                System.out.println("Jogada inválida, digite novamente: ");
                validador = scan.nextInt();
            }
               int coluna = scan.nextInt();
            tabuleiro[linha][coluna] = 'X';




                vezDoJogador = false;


                if (vezDoJogador = false) {
                    System.out.println("vez do jogador 2, Digite a linha de 1 a 3:");
                    int validador3 = scan.nextInt();
                    if (validador3 > 3 || validador3 < 0) {
                        System.out.println("Jogada inválida, digite novamente: ");
                    } else {
                        int linha2 = scan.nextInt();

                        vezDoJogador = true;


                    }
                }
            }
        }
    }
