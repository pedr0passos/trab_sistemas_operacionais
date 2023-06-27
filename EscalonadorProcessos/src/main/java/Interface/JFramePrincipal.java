package Interface;

import Model.*;

public class JFramePrincipal extends javax.swing.JFrame {
    
    public JFramePrincipal() {
        initComponents();
        barraProgresso.setVisible(false);
        barraProgresso1.setVisible(false);
        barraProgresso2.setVisible(false);
        barraProgresso3.setVisible(false);
        barraProgresso4.setVisible(false);
        barraProgresso5.setVisible(false);
        barraProgresso6.setVisible(false);  
        barraProgresso7.setVisible(false);        
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraProgresso6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraProgresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIniciar)
                    .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgresso2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgresso3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgresso4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgresso5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraProgresso7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(barraProgresso6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botaoIniciar)
                .addGap(36, 36, 36))
        );

        jMenu1.setText("Algoritmos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

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
        barraProgresso.setVisible(true);
        barraProgresso1.setVisible(true);
        barraProgresso2.setVisible(true);
        barraProgresso3.setVisible(true);
        barraProgresso4.setVisible(true);
        barraProgresso5.setVisible(true);
        barraProgresso6.setVisible(true);  
        barraProgresso7.setVisible(true);           
        Temporizador temp1 = new Temporizador(barraProgresso);
        Temporizador temp2 = new Temporizador(barraProgresso1);
        Temporizador temp3 = new Temporizador(barraProgresso2);
        Temporizador temp4 = new Temporizador(barraProgresso3);
        Temporizador temp5 = new Temporizador(barraProgresso4);
        Temporizador temp6 = new Temporizador(barraProgresso5);
        Temporizador temp7 = new Temporizador(barraProgresso6);        
        Temporizador temp8 = new Temporizador(barraProgresso7);
        temp1.start();
        temp2.start();
        temp3.start();
        temp4.start();
        temp5.start();
        temp6.start();
        temp7.start();        
        temp8.start();        
    }//GEN-LAST:event_botaoIniciarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JProgressBar barraProgresso1;
    private javax.swing.JProgressBar barraProgresso2;
    private javax.swing.JProgressBar barraProgresso3;
    private javax.swing.JProgressBar barraProgresso4;
    private javax.swing.JProgressBar barraProgresso5;
    private javax.swing.JProgressBar barraProgresso6;
    private javax.swing.JProgressBar barraProgresso7;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
