import java.util.Scanner;

public class JogoDaVelha {
    private static final char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean jogoAtivo = true;
            
            while (jogoAtivo) {
                imprimirTabuleiro();
                jogadorFazJogada(scanner);
                jogoAtivo = verificarEstadoDoJogo();
                trocarJogador();
            }
        }
    }

    private static void imprimirTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private static void jogadorFazJogada(Scanner scanner) {
        int linha, coluna;
        while (true) {
            System.out.println("Jogador " + jogadorAtual + ", faça sua jogada (linha e coluna): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                break;
            } else {
                System.out.println("Esta jogada não é válida. Tente novamente.");
            }
        }
    }

    private static boolean verificarEstadoDoJogo() {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                imprimirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                return false;
            }
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                imprimirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                return false;
            }
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            imprimirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + " venceu!");
            return false;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            imprimirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + " venceu!");
            return false;
        }

        // Verificar empate
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    empate = false;
                    break;
                }
            }
        }
        if (empate) {
            imprimirTabuleiro();
            System.out.println("O jogo empatou!");
            return false;
        }

        return true;
    }

    private static void trocarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }
}
