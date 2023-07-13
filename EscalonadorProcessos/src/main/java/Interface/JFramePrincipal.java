package Interface;

import Main.*;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import tempo.CalculadorTempo;

public class JFramePrincipal extends javax.swing.JFrame {
    
    public static int escolhaAlgoritmo;
    public static boolean threadFlag;
    public static Thread threadJFrame;
    public static Thread calculadorTempoThread;
    public static ArrayList<JProgressBar> barrasProcessos;
    public static ArrayList<JLabel> infoPrioridades;
    public static ArrayList<JLabel> infoTamProcessos;
    public static int maximoUsuarios = 4;
    public static ReentrantLock mutex = new ReentrantLock();
    
    public JFramePrincipal() {
        initComponents();
        escolhaAlgoritmo=1;
        threadFlag=false;
        botaoPause.setEnabled(false);
        barrasProcessos = new ArrayList(Main.memoria.getTamMemoria());  
        infoPrioridades = new ArrayList(Main.memoria.getTamMemoria());
        infoTamProcessos= new ArrayList(Main.memoria.getTamMemoria());
        nomeAlgoritmo.setText("Primeiro Chegar, Primeiro Servido");  
        labelResultadoExe.setText("0");
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
        barrasProcessos.add(barraProgresso12);
        barrasProcessos.add(barraProgresso13);
        barrasProcessos.add(barraProgresso14);   
        infoPrioridades.add(info16);
        infoPrioridades.add(info17);
        infoPrioridades.add(info18);
        infoPrioridades.add(info19);
        infoPrioridades.add(info20);
        infoPrioridades.add(info21);
        infoPrioridades.add(info22);
        infoPrioridades.add(info23);
        infoPrioridades.add(info24);
        infoPrioridades.add(info25);
        infoPrioridades.add(info26);
        infoPrioridades.add(info27);
        infoPrioridades.add(info28);
        infoPrioridades.add(info29);
        infoPrioridades.add(info30);
        infoTamProcessos.add(info1);
        infoTamProcessos.add(info2);
        infoTamProcessos.add(info3);
        infoTamProcessos.add(info4); 
        infoTamProcessos.add(info5);
        infoTamProcessos.add(info6);
        infoTamProcessos.add(info7);
        infoTamProcessos.add(info8);    
        infoTamProcessos.add(info9);
        infoTamProcessos.add(info10);
        infoTamProcessos.add(info11);
        infoTamProcessos.add(info12); 
        infoTamProcessos.add(info13);
        infoTamProcessos.add(info14);
        infoTamProcessos.add(info15);      
        zeraBarras();
        zeraPrioridades();
        zeraTamProcessos();
        
        calculadorTempoThread = new Thread(){
            @Override
            public void run () {
               while(true)
               {
                   try {
                       Thread.sleep(500);
                   } catch (Exception e) {}
                   
                   mutex.lock();
                   atualizarLabelVazaoTempo();
                   mutex.unlock();
               }
            }
        };
        calculadorTempoThread.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        barraProgresso = new javax.swing.JProgressBar();
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
        barraProgresso12 = new javax.swing.JProgressBar();
        barraProgresso13 = new javax.swing.JProgressBar();
        barraProgresso14 = new javax.swing.JProgressBar();
        panelTitulo = new javax.swing.JPanel();
        nomeAlgoritmo = new javax.swing.JLabel();
        panelControle = new javax.swing.JPanel();
        botaoStart = new javax.swing.JButton();
        botaoPause = new javax.swing.JButton();
        botaoStop = new javax.swing.JButton();
        diminuiVelocidade = new javax.swing.JButton();
        labelExecutados = new javax.swing.JLabel();
        labelResultadoExe = new javax.swing.JLabel();
        aumentaVelocidade = new javax.swing.JButton();
        labelTempoVazao = new javax.swing.JLabel();
        labelResulVazao = new javax.swing.JLabel();
        informacoes = new javax.swing.JPanel();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        info3 = new javax.swing.JLabel();
        info4 = new javax.swing.JLabel();
        info5 = new javax.swing.JLabel();
        info6 = new javax.swing.JLabel();
        info7 = new javax.swing.JLabel();
        info8 = new javax.swing.JLabel();
        info9 = new javax.swing.JLabel();
        info10 = new javax.swing.JLabel();
        info11 = new javax.swing.JLabel();
        info12 = new javax.swing.JLabel();
        info13 = new javax.swing.JLabel();
        info14 = new javax.swing.JLabel();
        info15 = new javax.swing.JLabel();
        info16 = new javax.swing.JLabel();
        info17 = new javax.swing.JLabel();
        info18 = new javax.swing.JLabel();
        info19 = new javax.swing.JLabel();
        info20 = new javax.swing.JLabel();
        info21 = new javax.swing.JLabel();
        info22 = new javax.swing.JLabel();
        info23 = new javax.swing.JLabel();
        info24 = new javax.swing.JLabel();
        info25 = new javax.swing.JLabel();
        info26 = new javax.swing.JLabel();
        info27 = new javax.swing.JLabel();
        info28 = new javax.swing.JLabel();
        info29 = new javax.swing.JLabel();
        info30 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        Algoritmos = new javax.swing.JMenu();
        FIFO = new javax.swing.JMenuItem();
        tarefaMaisCurtaPrimeiro = new javax.swing.JMenuItem();
        proxMenosTempo = new javax.swing.JMenuItem();
        escChaveamentoCircular = new javax.swing.JMenuItem();
        escPrioridades = new javax.swing.JMenuItem();
        escGarantido = new javax.swing.JMenuItem();
        escLoteria = new javax.swing.JMenuItem();
        escFracaoJusta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escalonador de Processos");

        barraProgresso.setBorder(null);
        barraProgresso.setBorderPainted(false);

        barraProgresso1.setBorder(null);
        barraProgresso1.setBorderPainted(false);

        barraProgresso2.setBorder(null);
        barraProgresso2.setBorderPainted(false);

        barraProgresso3.setToolTipText("");
        barraProgresso3.setBorder(null);
        barraProgresso3.setBorderPainted(false);

        barraProgresso4.setBorder(null);
        barraProgresso4.setBorderPainted(false);

        barraProgresso5.setBorder(null);
        barraProgresso5.setBorderPainted(false);

        barraProgresso6.setBorder(null);
        barraProgresso6.setBorderPainted(false);

        barraProgresso7.setBorder(null);
        barraProgresso7.setBorderPainted(false);

        barraProgresso8.setBorder(null);
        barraProgresso8.setBorderPainted(false);

        barraProgresso9.setBorder(null);
        barraProgresso9.setBorderPainted(false);

        barraProgresso10.setBorder(null);
        barraProgresso10.setBorderPainted(false);

        barraProgresso11.setBorder(null);
        barraProgresso11.setBorderPainted(false);

        barraProgresso12.setBorder(null);
        barraProgresso12.setBorderPainted(false);

        barraProgresso13.setBorder(null);
        barraProgresso13.setBorderPainted(false);

        barraProgresso14.setBorder(null);
        barraProgresso14.setBorderPainted(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(barraProgresso4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(barraProgresso8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(barraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso11, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(barraProgresso12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraProgresso14, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        nomeAlgoritmo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeAlgoritmo.setText("Algoritmo");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeAlgoritmo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nomeAlgoritmo)
                .addContainerGap())
        );

        botaoStart.setText("Start");
        botaoStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStartActionPerformed(evt);
            }
        });

