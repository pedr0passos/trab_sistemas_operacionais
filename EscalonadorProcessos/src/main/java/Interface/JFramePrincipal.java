package Interface;

import Model.*;
import Main.*;

public class JFramePrincipal extends javax.swing.JFrame {
    
    private int escolhaAlgoritmo;
    
    public JFramePrincipal() {
        initComponents();
        MenuAlgoritmos menuAlg = new MenuAlgoritmos();
        jMenuBar1.add(menuAlg);
        barraProgresso.setVisible(false);
        barraProgresso1.setVisible(false);
        barraProgresso2.setVisible(false);
        barraProgresso3.setVisible(false);
        barraProgresso4.setVisible(false);
        barraProgresso5.setVisible(false);
        barraProgresso6.setVisible(false);  
        barraProgresso7.setVisible(false);
        barraProgresso8.setVisible(false);
        FIFO.setState(true);
        chaveamentoCircular.setState(false);
        escFracaoJusta.setState(false);
        escGarantido.setState(false);
        escLoteria.setState(false);
        escPrioridade.setState(false);
        proxMenosTmpRest.setState(false);
        tarefaMaisCurt.setState(false);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        Algoritmos = new javax.swing.JMenu();
        FIFO = new javax.swing.JCheckBoxMenuItem();
        tarefaMaisCurt = new javax.swing.JCheckBoxMenuItem();
        proxMenosTmpRest = new javax.swing.JCheckBoxMenuItem();
        chaveamentoCircular = new javax.swing.JCheckBoxMenuItem();
        escPrioridade = new javax.swing.JCheckBoxMenuItem();
        escGarantido = new javax.swing.JCheckBoxMenuItem();
        escLoteria = new javax.swing.JCheckBoxMenuItem();
        escFracaoJusta = new javax.swing.JCheckBoxMenuItem();
        Editar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoIniciar.setText("Iniciar");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoIniciar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(barraProgresso4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresso7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(barraProgresso8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botaoIniciar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Algoritmos.setText("Algoritmos");

        FIFO.setSelected(true);
        FIFO.setText("FIFO");
        FIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIFOActionPerformed(evt);
            }
        });
        Algoritmos.add(FIFO);

        tarefaMaisCurt.setSelected(true);
        tarefaMaisCurt.setText("Tarefa Mais Curta Primeiro");
        tarefaMaisCurt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefaMaisCurtActionPerformed(evt);
            }
        });
        Algoritmos.add(tarefaMaisCurt);

        proxMenosTmpRest.setSelected(true);
        proxMenosTmpRest.setText("Próximo Menos Tempo Restante");
        proxMenosTmpRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxMenosTmpRestActionPerformed(evt);
            }
        });
        Algoritmos.add(proxMenosTmpRest);

        chaveamentoCircular.setSelected(true);
        chaveamentoCircular.setText("Chaveamento Circular");
        chaveamentoCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaveamentoCircularActionPerformed(evt);
            }
        });
        Algoritmos.add(chaveamentoCircular);

        escPrioridade.setSelected(true);
        escPrioridade.setText("Escalonamento por Prioridade");
        escPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escPrioridadeActionPerformed(evt);
            }
        });
        Algoritmos.add(escPrioridade);

        escGarantido.setSelected(true);
        escGarantido.setText("Escalonamento Garantido");
        escGarantido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escGarantidoActionPerformed(evt);
            }
        });
        Algoritmos.add(escGarantido);

        escLoteria.setSelected(true);
        escLoteria.setText("Escalonamento Loteria");
        escLoteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escLoteriaActionPerformed(evt);
            }
        });
        Algoritmos.add(escLoteria);

        escFracaoJusta.setSelected(true);
        escFracaoJusta.setText("Escalonamento Fração Justa");
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
        switch(escolhaAlgoritmo) {
            case 1:
                Main.esc.fifo();
                break;
            case 2:
                Main.esc.tarMaisCurta();
                break;
            case 3:
                Main.esc.proxMenosTmpRest();
                break;
            case 4:
                Main.esc.chaveamentoCircular();
                break;
            case 5:
                Main.esc.prioridades();
                break;
            case 6:
                Main.esc.garantido();
                break;
            case 7:
                Main.esc.loteria();
                break;
            case 8:
                Main.esc.fracaoJusta();
                break;
        }
        barraProgresso.setVisible(true);
        barraProgresso1.setVisible(true);
        barraProgresso2.setVisible(true);
        barraProgresso3.setVisible(true);
        barraProgresso4.setVisible(true);
        barraProgresso5.setVisible(true);
        barraProgresso6.setVisible(true);  
        barraProgresso7.setVisible(true);  
        barraProgresso8.setVisible(true);
        Temporizador temp1 = new Temporizador(barraProgresso);
        Temporizador temp2 = new Temporizador(barraProgresso1);
        Temporizador temp3 = new Temporizador(barraProgresso2);
        Temporizador temp4 = new Temporizador(barraProgresso3);
        Temporizador temp5 = new Temporizador(barraProgresso4);
        Temporizador temp6 = new Temporizador(barraProgresso5);
        Temporizador temp7 = new Temporizador(barraProgresso6);        
        Temporizador temp8 = new Temporizador(barraProgresso7);
        Temporizador temp9 = new Temporizador(barraProgresso8);
        temp1.start();
        temp2.start();
        temp3.start();
        temp4.start();
        temp5.start();
        temp6.start();
        temp7.start();        
        temp8.start();  
        temp9.start();
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void FIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIFOActionPerformed
        escolhaAlgoritmo=1;
    }//GEN-LAST:event_FIFOActionPerformed

    private void tarefaMaisCurtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefaMaisCurtActionPerformed
        if(FIFO.isSelected())
            FIFO.setState(false);
        escolhaAlgoritmo=2;
    }//GEN-LAST:event_tarefaMaisCurtActionPerformed

    private void proxMenosTmpRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxMenosTmpRestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proxMenosTmpRestActionPerformed

    private void chaveamentoCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaveamentoCircularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chaveamentoCircularActionPerformed

    private void escPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escPrioridadeActionPerformed

    private void escGarantidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escGarantidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escGarantidoActionPerformed

    private void escLoteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escLoteriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escLoteriaActionPerformed

    private void escFracaoJustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escFracaoJustaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escFracaoJustaActionPerformed

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
    private javax.swing.JCheckBoxMenuItem FIFO;
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JProgressBar barraProgresso1;
    private javax.swing.JProgressBar barraProgresso2;
    private javax.swing.JProgressBar barraProgresso3;
    private javax.swing.JProgressBar barraProgresso4;
    private javax.swing.JProgressBar barraProgresso5;
    private javax.swing.JProgressBar barraProgresso6;
    private javax.swing.JProgressBar barraProgresso7;
    private javax.swing.JProgressBar barraProgresso8;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JCheckBoxMenuItem chaveamentoCircular;
    private javax.swing.JCheckBoxMenuItem escFracaoJusta;
    private javax.swing.JCheckBoxMenuItem escGarantido;
    private javax.swing.JCheckBoxMenuItem escLoteria;
    private javax.swing.JCheckBoxMenuItem escPrioridade;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBoxMenuItem proxMenosTmpRest;
    private javax.swing.JCheckBoxMenuItem tarefaMaisCurt;
    // End of variables declaration//GEN-END:variables
}
