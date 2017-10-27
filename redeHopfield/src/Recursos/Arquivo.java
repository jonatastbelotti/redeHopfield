package Recursos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class Arquivo {

  protected String caminhoArquivo;
  protected String nomeArquivo;

  public Arquivo() {
  }

  public Arquivo(String caminhoArquivo, String nomeArquivo) {
    this.caminhoArquivo = caminhoArquivo;
    this.nomeArquivo = nomeArquivo;
  }

  public boolean salvarArquivo(String conteudo) {
    File pasta;
    PrintWriter saida;

    pasta = new File(caminhoArquivo);

    if (!pasta.exists()) {
      pasta.mkdirs();
    }

    try {
      saida = new PrintWriter(new File(pasta, nomeArquivo));
      saida.print(conteudo);
      saida.close();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    }

    return true;
  }

}