        botaoPause.setText("Pause");
        botaoPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPauseActionPerformed(evt);
            }
        });

        botaoStop.setText("Stop");
        botaoStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStopActionPerformed(evt);
            }
        });

        diminuiVelocidade.setText("-");
        diminuiVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuiVelocidadeActionPerformed(evt);
            }
        });

        labelExecutados.setText("Executados:");

        labelResultadoExe.setText("xxx");

        aumentaVelocidade.setText("+");
        aumentaVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaVelocidadeActionPerformed(evt);
            }
        });

        labelTempoVazao.setText("Temp/Vazão:");

        labelResulVazao.setText("xxx");

        javax.swing.GroupLayout panelControleLayout = new javax.swing.GroupLayout(panelControle);
        panelControle.setLayout(panelControleLayout);
        panelControleLayout.setHorizontalGroup(
            panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoPause)
                .addGap(18, 18, 18)
                .addComponent(botaoStop)
                .addGap(87, 87, 87)
                .addComponent(aumentaVelocidade)
                .addGap(18, 18, 18)
                .addComponent(diminuiVelocidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControleLayout.createSequentialGroup()
                        .addComponent(labelExecutados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelResultadoExe))
                    .addGroup(panelControleLayout.createSequentialGroup()
                        .addComponent(labelTempoVazao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelResulVazao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelControleLayout.setVerticalGroup(
            panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControleLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelControleLayout.createSequentialGroup()
                        .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTempoVazao)
                            .addComponent(labelResulVazao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelExecutados)
                            .addComponent(labelResultadoExe)))
                    .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoStart)
                        .addGroup(panelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoPause)
                            .addComponent(botaoStop)
                            .addComponent(aumentaVelocidade)
                            .addComponent(diminuiVelocidade))))
                .addGap(24, 24, 24))
        );

        info1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info1.setText("x");

        info2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info2.setText("x");

        info3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info3.setText("x");

        info4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info4.setText("x");

        info5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info5.setText("x");

        info6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info6.setText("x");

        info7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info7.setText("x");

        info8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info8.setText("x");

        info9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info9.setText("x");

        info10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info10.setText("x");

        info11.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info11.setText("x");

        info12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info12.setText("x");

        info13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info13.setText("x");

        info14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info14.setText("x");

        info15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info15.setText("x");

        info16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info16.setText("x");

        info17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info17.setText("x");

        info18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info18.setText("x");

        info19.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info19.setText("x");

        info20.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info20.setText("x");

        info21.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info21.setText("x");

        info22.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info22.setText("x");

        info23.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info23.setText("x");

        info24.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info24.setText("x");

        info25.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info25.setText("x");

        info26.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info26.setText("x");

        info27.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info27.setText("x");

        info28.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info28.setText("x");

        info29.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info29.setText("x");

        info30.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info30.setText("x");

        javax.swing.GroupLayout informacoesLayout = new javax.swing.GroupLayout(informacoes);
        informacoes.setLayout(informacoesLayout);
        informacoesLayout.setHorizontalGroup(
            informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info16)
                    .addComponent(info1))
                .addGap(20, 20, 20)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info17)
                    .addComponent(info2))
                .addGap(20, 20, 20)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info18)
                    .addComponent(info3))
                .addGap(23, 23, 23)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info19)
                    .addComponent(info4))
                .addGap(23, 23, 23)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info20)
                    .addComponent(info5))
                .addGap(23, 23, 23)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info21)
                    .addComponent(info6))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info22)
                    .addComponent(info7))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info23)
                    .addComponent(info8))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info24)
                    .addComponent(info9))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info25)
                    .addComponent(info10))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info26)
                    .addComponent(info11))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info27)
                    .addComponent(info12))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info28)
                    .addComponent(info13))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info29)
                    .addComponent(info14))
                .addGap(22, 22, 22)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info30)
                    .addComponent(info15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        informacoesLayout.setVerticalGroup(
            informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacoesLayout.createSequentialGroup()
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info1)
                    .addComponent(info2)
                    .addComponent(info3)
                    .addComponent(info4)
                    .addComponent(info5)
                    .addComponent(info6)
                    .addComponent(info7)
                    .addComponent(info8)
                    .addComponent(info9)
                    .addComponent(info10)
                    .addComponent(info11)
                    .addComponent(info12)
                    .addComponent(info13)
                    .addComponent(info14)
                    .addComponent(info15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info16)
                    .addComponent(info17)
                    .addComponent(info18)
                    .addComponent(info19)
                    .addComponent(info20)
                    .addComponent(info21)
                    .addComponent(info22)
                    .addComponent(info23)
                    .addComponent(info24)
                    .addComponent(info25)
                    .addComponent(info26)
                    .addComponent(info27)
                    .addComponent(info28)
                    .addComponent(info29)
                    .addComponent(info30)))
        );

        Algoritmos.setText("Algoritmos");

        FIFO.setText("First Come, First Served");
        FIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIFOActionPerformed(evt);
            }
        });
        Algoritmos.add(FIFO);

        tarefaMaisCurtaPrimeiro.setText("Shortest Job First ");
        tarefaMaisCurtaPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefaMaisCurtaPrimeiroActionPerformed(evt);
            }
        });
        Algoritmos.add(tarefaMaisCurtaPrimeiro);

        proxMenosTempo.setText("Shortest Remaining Time Next");
        proxMenosTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxMenosTempoActionPerformed(evt);
            }
        });
        Algoritmos.add(proxMenosTempo);

        escChaveamentoCircular.setText("Round Robin");
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

        barraMenu.add(Algoritmos);

        jMenu1.setText("Editar");

        jMenuItem1.setText("Alterar Tamanho dos Processos");
        jMenu1.add(jMenuItem1);

        barraMenu.add(jMenu1);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void botaoStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoStartActionPerformed
        botaoStart.setEnabled(false);
        botaoPause.setEnabled(true); 
        threadFlag = false;
        threadJFrame = new Thread(){
            @Override 
            public void run () {            
                switch (escolhaAlgoritmo) {
                    case 1:
                        Main.escalonador.fifo();
                        break;
                    case 2:
                        Main.escalonador.tarMaisCurta();
                        break;
                    case 4:
                        Main.escalonador.chaveamentoCircular();
                        break;
                    case 5:
                        Main.escalonador.prioridades();
                        break;
                    case 8:
                        Main.escalonador.fracaoJusta();
                        break;
                }                
            }
        };
        threadJFrame.start();
        
    }//GEN-LAST:event_botaoStartActionPerformed
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

    private void botaoPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPauseActionPerformed
        threadFlag = true; 
        botaoStart.setEnabled(true);
        botaoPause.setEnabled(false);
    }//GEN-LAST:event_botaoPauseActionPerformed

    private void aumentaVelocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaVelocidadeActionPerformed
        Main.cpu.aumentaVelocidade();
    }//GEN-LAST:event_aumentaVelocidadeActionPerformed

    private void diminuiVelocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuiVelocidadeActionPerformed
        Main.cpu.diminuiVelocidade();
    }//GEN-LAST:event_diminuiVelocidadeActionPerformed

    private void botaoStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoStopActionPerformed
        threadFlag = true; 
        botaoStart.setEnabled(true);
        botaoPause.setEnabled(false);
        zeraBarras();
        zeraPrioridades();
        zeraTamProcessos();
        atualizaProcessosProcessados("0");
        
        mutex.lock();
        Main.calculadorTempo = new CalculadorTempo();
        mutex.unlock();
    }//GEN-LAST:event_botaoStopActionPerformed

    public static void atualizaBarras () {
        for (int i=0; i < Main.memoria.processos.size(); ++i) {
            barrasProcessos.get(i).setOrientation(JProgressBar.VERTICAL);
            barrasProcessos.get(i).setMaximum(Main.memoria.getTamMaxProc());
            barrasProcessos.get(i).setValue(Main.memoria.processos.get(i).getTempoExecucao());
            barrasProcessos.get(i).setVisible(true);
        }
    }
    
    public static void atualizaPrioridades() {
        for (int i=0; i < Main.memoria.processos.size(); ++i) {
            infoPrioridades.get(i).setText(Integer.toString(Main.memoria.processos.get(i).getPrioridade()));
            infoPrioridades.get(i).setVisible(true);
        }
    }
    
    public static void atualizaTamProcessos() {
        for (int i=0; i < Main.memoria.processos.size(); ++i) {
            infoTamProcessos.get(i).setText(Integer.toString(Main.memoria.processos.get(i).getTempoExecucao()));
            infoTamProcessos.get(i).setVisible(true);
        }
    }
    
    public static void zeraBarras() {
        for (JProgressBar jBar : barrasProcessos )
            jBar.setVisible(false);
    }
    
    public static void zeraPrioridades() {
        for ( JLabel jLabel : infoPrioridades) {
            jLabel.setVisible(false);          
        }
    }
    public static void zeraTamProcessos() {
        for ( JLabel jLabel : infoTamProcessos ) {
            jLabel.setVisible(false);         
        }
    }
    
    public static void atualizaProcessosProcessados(String resultado) {
        labelResultadoExe.setText(resultado);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    
    public static void atualizarLabelVazaoTempo()
    {
        labelResulVazao.setText(String.format("%.2f", Main.calculadorTempo.calcularTempoVazao()*60) + " p/min");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Algoritmos;
    private javax.swing.JMenuItem FIFO;
    private javax.swing.JButton aumentaVelocidade;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JProgressBar barraProgresso1;
    private javax.swing.JProgressBar barraProgresso10;
    private javax.swing.JProgressBar barraProgresso11;
    private javax.swing.JProgressBar barraProgresso12;
    private javax.swing.JProgressBar barraProgresso13;
    private javax.swing.JProgressBar barraProgresso14;
    private javax.swing.JProgressBar barraProgresso2;
    private javax.swing.JProgressBar barraProgresso3;
    private javax.swing.JProgressBar barraProgresso4;
    private javax.swing.JProgressBar barraProgresso5;
    private javax.swing.JProgressBar barraProgresso6;
    private javax.swing.JProgressBar barraProgresso7;
    private javax.swing.JProgressBar barraProgresso8;
    private javax.swing.JProgressBar barraProgresso9;
    private javax.swing.JButton botaoPause;
    private javax.swing.JButton botaoStart;
    private javax.swing.JButton botaoStop;
    private javax.swing.JButton diminuiVelocidade;
    private javax.swing.JMenuItem escChaveamentoCircular;
    private javax.swing.JMenuItem escFracaoJusta;
    private javax.swing.JMenuItem escGarantido;
    private javax.swing.JMenuItem escLoteria;
    private javax.swing.JMenuItem escPrioridades;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info10;
    private javax.swing.JLabel info11;
    private javax.swing.JLabel info12;
    private javax.swing.JLabel info13;
    private javax.swing.JLabel info14;
    private javax.swing.JLabel info15;
    private javax.swing.JLabel info16;
    private javax.swing.JLabel info17;
    private javax.swing.JLabel info18;
    private javax.swing.JLabel info19;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel info20;
    private javax.swing.JLabel info21;
    private javax.swing.JLabel info22;
    private javax.swing.JLabel info23;
    private javax.swing.JLabel info24;
    private javax.swing.JLabel info25;
    private javax.swing.JLabel info26;
    private javax.swing.JLabel info27;
    private javax.swing.JLabel info28;
    private javax.swing.JLabel info29;
    private javax.swing.JLabel info3;
    private javax.swing.JLabel info30;
    private javax.swing.JLabel info4;
    private javax.swing.JLabel info5;
    private javax.swing.JLabel info6;
    private javax.swing.JLabel info7;
    private javax.swing.JLabel info8;
    private javax.swing.JLabel info9;
    private javax.swing.JPanel informacoes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel labelExecutados;
    public static javax.swing.JLabel labelResulVazao;
    public static javax.swing.JLabel labelResultadoExe;
    private javax.swing.JLabel labelTempoVazao;
    private javax.swing.JLabel nomeAlgoritmo;
    private javax.swing.JPanel panelControle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JMenuItem proxMenosTempo;
    private javax.swing.JMenuItem tarefaMaisCurtaPrimeiro;
    // End of variables declaration//GEN-END:variables
}
