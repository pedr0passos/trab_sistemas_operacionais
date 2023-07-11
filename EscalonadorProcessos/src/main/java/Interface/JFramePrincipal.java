package Interface;

import Main.*;
import Model.*;
import java.util.ArrayList;
import javax.swing.JProgressBar;

public class JFramePrincipal extends javax.swing.JFrame {
    
    private int escolhaAlgoritmo;
    public static ArrayList<JProgressBar> barrasProcessos;
    
    public JFramePrincipal() {
        initComponents();
        barrasProcessos = new ArrayList(12);        
        escolhaAlgoritmo=1;
        nomeAlgoritmo.setText("Primeiro Chegar, Primeiro Servido");        
        barrasProcessos.add(barraProgresso);
        barrasProcessos.add(barraProgresso1);
        barrasProcessos.add(barraProgresso2);      
        barrasProcessos.add(barraProgresso3);
        barrasProcessos.add(barraProgresso4);
        barrasProcessos.add(barraProgresso5);   
        barrasProcessos.add(barraProgresso6);
        barrasProcessos.add(barraProgresso7);
        barrasProcessos.add(barraProgresso8);   
        barrasProcessos.add(barraProgresso9);
        barrasProcessos.add(barraProgresso10);
        barrasProcessos.add(barraProgresso11);   
        atualizaBarras();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraProgresso = new javax.swing.JProgressBar();
        botaoIniciar = new javax.swing.JButton();
        barraProgresso1 = new javax.swing.JProgressBar();
        barraProgresso2 = new javax.swing.JProgressBar();
        barraProgresso3 = new javax.swing.JProgressBar();
        barraProgresso4 = new javax.swing.JProgressBar();
        barraProgresso5 = new javax.swing.JProgressBar();
        barraProgresso6 = new javax.swing.JProgressBar();
        barraProgresso7 = new javax.swing.JProgressBar();
        barraProgresso8 = new javax.swing.JProgressBar();
        barraProgresso9 = new javax.swing.JProgressBar();
        barraProgresso10 = new javax.swing.JProgressBar();
        barraProgresso11 = new javax.swing.JProgressBar();
        nomeAlgoritmo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        botaoParar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Algoritmos = new javax.swing.JMenu();
        FIFO = new javax.swing.JMenuItem();
        tarefaMaisCurtaPrimeiro = new javax.swing.JMenuItem();
        proxMenosTempo = new javax.swing.JMenuItem();
        escChaveamentoCircular = new javax.swing.JMenuItem();
        escPrioridades = new javax.swing.JMenuItem();
        escGarantido = new javax.swing.JMenuItem();
        escLoteria = new javax.swing.JMenuItem();
        escFracaoJusta = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoIniciar.setText("Start");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        nomeAlgoritmo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeAlgoritmo.setText("Algoritmo");

        info.setColumns(14);
        info.setRows(5);
        info.setTabSize(1);
        jScrollPane2.setViewportView(info);

        botaoParar.setText("Stop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoIniciar))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoParar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(barraProgresso4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(barraProgresso8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeAlgoritmo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nomeAlgoritmo)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(barraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso5, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso4, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso3, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso7, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso6, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso8, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso9, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso10, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(barraProgresso11, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIniciar)
                    .addComponent(botaoParar))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        Algoritmos.setText("Algoritmos");

        FIFO.setText("FIFO");
        FIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIFOActionPerformed(evt);
            }
        });
        Algoritmos.add(FIFO);

        tarefaMaisCurtaPrimeiro.setText("Mais Curta Primeiro");
        tarefaMaisCurtaPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefaMaisCurtaPrimeiroActionPerformed(evt);
            }
        });
        Algoritmos.add(tarefaMaisCurtaPrimeiro);

        proxMenosTempo.setText("Próximo Menos Tempo Restante");
        proxMenosTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxMenosTempoActionPerformed(evt);
            }
        });
        Algoritmos.add(proxMenosTempo);

        escChaveamentoCircular.setText("Chaveamento Circular");
        escChaveamentoCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escChaveamentoCircularActionPerformed(evt);
            }
        });
        Algoritmos.add(escChaveamentoCircular);

        escPrioridades.setText("Escalonamento por Prioridade");
        escPrioridades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escPrioridadesActionPerformed(evt);
            }
        });
        Algoritmos.add(escPrioridades);

        escGarantido.setText("Escalonamento Garantido");
        escGarantido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escGarantidoActionPerformed(evt);
            }
        });
        Algoritmos.add(escGarantido);

        escLoteria.setText("Escalonamento por Loteria");
        escLoteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escLoteriaActionPerformed(evt);
            }
        });
        Algoritmos.add(escLoteria);

        escFracaoJusta.setText("Escalonamento por Fração Justa");
        escFracaoJusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escFracaoJustaActionPerformed(evt);
            }
        });
        Algoritmos.add(escFracaoJusta);

        jMenuBar1.add(Algoritmos);

        Editar.setText("Editar");
        jMenuBar1.add(Editar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed
        switch (escolhaAlgoritmo) {
            case 1:
                Main.escalonador.fifo();
                break;
        }
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void FIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIFOActionPerformed
        escolhaAlgoritmo=1;
        nomeAlgoritmo.setText("Primeiro Chegar, Primeiro Servido");
    }//GEN-LAST:event_FIFOActionPerformed

    private void tarefaMaisCurtaPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefaMaisCurtaPrimeiroActionPerformed
        escolhaAlgoritmo=2;
        nomeAlgoritmo.setText("Tarefa Mais Curta Primeiro");
    }//GEN-LAST:event_tarefaMaisCurtaPrimeiroActionPerformed

    private void proxMenosTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxMenosTempoActionPerformed
        escolhaAlgoritmo=3;
        nomeAlgoritmo.setText("Próximo Menos Tempo Restante");
    }//GEN-LAST:event_proxMenosTempoActionPerformed

    private void escChaveamentoCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escChaveamentoCircularActionPerformed
        escolhaAlgoritmo=4;
        nomeAlgoritmo.setText("Chaveamento Circular");
    }//GEN-LAST:event_escChaveamentoCircularActionPerformed

    private void escPrioridadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escPrioridadesActionPerformed
        escolhaAlgoritmo=5;
        nomeAlgoritmo.setText("Escalonamento por Prioridades");
    }//GEN-LAST:event_escPrioridadesActionPerformed

    private void escGarantidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escGarantidoActionPerformed
        escolhaAlgoritmo=6;
        nomeAlgoritmo.setText("Escalonamento Garantido");
    }//GEN-LAST:event_escGarantidoActionPerformed

    private void escLoteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escLoteriaActionPerformed
        escolhaAlgoritmo=7;
        nomeAlgoritmo.setText("Escalonamento por Loteria");
    }//GEN-LAST:event_escLoteriaActionPerformed

    private void escFracaoJustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escFracaoJustaActionPerformed
        escolhaAlgoritmo=8;
        nomeAlgoritmo.setText("Escalonamento por Fração Justa");
    }//GEN-LAST:event_escFracaoJustaActionPerformed

    public static void atualizaBarras () {
        for (int i=0; i < Main.memoria.processos.size(); ++i) {
            barrasProcessos.get(i).setOrientation(JProgressBar.VERTICAL);
            barrasProcessos.get(i).setMaximum(Main.memoria.getTamMaxProc());
            barrasProcessos.get(i).setValue(Main.memoria.processos.get(i).getTempoExecucao());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Algoritmos;
    private javax.swing.JMenu Editar;
    private javax.swing.JMenuItem FIFO;
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JProgressBar barraProgresso1;
    private javax.swing.JProgressBar barraProgresso10;
    private javax.swing.JProgressBar barraProgresso11;
    private javax.swing.JProgressBar barraProgresso2;
    private javax.swing.JProgressBar barraProgresso3;
    private javax.swing.JProgressBar barraProgresso4;
    private javax.swing.JProgressBar barraProgresso5;
    private javax.swing.JProgressBar barraProgresso6;
    private javax.swing.JProgressBar barraProgresso7;
    private javax.swing.JProgressBar barraProgresso8;
    private javax.swing.JProgressBar barraProgresso9;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton botaoParar;
    private javax.swing.JMenuItem escChaveamentoCircular;
    private javax.swing.JMenuItem escFracaoJusta;
    private javax.swing.JMenuItem escGarantido;
    private javax.swing.JMenuItem escLoteria;
    private javax.swing.JMenuItem escPrioridades;
    private javax.swing.JTextArea info;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomeAlgoritmo;
    private javax.swing.JMenuItem proxMenosTempo;
    private javax.swing.JMenuItem tarefaMaisCurtaPrimeiro;
    // End of variables declaration//GEN-END:variables
}
