package Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public abstract class Tabelas {

  public static final int NUM_LINHAS = 9;
  public static final int NUM_COLUNAS = 5;
  public static final int PORCENTAGEM_RUIDO = 20;
  public static final int[][] tab1 = {
    {-1, -1, 1, 1, -1},
    {-1, 1, 1, 1, -1},
    {-1, -1, 1, 1, -1},
    {-1, -1, 1, 1, -1},
    {-1, -1, 1, 1, -1},
    {-1, -1, 1, 1, -1},
    {-1, -1, 1, 1, -1},
    {-1, -1, 1, 1, -1},
    {-1, -1, 1, 1, -1}};
  public static final int[][] tab2 = {
    {1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1},
    {-1, -1, -1, 1, 1},
    {-1, -1, -1, 1, 1},
    {1, 1, 1, 1, 1},
    {1, 1, -1, -1, -1},
    {1, 1, -1, -1, -1},
    {1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1}
  };
  public static final int[][] tab3 = {
    {1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1},
    {-1, -1, -1, 1, 1},
    {-1, -1, -1, 1, 1},
    {1, 1, 1, 1, 1},
    {-1, -1, -1, 1, 1},
    {-1, -1, -1, 1, 1},
    {1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1}
  };
  public static final int[][] tab4 = {
    {1, 1, -1, 1, 1},
    {1, 1, -1, 1, 1},
    {1, 1, -1, 1, 1},
    {1, 1, 1, 1, 1},
    {1, 1, 1, 1, 1},
    {-1, -1, -1, 1, 1},
    {-1, -1, -1, 1, 1},
    {-1, -1, -1, 1, 1},
    {-1, -1, -1, 1, 1}
  };

  private static int[][] tabelaOriginal;
  private static int[][] tabelaRuido;
  private static int[][] tabelaFinal;

  public static int[][] getTabelaOriginal() {
    if (tabelaOriginal == null) {
      return new int[NUM_LINHAS][NUM_COLUNAS];
    }

    return tabelaOriginal;
  }

  public static void setTabelaOriginal(int[][] tabela) {
    tabelaOriginal = new int[NUM_LINHAS][NUM_COLUNAS];
    copiarTabela(tabela, tabelaOriginal);
  }

  public static int[][] getTabelaRuido() {
    if (tabelaRuido == null) {
      return new int[NUM_LINHAS][NUM_COLUNAS];
    }

    return tabelaRuido;
  }

  public static void setTabelaRuido(int[][] tabela) {
    tabelaRuido = new int[NUM_LINHAS][NUM_COLUNAS];
    copiarTabela(tabela, tabelaRuido);
  }

  public static int[][] getTabelaFinal() {
    if (tabelaFinal == null) {
      return new int[NUM_LINHAS][NUM_COLUNAS];
    }

    return tabelaFinal;
  }

  public static void setTabelaFinal(int[][] tabela) {
    tabelaFinal = new int[NUM_LINHAS][NUM_COLUNAS];
    copiarTabela(tabela, tabelaFinal);
  }

  private static void copiarTabela(int[][] tabelaOrigem, int[][] tabelaDestino) {
    for (int linha = 0; linha < NUM_LINHAS; linha++) {
      for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
        tabelaDestino[linha][coluna] = tabelaOrigem[linha][coluna];
      }
    }
  }

  public static void gerarRuido() {
    List<Integer> listaAlterados;
    Random random;
    int numItemRuido;
    int item;

    listaAlterados = new ArrayList<>();
    random = new Random();
    numItemRuido = (int) Math.round(((((NUM_LINHAS * NUM_COLUNAS) / 100D)) * PORCENTAGEM_RUIDO) + 0.5);

    setTabelaRuido(getTabelaOriginal());

    for (int i = 0; i < numItemRuido; i++) {
      do {
        item = random.nextInt(NUM_LINHAS * NUM_COLUNAS) + 1;
      } while (listaAlterados.contains(item));
      
      listaAlterados.add(new Integer(item));
    }

    for (Integer i : listaAlterados) {
      item = 0;

      for (int linha = 0; linha < NUM_LINHAS; linha++) {
        for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
          item++;

          if (item == i) {
            if (tabelaRuido[linha][coluna] == 1) {
              tabelaRuido[linha][coluna] = -1;
            } else {
              tabelaRuido[linha][coluna] = 1;
            }

            linha = NUM_LINHAS + 1;
            coluna = NUM_COLUNAS + 1;
          }
        }
      }
    }
  }

  public static void limparTabelaRuido() {
    tabelaRuido = null;
  }

  public static void limparTabelaFinal() {
    tabelaFinal = null;
  }

  public static void setTabelaRecuperadaVetor(int[] saida) {
    int[][] tabela;
    int i;
    
    tabela = new int[NUM_LINHAS][NUM_COLUNAS];
    i = 0;
    
    for (int linha = 0; linha < NUM_LINHAS; linha++) {
      for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
        tabela[linha][coluna] = saida[i++];
      }
    }
    
    setTabelaFinal(tabela);
  }
}
