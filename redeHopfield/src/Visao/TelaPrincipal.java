package Visao;

import Controle.Comunicador;
import Controle.Tabelas;
import Modelo.Hopfield;
import Recursos.Arquivo;
import java.awt.Color;
import java.awt.Component;
import java.awt.FileDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class TelaPrincipal extends javax.swing.JFrame {

  private FileDialog janelaSalvar;
  private Hopfield redeHopfield;

  /**
   * Creates new form Teste
   */
  public TelaPrincipal() {
    initComponents();

    setLocationRelativeTo(null);

    configurarTabelas();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jScrTbOriginal = new javax.swing.JScrollPane();
    jTbOriginal = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jScrTbRuido = new javax.swing.JScrollPane();
    jTbRuido = new javax.swing.JTable();
    jBtnRuido = new javax.swing.JButton();
    jScrTbFinal = new javax.swing.JScrollPane();
    jTbFinal = new javax.swing.JTable();
    jBtnRecupperar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTxtLog = new javax.swing.JTextArea();
    jButton5 = new javax.swing.JButton();
    jBtnSalvarTreinamento = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Rede recorrente de Hopfield - Jônatas Trabuco Belotti");
    setResizable(false);

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 255));
    jLabel1.setText(" Execução");

    jLabel2.setText("Imagem transmitida");

    jLabel3.setText("Imagem recebida");

    jLabel4.setText("Imagem recuperada");

    jTbOriginal.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Coluna 1", "Coluna 2", "Coluna 3", "Coluna 4", "Coluna 5"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTbOriginal.setMaximumSize(new java.awt.Dimension(80, 144));
    jTbOriginal.setMinimumSize(new java.awt.Dimension(80, 144));
    jTbOriginal.setPreferredSize(new java.awt.Dimension(144, 144));
    jTbOriginal.setRequestFocusEnabled(false);
    jTbOriginal.getTableHeader().setReorderingAllowed(false);
    jScrTbOriginal.setViewportView(jTbOriginal);
    if (jTbOriginal.getColumnModel().getColumnCount() > 0) {
      jTbOriginal.getColumnModel().getColumn(0).setResizable(false);
      jTbOriginal.getColumnModel().getColumn(1).setResizable(false);
      jTbOriginal.getColumnModel().getColumn(2).setResizable(false);
      jTbOriginal.getColumnModel().getColumn(3).setResizable(false);
      jTbOriginal.getColumnModel().getColumn(4).setResizable(false);
    }

    jButton1.setText("1");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("2");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setText("3");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setText("4");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jTbRuido.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Coluna 1", "Coluna 2", "Coluna 3", "Coluna 4", "Coluna 5"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTbRuido.setMaximumSize(new java.awt.Dimension(80, 144));
    jTbRuido.setMinimumSize(new java.awt.Dimension(80, 144));
    jTbRuido.setPreferredSize(new java.awt.Dimension(80, 144));
    jTbRuido.setRequestFocusEnabled(false);
    jTbRuido.getTableHeader().setReorderingAllowed(false);
    jScrTbRuido.setViewportView(jTbRuido);
    if (jTbRuido.getColumnModel().getColumnCount() > 0) {
      jTbRuido.getColumnModel().getColumn(0).setResizable(false);
      jTbRuido.getColumnModel().getColumn(1).setResizable(false);
      jTbRuido.getColumnModel().getColumn(2).setResizable(false);
      jTbRuido.getColumnModel().getColumn(3).setResizable(false);
      jTbRuido.getColumnModel().getColumn(4).setResizable(false);
    }

    jBtnRuido.setText("Ruido");
    jBtnRuido.setEnabled(false);
    jBtnRuido.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnRuidoActionPerformed(evt);
      }
    });

    jTbFinal.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Coluna 1", "Coluna 2", "Coluna 3", "Coluna 4", "Coluna 5"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTbFinal.setMaximumSize(new java.awt.Dimension(80, 144));
    jTbFinal.setMinimumSize(new java.awt.Dimension(80, 144));
    jTbFinal.setPreferredSize(new java.awt.Dimension(80, 144));
    jTbFinal.setRequestFocusEnabled(false);
    jTbFinal.getTableHeader().setReorderingAllowed(false);
    jScrTbFinal.setViewportView(jTbFinal);
    if (jTbFinal.getColumnModel().getColumnCount() > 0) {
      jTbFinal.getColumnModel().getColumn(0).setResizable(false);
      jTbFinal.getColumnModel().getColumn(1).setResizable(false);
      jTbFinal.getColumnModel().getColumn(2).setResizable(false);
      jTbFinal.getColumnModel().getColumn(3).setResizable(false);
      jTbFinal.getColumnModel().getColumn(4).setResizable(false);
    }

    jBtnRecupperar.setText("Recuperar");
    jBtnRecupperar.setEnabled(false);
    jBtnRecupperar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnRecupperarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jButton3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton4))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jButton1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton2))
          .addComponent(jScrTbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(119, 119, 119)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jScrTbRuido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jBtnRuido, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
        .addGap(128, 128, 128)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel4)
          .addComponent(jBtnRecupperar)
          .addComponent(jScrTbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(151, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrTbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jButton1)
                  .addComponent(jButton2)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrTbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnRecupperar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrTbRuido, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jBtnRuido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton3)
          .addComponent(jButton4))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 0, 255));
    jLabel5.setText(" Treinamento");

    jTxtLog.setEditable(false);
    jTxtLog.setColumns(20);
    jTxtLog.setRows(5);
    jScrollPane1.setViewportView(jTxtLog);

    jButton5.setText("Treinar");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jBtnSalvarTreinamento.setText("Salvar");
    jBtnSalvarTreinamento.setEnabled(false);
    jBtnSalvarTreinamento.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnSalvarTreinamentoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jBtnSalvarTreinamento)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton5)
          .addComponent(jBtnSalvarTreinamento))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    atualizarTabelaOriginal(Tabelas.tab1);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    atualizarTabelaOriginal(Tabelas.tab2);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    atualizarTabelaOriginal(Tabelas.tab3);
  }//GEN-LAST:event_jButton3ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    atualizarTabelaOriginal(Tabelas.tab4);
  }//GEN-LAST:event_jButton4ActionPerformed

  private void jBtnRuidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRuidoActionPerformed
    // TODO add your handling code here:
    gerarRuido();
  }//GEN-LAST:event_jBtnRuidoActionPerformed

  private void jBtnRecupperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecupperarActionPerformed
    // TODO add your handling code here:
    recuperarImagem();
  }//GEN-LAST:event_jBtnRecupperarActionPerformed

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    // TODO add your handling code here:
    treinarRede();
  }//GEN-LAST:event_jButton5ActionPerformed

  private void jBtnSalvarTreinamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarTreinamentoActionPerformed
    // TODO add your handling code here:
    salvarTreinamento();
  }//GEN-LAST:event_jBtnSalvarTreinamentoActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnRecupperar;
  private javax.swing.JButton jBtnRuido;
  private javax.swing.JButton jBtnSalvarTreinamento;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrTbFinal;
  private javax.swing.JScrollPane jScrTbOriginal;
  private javax.swing.JScrollPane jScrTbRuido;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTbFinal;
  private javax.swing.JTable jTbOriginal;
  private javax.swing.JTable jTbRuido;
  private javax.swing.JTextArea jTxtLog;
  // End of variables declaration//GEN-END:variables

  private void configurarTabelas() {
    configurarTabela(jScrTbOriginal, jTbOriginal);
    jTbOriginal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
      public Component getTableCellRendererComponent(JTable table, Object value,
              boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
        if (Tabelas.getTabelaOriginal()[row][column] == 1) {
          setBackground(Color.BLUE);
        } else {
          setBackground(Color.WHITE);
        }
        return this;
      }
    });

    configurarTabela(jScrTbRuido, jTbRuido);
    jTbRuido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
      public Component getTableCellRendererComponent(JTable table, Object value,
              boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
        if (Tabelas.getTabelaRuido()[row][column] == 1) {
          setBackground(Color.BLUE);
        } else {
          setBackground(Color.WHITE);
        }
        return this;
      }
    });

    configurarTabela(jScrTbFinal, jTbFinal);
    jTbFinal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
      public Component getTableCellRendererComponent(JTable table, Object value,
              boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
        if (Tabelas.getTabelaFinal()[row][column] == 1) {
          setBackground(Color.BLUE);
        } else {
          setBackground(Color.WHITE);
        }
        return this;
      }
    });
  }

  private void configurarTabela(JScrollPane scroll, JTable tabela) {
    scroll.setColumnHeader(null);

    tabela.getColumnModel().getColumn(0).setPreferredWidth(16);
    tabela.getColumnModel().getColumn(0).setMaxWidth(16);
    tabela.getColumnModel().getColumn(1).setPreferredWidth(16);
    tabela.getColumnModel().getColumn(1).setMaxWidth(16);
    tabela.getColumnModel().getColumn(2).setPreferredWidth(16);
    tabela.getColumnModel().getColumn(2).setMaxWidth(16);
    tabela.getColumnModel().getColumn(3).setPreferredWidth(16);
    tabela.getColumnModel().getColumn(3).setMaxWidth(16);
    tabela.getColumnModel().getColumn(4).setPreferredWidth(16);
    tabela.getColumnModel().getColumn(4).setMaxWidth(16);

    tabela.setCellSelectionEnabled(false);
  }

  private void atualizarTabelaOriginal(int[][] tabela) {
    Tabelas.setTabelaOriginal(tabela);
    atualizarTabela(jTbOriginal);

    jBtnRuido.setEnabled(true);
    Tabelas.limparTabelaRuido();
    atualizarTabela(jTbRuido);

    jBtnRecupperar.setEnabled(false);
    Tabelas.limparTabelaFinal();
    atualizarTabela(jTbFinal);
  }

  private void atualizarTabela(JTable tabela) {
    tabela.setColumnSelectionInterval(0, 0);
    tabela.setColumnSelectionInterval(0, 4);
  }

  private void gerarRuido() {
    Tabelas.gerarRuido();
    atualizarTabela(jTbRuido);

    jBtnRecupperar.setEnabled(true);
    Tabelas.limparTabelaFinal();
    atualizarTabela(jTbFinal);
  }

  private void treinarRede() {
    jBtnSalvarTreinamento.setEnabled(false);
    redeHopfield = new Hopfield();
    Comunicador.setCampoLog(jTxtLog);

    if (redeHopfield.treinar()) {
      jBtnSalvarTreinamento.setEnabled(true);
      JOptionPane.showMessageDialog(null, "Rede treinada com sucesso.", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, "Erro ao treinar rede.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void recuperarImagem() {
    if (redeHopfield == null) {
      return;
    }

    redeHopfield.executar();
    atualizarTabela(jTbFinal);
  }

  private void salvarTreinamento() {
    String nome;
    String pasta;
    Arquivo arquivoSalvar;

    if (this.janelaSalvar == null) {
      this.janelaSalvar = new FileDialog(this, "Salvar arquivo", FileDialog.SAVE);
    }

    this.janelaSalvar.setVisible(true);

    pasta = this.janelaSalvar.getDirectory();
    nome = this.janelaSalvar.getFile();

    if (pasta != null && nome != null) {
      if (nome.indexOf(".") == -1) {
        nome += ".txt";
      }
    }

    arquivoSalvar = new Arquivo(pasta, nome);

    if (arquivoSalvar.salvarArquivo(jTxtLog.getText().replaceAll("\r", "\n"))) {
      JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
  }

}
