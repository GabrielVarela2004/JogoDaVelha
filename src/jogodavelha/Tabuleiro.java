package jogodavelha;

import java.util.Scanner;

public class Tabuleiro {

    /* =========================================================================
       MÉT0DO: VALIDAÇÃO DE GANHADOR
       Verifica se o jogador atual completou uma linha, coluna ou diagonal.
       ========================================================================= */

    static boolean validarGanhador(char[][] tabuleiro, char jogadorAtual) {
        // Verifica linhas e colunas simultaneamente
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            } else if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        // Verifica as duas diagonais
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        } else if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner scan = new Scanner(System.in);
        boolean vezDoJogador = true;
        int coluna = 0;
        int linha = 0;
        int novaPartida = 0;

        // Imprime a estrutura inicial do tabuleiro vazio
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println();
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " " + "|");
                System.out.print(" ");
            }
        }
        System.out.println();

        /* =============================================================
           LOOP PRINCIPAL DO JOGO (Máximo de 9 jogadas possíveis)
           =============================================================
        */

        for (int i = 0; i <= 9; i++) {

            /* ---------------------------------------------------------------------
               TURNO DO JOGADOR 1 (SÍMBOLO: 'X')
               --------------------------------------------------------------------- */
            if (vezDoJogador == true) {
                System.out.println("   VEZ DO JOGADOR 1!   ");
                System.out.println("Digite a coluna e a linha de 1-3: ");
                coluna = scan.nextInt();
                linha = scan.nextInt();

                // Validação de intervalo inválido (fora de 1 a 3)
                if (coluna > 3 || coluna < 1 || linha > 3 || linha < 1) {
                    System.out.println("   JOGADA INVÁLIDA!  ");
                    System.out.println("Digite a coluna e a linha de 1-3: ");
                    linha = scan.nextInt();
                    coluna = scan.nextInt();


                }

                // Ajusta a escala 1-3 do usuário para o padrão 0-2 dos arrays do Java
                linha--;
                coluna--;

                // Validação para casa já preenchida
                if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                    System.out.println("   JOGADA INVÁLIDA!  ");
                    System.out.println("Digite a coluna e a linha de 1-3: ");
                    linha = scan.nextInt();
                    coluna = scan.nextInt();
                }

                // Grava a jogada no tabuleiro
                tabuleiro[linha][coluna] = 'X';

                // Desenha o tabuleiro atualizado na tela
                for (int k = 0; k < tabuleiro.length; k++) {
                    System.out.println();
                    for (int j = 0; j < tabuleiro[k].length; j++) {
                        System.out.print(tabuleiro[k][j] + " " + "|");
                        System.out.print(" ");
                    }
                    System.out.println();


                }

                // Verifica se o Jogador 1 venceu
                if (validarGanhador(tabuleiro, 'X')) {
                    System.out.println(" --- JOGADOR 1 VENCEU! ---");
                    System.exit(0);
                }

                // Passa o turno para o Jogador 2
                vezDoJogador = false;


            /* ---------------------------------------------------------------------
               TURNO DO JOGADOR 2 (SÍMBOLO: 'O')
               --------------------------------------------------------------------- */
            } else if (vezDoJogador == false) {
                System.out.println("--- VEZ DO JOGADOR 2 (O) ---");
                System.out.println("Digite a coluna e a linha de 1-3: ");
                coluna = scan.nextInt();
                linha = scan.nextInt();

                // Validação de intervalo inválido (fora de 1 a 3)
                if (coluna > 3 || coluna < 1 || linha > 3 || linha < 1) {
                    System.out.println("   JOGADA INVÁLIDA!  ");
                    System.out.println("Digite a coluna e a linha de 1-3: ");
                    linha = scan.nextInt();
                    coluna = scan.nextInt();


                }

                // Subtrai 1 para ajustar ao índice 0-2 da matriz
                linha--;
                coluna--;


                // Validação para casa já preenchida
                if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                    System.out.println("   JOGADA INVÁLIDA!  ");
                    System.out.println("Digite a coluna e a linha de 1-3: ");
                    linha = scan.nextInt();
                    coluna = scan.nextInt();
                }

                // Grava a jogada no tabuleiro
                tabuleiro[linha][coluna] = 'O';

                // Desenha o tabuleiro atualizado na tela
                for (int k = 0; k < tabuleiro.length; k++) {
                    System.out.println();
                    for (int j = 0; j < tabuleiro[k].length; j++) {
                        System.out.print(tabuleiro[k][j] + " " + "|");
                        System.out.print(" ");
                    }
                    System.out.println();


                }

                // Verifica se o Jogador 2 venceu
                if (validarGanhador(tabuleiro, 'O')) {
                    System.out.println(" --- JOGADOR 2 VENCEU! ---");
                    System.exit(0);
                }

                // Passa o turno de volta para o Jogador 1
                vezDoJogador = true;
            }

        }

        /* =========================================================================
           FINALIZAÇÃO DA PARTIDA
           Se o loop de 9 rodadas terminar sem nenhum vencedor, o jogo empata.
           ========================================================================= */
        System.out.println("--- DEU EMPATE! ---");


    }

 }


