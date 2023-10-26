package com.tabeladobrasileirao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] times = {
            "América Mineiro", "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo", "Corinthians", "Coritiba",
            "Cruzeiro", "Cuiabá", "Flamengo", "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional",
            "Palmeiras", "Bragantino",
            "Santos", "São Paulo", "Vasco"
        };
        int[] pontuacoes = new int[times.length];
        int[] cartaoAmarelo = new int[times.length];
        int[] vitoria = new int[times.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Visualizar Tabela");
            System.out.println("2 - Editar Pontuação");
            System.out.println("3 - Editar Cartões Amarelos");
            System.out.println("4 - Editar Número de Vitória");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes, cartaoAmarelo, vitoria);
                    break;
                case 2:
                    editarPontuacao(times, pontuacoes, cartaoAmarelo, vitoria, scanner);
                    break;
                case 3:
                    editarCartoesAmarelo(times, pontuacoes, cartaoAmarelo, vitoria, scanner);
                    break;
                case 4:
                    editarNumeroDeVitoria(times, pontuacoes, cartaoAmarelo, vitoria, scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] cartaoAmarelo, int[] vitoria) {
        System.out.println("\nPosição | Time              | Pontuação  | Cartões Amarelos | Vitória ");
        for (int i = 0; i < times.length; i++) {
            System.out.printf("%-8d| %-18s| %-11d| %-17d| %-7d%n", (i + 1), times[i], pontuacoes[i], cartaoAmarelo[i], vitoria[i]);
        }
    }

    public static void exibirTimes(String[] times, int[] pontuacoes, int[] cartaoAmarelo, int[] vitoria) {
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " - " + times[i] + " | Pontuação: " + pontuacoes[i] + " | Cartões Amarelos: " + cartaoAmarelo[i] + " | Vitórias: " + vitoria[i]);
        }
    }

    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] cartaoAmarelo, int[] vitoria, Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição: ");
            exibirTimes(times, pontuacoes, cartaoAmarelo, vitoria);
            System.out.println("Escolha o número do time para editar a pontuação (ou 0 para voltar): ");

            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":");
                int novaPontuacao = scanner.nextInt();

                if (novaPontuacao >= 0) {
                    pontuacoes[posicao - 1] = novaPontuacao;
                    ordenarPorPontuacaoCartoesEVitorias(times, pontuacoes, cartaoAmarelo, vitoria);
                } else {
                    System.out.println("A pontuação não pode ser negativa. ");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

            scanner.nextLine();
        }
    }

    public static void editarCartoesAmarelo(String[] times, int[] pontuacoes, int[] cartaoAmarelo, int[] vitoria, Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição: ");
            exibirTimes(times, pontuacoes, cartaoAmarelo, vitoria);
            System.out.println("\nEscolha o número do time para editar os cartões amarelos (ou 0 para voltar): ");
            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite o novo número de cartões amarelos para " + times[posicao - 1] + ":");
                int novosCartoes = scanner.nextInt();
                if (novosCartoes >= 0) {
                    cartaoAmarelo[posicao - 1] = novosCartoes;
                } else {
                    System.out.println("O número de cartões amarelos não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
            scanner.nextLine();
        }
    }

    public static void editarNumeroDeVitoria(String[] times, int[] pontuacoes, int[] cartaoAmarelo, int[] vitoria, Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição: ");
            exibirTimes(times, pontuacoes, cartaoAmarelo, vitoria);
            System.out.println("\nEscolha o número do time para editar as vitórias (ou 0 para voltar): ");
            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite o novo número de vitórias para " + times[posicao - 1] + ":");
                int novaVitoria = scanner.nextInt();
                if (novaVitoria >= 0) {
                    vitoria[posicao - 1] = novaVitoria;
                } else {
                    System.out.println("O número de vitórias não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente. ");
            }
            scanner.nextLine();
        }
    }

    public static void ordenarPorPontuacaoCartoesEVitorias(String[] times, int[] pontuacoes, int[] cartaoAmarelo, int[] vitoria) {
        for (int i = 0; i < pontuacoes.length - 1; i++) {
            for (int j = i + 1; j < pontuacoes.length; j++) {
                if (pontuacoes[i] < pontuacoes[j] || (pontuacoes[i] == pontuacoes[j] && cartaoAmarelo[i] > cartaoAmarelo[j])) {
                    int tempPontuacao = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacao;

                    int tempCartoes = cartaoAmarelo[i];
                    cartaoAmarelo[i] = cartaoAmarelo[j];
                    cartaoAmarelo[j] = tempCartoes;

                    int tempVitorias = vitoria[i];
                    vitoria[i] = vitoria[j];
                    vitoria[j] = tempVitorias;

                    String tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;
                }
            }
        }
    }
}
