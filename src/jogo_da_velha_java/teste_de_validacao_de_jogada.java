package jogo_da_velha_java;

public class teste_de_validacao_de_jogada {
    boolean validarGanhador(char[][] tabuleiro, char JogadorAtual) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == JogadorAtual && tabuleiro[i][1] == JogadorAtual && tabuleiro[i][2] == JogadorAtual) {
                return true;
            } else if (tabuleiro[0][i] == JogadorAtual && tabuleiro[1][i] == JogadorAtual && tabuleiro[2][i] == JogadorAtual) {
                return true;
            }
            if (tabuleiro[0][0] == JogadorAtual && tabuleiro[1][1] == JogadorAtual && tabuleiro[2][2] == JogadorAtual) {
                return true;
            } else if (tabuleiro[0][2] == JogadorAtual && tabuleiro[1][1] == JogadorAtual && tabuleiro[2][0] == JogadorAtual) {
                return true;
            }

        }
        return false;
    }



}




