package Controle;

import javax.swing.JTextArea;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public abstract class Comunicador {

  private static JTextArea campoLog = null;

  public static void setCampoLog(JTextArea campoLog) {
    Comunicador.campoLog = campoLog;
  }
  
  public static void iniciarLog(String texto) {
    if (campoLog != null) {
      campoLog.setText(texto);
    }
  }
  
  public static void adicionarLog(String texto) {
    if (campoLog != null) {
      campoLog.append(String.format("\n%s", texto));
    }
  }

}
