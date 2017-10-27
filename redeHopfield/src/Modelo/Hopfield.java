package Modelo;

import Controle.Comunicador;
import Controle.Tabelas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class Hopfield {

  private final int NUM_ENTRADAS = Tabelas.NUM_LINHAS * Tabelas.NUM_COLUNAS;
  private final int NUM_NEURONIOS = NUM_ENTRADAS;

  private List<int[][]> listaImagens;
  private int entrada[];
  private int saida[];
  private double pesos[][];
  private double matrizIdentidade[][];

  public Hopfield() {
    entrada = new int[NUM_ENTRADAS];
    saida = new int[NUM_ENTRADAS];
    pesos = new double[NUM_NEURONIOS][NUM_NEURONIOS];
    matrizIdentidade = new double[NUM_NEURONIOS][NUM_NEURONIOS];

    //Selecionando o conjunto de treinamento
    listaImagens = new ArrayList<>();
    listaImagens.add(Tabelas.tab1);
    listaImagens.add(Tabelas.tab2);
    listaImagens.add(Tabelas.tab3);
    listaImagens.add(Tabelas.tab4);
  }

  public boolean treinar() {
    Comunicador.iniciarLog("Iniciando treinamento da rede Hopfield");

    //Iniciando os pesos sinapticos com 0 e criando matriz identidade
    for (int linha = 0; linha < NUM_NEURONIOS; linha++) {
      for (int coluna = 0; coluna < NUM_NEURONIOS; coluna++) {
        pesos[linha][coluna] = 0D;
        matrizIdentidade[linha][coluna] = 0D;

        if (linha == coluna) {
          matrizIdentidade[linha][coluna] = 1D;
        }
      }
    }

    //ATUALIZANDO OS PESOS SINAPTICOS
    //Parcela 1
    for (int[][] matriz : listaImagens) {
      recuperarEntradas(matriz);

      for (int linha = 0; linha < NUM_NEURONIOS; linha++) {
        for (int coluna = 0; coluna < NUM_NEURONIOS; coluna++) {
          pesos[linha][coluna] += entrada[linha] * entrada[coluna];
        }
      }
    }

    for (int linha = 0; linha < NUM_NEURONIOS; linha++) {
      for (int coluna = 0; coluna < NUM_NEURONIOS; coluna++) {
        pesos[linha][coluna] /= (double) NUM_ENTRADAS;
      }
    }

    //Parcela 2
    for (int linha = 0; linha < NUM_NEURONIOS; linha++) {
      for (int coluna = 0; coluna < NUM_NEURONIOS; coluna++) {
        pesos[linha][coluna] -= matrizIdentidade[linha][coluna] * ((double) listaImagens.size() / (double) NUM_ENTRADAS);
      }
    }

    Comunicador.adicionarLog("Fim do teinamento");
    imprimirPesos();

    return true;
  }

  public void executar() {
    int[] v_anterior;
    int[] v_atual;
    double valorParcial;

    v_anterior = new int[NUM_ENTRADAS];
    v_atual = new int[NUM_ENTRADAS];
    recuperarEntradas(Tabelas.getTabelaRuido());
    copiarVetor(entrada, v_atual);

    do {
      copiarVetor(v_atual, v_anterior);

      for (int neuronio = 0; neuronio < NUM_NEURONIOS; neuronio++) {
        valorParcial = 0D;
        
        for (int entrada = 0; entrada < NUM_ENTRADAS; entrada++) {
          valorParcial += pesos[neuronio][entrada] * (double)v_anterior[entrada];
        }
        
        v_atual[neuronio] = funcaSinal(valorParcial);
      }
    } while (!vetoresIguais(v_anterior, v_atual));
    
    copiarVetor(v_atual, saida);
    Tabelas.setTabelaRecuperadaVetor(saida);
  }

  private int funcaSinal(double valor) {
    if (valor >= 0D) {
      return 1;
    }

    return -1;
  }

  private void recuperarEntradas(int[][] matriz) {
    int i;

    entrada = new int[NUM_ENTRADAS];
    i = 0;

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        if (i < entrada.length) {
          entrada[i++] = matriz[linha][coluna];
        }
      }
    }
  }

  private void imprimirPesos() {
    String texto;

    Comunicador.adicionarLog("Pesos sinapticos:");

    for (int linha = 0; linha < NUM_NEURONIOS; linha++) {
      texto = String.format("N%d: ", linha + 1);

      for (int coluna = 0; coluna < NUM_NEURONIOS; coluna++) {
        texto += String.format("%f ", pesos[linha][coluna]);
      }

      Comunicador.adicionarLog(texto);
    }
  }

  private boolean vetoresIguais(int[] v_anterior, int[] v_atual) {
    if (v_anterior == null || v_atual == null) {
      return false;
    }

    if (v_anterior.length != v_atual.length) {
      return false;
    }

    for (int i = 0; i < v_anterior.length; i++) {
      if (v_anterior[i] != v_atual[i]) {
        return false;
      }
    }

    return true;
  }

  private void copiarVetor(int[] vetorOrigem, int[] vetorDestino) {
    for (int i = 0; i < vetorOrigem.length; i++) {
      vetorDestino[i] = vetorOrigem[i];
    }
  }

}
