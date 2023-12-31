package Interface;

import Main.*;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import tempo.CalculadorTempo;

public class JFramePrincipal extends javax.swing.JFrame {
    
    public static int maximoUsuarios=4;
    public static int escolhaAlgoritmo;
    public static boolean threadFlag;
    
    public static boolean janelaAlteraTamProcessos;
    public static boolean janelaAlteraPrioProcessos;
    
    public static Thread threadJFrame;
    public static Thread calculadorTempoThread;
    public static ArrayList<JProgressBar> barrasProcessos;
    public static ArrayList<JLabel> infoPrioridades;
    public static ArrayList<JLabel> infoTamProcessos;
    public static ReentrantLock mutex = new ReentrantLock();
            
    public JFramePrincipal() {
        initComponents();
        
        escolhaAlgoritmo=1;
        threadFlag=false;
        janelaAlteraTamProcessos=false; 
        janelaAlteraPrioProcessos = false;
        nomeAlgoritmo.setText("First Come, First Served");  
        labelResultadoExe.setText("0");
        
        botaoPause.setEnabled(false);
        
        resulTicket.setVisible(false);
        labelTamanho.setVisible(false);
        labelTicket.setVisible(false);
        labelTicket2.setVisible(false);
        labelPrioridade.setVisible(false);
        
        // listas de controle das barras e labels de informações
        barrasProcessos = new ArrayList(Main.memoria.getTamMemoria());  
        infoPrioridades = new ArrayList(Main.memoria.getTamMemoria());
        infoTamProcessos= new ArrayList(Main.memoria.getTamMemoria());
        
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
                       Thread.sleep(150);
                   } catch (Exception e) {}
                   
                   mutex.lock();
                   try {
                       atualizarLabelVazaoTempo();
                       atualizarLabelUsoCPU();
                       atualizarLabelTempoMedioFila();
                       
                   } finally {
                       mutex.unlock();
                   }
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
        aumentaVelocidade = new javax.swing.JButton();
        labelExecutados = new javax.swing.JLabel();
        labelResultadoExe = new javax.swing.JLabel();
        labelTempoVazao = new javax.swing.JLabel();
        labelResulVazao = new javax.swing.JLabel();
        labelTempFila = new javax.swing.JLabel();
        labelResulTempoMedioFila = new javax.swing.JLabel();
        labelCPU = new javax.swing.JLabel();
        labelResulUsoCPU = new javax.swing.JLabel();
        labelTicket = new javax.swing.JLabel();
        resulTicket = new javax.swing.JLabel();
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
        labelPrioridade = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        labelTicket2 = new javax.swing.JLabel();
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
        Editar = new javax.swing.JMenu();
        abreEditaTamanho = new javax.swing.JMenuItem();
        abreEditaPrioridade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escalonador de Processos");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(900, 550));
        setMinimumSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 550));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(900, 260));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraProgresso.setBorder(null);
        barraProgresso.setBorderPainted(false);
        panelPrincipal.add(barraProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 20, 232));

        barraProgresso1.setBorder(null);
        barraProgresso1.setBorderPainted(false);
        panelPrincipal.add(barraProgresso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 15, 20, 232));

        barraProgresso2.setBorder(null);
        barraProgresso2.setBorderPainted(false);
        panelPrincipal.add(barraProgresso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 20, 232));

        barraProgresso3.setToolTipText("");
        barraProgresso3.setBorder(null);
        barraProgresso3.setBorderPainted(false);
        panelPrincipal.add(barraProgresso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 15, 20, 232));

        barraProgresso4.setBorder(null);
        barraProgresso4.setBorderPainted(false);
        panelPrincipal.add(barraProgresso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 15, 20, 232));

        barraProgresso5.setBorder(null);
        barraProgresso5.setBorderPainted(false);
        panelPrincipal.add(barraProgresso5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 15, 20, 232));

        barraProgresso6.setBorder(null);
        barraProgresso6.setBorderPainted(false);
        panelPrincipal.add(barraProgresso6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 15, 20, 232));

        barraProgresso7.setBorder(null);
        barraProgresso7.setBorderPainted(false);
        panelPrincipal.add(barraProgresso7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 15, 20, 232));

        barraProgresso8.setBorder(null);
        barraProgresso8.setBorderPainted(false);
        panelPrincipal.add(barraProgresso8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 15, 20, 232));

        barraProgresso9.setBorder(null);
        barraProgresso9.setBorderPainted(false);
        panelPrincipal.add(barraProgresso9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 15, 20, 232));

        barraProgresso10.setBorder(null);
        barraProgresso10.setBorderPainted(false);
        panelPrincipal.add(barraProgresso10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 15, 20, 232));

        barraProgresso11.setBorder(null);
        barraProgresso11.setBorderPainted(false);
        panelPrincipal.add(barraProgresso11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 15, 20, 232));

        barraProgresso12.setBorder(null);
        barraProgresso12.setBorderPainted(false);
        panelPrincipal.add(barraProgresso12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 15, 20, 232));

        barraProgresso13.setBorder(null);
        barraProgresso13.setBorderPainted(false);
        panelPrincipal.add(barraProgresso13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 15, 20, 232));

        barraProgresso14.setBorder(null);
        barraProgresso14.setBorderPainted(false);
        panelPrincipal.add(barraProgresso14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 15, 20, 232));

        panelTitulo.setPreferredSize(new java.awt.Dimension(900, 50));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeAlgoritmo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeAlgoritmo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeAlgoritmo.setText("Algoritmo");
        nomeAlgoritmo.setToolTipText("");
        nomeAlgoritmo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelTitulo.add(nomeAlgoritmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, -1));

        panelControle.setPreferredSize(new java.awt.Dimension(900, 110));
        panelControle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoStart.setText("Start");
        botaoStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStartActionPerformed(evt);
            }
        });
        panelControle.add(botaoStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        botaoPause.setText("Pause");
        botaoPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPauseActionPerformed(evt);
            }
        });
        panelControle.add(botaoPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        botaoStop.setText("Stop");
        botaoStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStopActionPerformed(evt);
            }
        });
        panelControle.add(botaoStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        diminuiVelocidade.setText("-");
        diminuiVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuiVelocidadeActionPerformed(evt);
            }
        });
        panelControle.add(diminuiVelocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        aumentaVelocidade.setText("+");
        aumentaVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaVelocidadeActionPerformed(evt);
            }
        });
        panelControle.add(aumentaVelocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        labelExecutados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelExecutados.setText("Executados:");
        panelControle.add(labelExecutados, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 80, -1));

        labelResultadoExe.setText("xxx");
        panelControle.add(labelResultadoExe, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 60, -1));

        labelTempoVazao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTempoVazao.setText("Temp/Vazão:");
        panelControle.add(labelTempoVazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 80, -1));

        labelResulVazao.setText("xxx");
        panelControle.add(labelResulVazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 60, -1));

        labelTempFila.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTempFila.setText("Temp/Fila:");
        panelControle.add(labelTempFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 80, -1));

        labelResulTempoMedioFila.setText("xxx");
        panelControle.add(labelResulTempoMedioFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 60, -1));

        labelCPU.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCPU.setText("CPU:");
        panelControle.add(labelCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 80, -1));

        labelResulUsoCPU.setText("xxx");
        panelControle.add(labelResulUsoCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 60, -1));

        labelTicket.setText("Ticket:");
        panelControle.add(labelTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 40));

        resulTicket.setText("xxx");
        panelControle.add(resulTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, 40));

        informacoes.setPreferredSize(new java.awt.Dimension(900, 105));
        informacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        info1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info1.setText("00");
        informacoes.add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 23, -1, -1));

        info2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info2.setText("00");
        informacoes.add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 23, -1, -1));

        info3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info3.setText("00");
        informacoes.add(info3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 23, -1, -1));

        info4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info4.setText("00");
        informacoes.add(info4, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 23, -1, -1));

        info5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info5.setText("00");
        informacoes.add(info5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 23, -1, -1));

        info6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info6.setText("00");
        informacoes.add(info6, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 23, -1, -1));

        info7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info7.setText("00");
        informacoes.add(info7, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 23, -1, -1));

        info8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info8.setText("00");
        informacoes.add(info8, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 23, -1, -1));

        info9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info9.setText("00");
        informacoes.add(info9, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 23, -1, -1));

        info10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info10.setText("00");
        informacoes.add(info10, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 23, -1, -1));

        info11.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info11.setText("00");
        informacoes.add(info11, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 23, -1, -1));

        info12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info12.setText("00");
        informacoes.add(info12, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 23, -1, -1));

        info13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info13.setText("00");
        informacoes.add(info13, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 23, -1, -1));

        info14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info14.setText("00");
        informacoes.add(info14, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 23, -1, -1));

        info15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info15.setText("00");
        informacoes.add(info15, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 23, -1, -1));

        info16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info16.setText("00");
        informacoes.add(info16, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 44, -1, -1));

        info17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info17.setText("00");
        informacoes.add(info17, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 44, -1, -1));

        info18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info18.setText("00");
        informacoes.add(info18, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 44, -1, -1));

        info19.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info19.setText("00");
        informacoes.add(info19, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 44, -1, -1));

        info20.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info20.setText("00");
        informacoes.add(info20, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 44, -1, -1));

        info21.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info21.setText("00");
        informacoes.add(info21, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 44, -1, -1));

        info22.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info22.setText("00");
        informacoes.add(info22, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 44, -1, -1));

        info23.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info23.setText("00");
        informacoes.add(info23, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 44, -1, -1));

        info24.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info24.setText("00");
        informacoes.add(info24, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 44, -1, -1));

        info25.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info25.setText("00");
        informacoes.add(info25, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 44, -1, -1));

        info26.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info26.setText("00");
        informacoes.add(info26, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 44, -1, -1));

        info27.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info27.setText("00");
        informacoes.add(info27, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 44, -1, -1));

        info28.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info28.setText("00");
        informacoes.add(info28, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 44, -1, -1));

        info29.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info29.setText("00");
        informacoes.add(info29, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 44, -1, -1));

        info30.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        info30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info30.setText("00");
        informacoes.add(info30, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 44, -1, -1));

        labelPrioridade.setText("Prioridade:");
        informacoes.add(labelPrioridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        labelTamanho.setText("Tamanho:");
        informacoes.add(labelTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        labelTicket2.setText("Ticket:");
        informacoes.add(labelTicket2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        barraMenu.setMaximumSize(new java.awt.Dimension(900, 25));
        barraMenu.setMinimumSize(new java.awt.Dimension(900, 25));
        barraMenu.setPreferredSize(new java.awt.Dimension(900, 25));

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

        escPrioridades.setText("Priority");
        escPrioridades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escPrioridadesActionPerformed(evt);
            }
        });
        Algoritmos.add(escPrioridades);

        escGarantido.setText("Scalation Guaranteed");
        escGarantido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escGarantidoActionPerformed(evt);
            }
        });
        Algoritmos.add(escGarantido);

        escLoteria.setText("Lotery");
        escLoteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escLoteriaActionPerformed(evt);
            }
        });
        Algoritmos.add(escLoteria);

        escFracaoJusta.setText("Fair Fraction");
        escFracaoJusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escFracaoJustaActionPerformed(evt);
            }
        });
        Algoritmos.add(escFracaoJusta);

        barraMenu.add(Algoritmos);

        Editar.setText("Editar");

        abreEditaTamanho.setText("Alterar Tamanho dos Processos");
        abreEditaTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreEditaTamanhoActionPerformed(evt);
            }
        });
        Editar.add(abreEditaTamanho);

        abreEditaPrioridade.setText("Alterar Prioridade dos Processos");
        abreEditaPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreEditaPrioridadeActionPerformed(evt);
            }
        });
        Editar.add(abreEditaPrioridade);

        barraMenu.add(Editar);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(informacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void botaoStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoStartActionPerformed
        botaoStart.setEnabled(false);
        botaoPause.setEnabled(true); 
        botaoStop.setEnabled(false);
        Algoritmos.setEnabled(false);
        Editar.setEnabled(false);
        threadFlag = false;
        threadJFrame = new Thread(){
            @Override 
            public void run () {            
                switch (escolhaAlgoritmo) {
                    case 1 -> Main.escalonador.fifo();
                    case 2 -> Main.escalonador.tarMaisCurta();
                    case 3 -> Main.escalonador.proxMenosTmpRest();
                    case 4 -> Main.escalonador.chaveamentoCircular();
                    case 5 -> Main.escalonador.prioridades();
                    case 6 -> Main.escalonador.garantido();
                    case 7 -> Main.escalonador.loteria();
                    case 8 -> Main.escalonador.fracaoJusta();
                }                
            }
        };
        threadJFrame.start();        
    }//GEN-LAST:event_botaoStartActionPerformed
    private void FIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIFOActionPerformed
        escolhaAlgoritmo=1;
        nomeAlgoritmo.setText("First Come, First Served");
    }//GEN-LAST:event_FIFOActionPerformed

    private void tarefaMaisCurtaPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefaMaisCurtaPrimeiroActionPerformed
        escolhaAlgoritmo=2;
        nomeAlgoritmo.setText("Shortest Job First");
    }//GEN-LAST:event_tarefaMaisCurtaPrimeiroActionPerformed

    private void proxMenosTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxMenosTempoActionPerformed
        escolhaAlgoritmo=3;
        nomeAlgoritmo.setText("Shortest Remaining Time Next");
    }//GEN-LAST:event_proxMenosTempoActionPerformed

    private void escChaveamentoCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escChaveamentoCircularActionPerformed
        escolhaAlgoritmo=4;
        nomeAlgoritmo.setText("Round Robin");
    }//GEN-LAST:event_escChaveamentoCircularActionPerformed

    private void escPrioridadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escPrioridadesActionPerformed
        escolhaAlgoritmo=5;
        nomeAlgoritmo.setText("Priority");
    }//GEN-LAST:event_escPrioridadesActionPerformed

    private void escGarantidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escGarantidoActionPerformed
        escolhaAlgoritmo=6;
        nomeAlgoritmo.setText("Scalation Guaranteed");
    }//GEN-LAST:event_escGarantidoActionPerformed

    private void escLoteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escLoteriaActionPerformed
        escolhaAlgoritmo=7;
        nomeAlgoritmo.setText("Lotery");
    }//GEN-LAST:event_escLoteriaActionPerformed

    private void escFracaoJustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escFracaoJustaActionPerformed
        escolhaAlgoritmo=8;
        nomeAlgoritmo.setText("Fair Fraction");
    }//GEN-LAST:event_escFracaoJustaActionPerformed

    private void botaoPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPauseActionPerformed
        threadFlag = true; 
        botaoStart.setEnabled(true);
        botaoPause.setEnabled(false);
        botaoStop.setEnabled(true);
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
        Algoritmos.setEnabled(true);
        Editar.setEnabled(true);
        
        labelTamanho.setVisible(false);
        labelTicket.setVisible(false);
        labelTicket2.setVisible(false);
        labelPrioridade.setVisible(false);
        
        Main.memoria.zeraProcessados();
        Main.memoria.clearMemoria();
        
        zeraBarras();
        zeraPrioridades();
        zeraTamProcessos();
        atualizaProcessosProcessados("0");
        
        mutex.lock();
        try {
            Main.calculadorTempo = new CalculadorTempo();
        } finally {
            mutex.unlock();
        }
    }//GEN-LAST:event_botaoStopActionPerformed

    private void abreEditaTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreEditaTamanhoActionPerformed
        if (!janelaAlteraTamProcessos) {
            JAlteraTamanhoProcessos telaAltera1 = new  JAlteraTamanhoProcessos();
            telaAltera1.setLocationRelativeTo(null);
            telaAltera1.setVisible(true);
            janelaAlteraTamProcessos=true; 
        }
    }//GEN-LAST:event_abreEditaTamanhoActionPerformed

    private void abreEditaPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreEditaPrioridadeActionPerformed
        if (!janelaAlteraPrioProcessos) {
            JAlteraPrioridadeProcessos jFrame = new JAlteraPrioridadeProcessos();
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            janelaAlteraPrioProcessos=true;
        }
    }//GEN-LAST:event_abreEditaPrioridadeActionPerformed

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
            infoPrioridades.get(i).setText(String.format("%.0f", Main.memoria.processos.get(i).getPrioridade()));
            infoPrioridades.get(i).setVisible(true);
        }
    }
    
    public static void atualizaTicket() {
        for (int i=0; i < Main.memoria.processos.size(); ++i) {
            infoPrioridades.get(i).setText(Integer.toString(Main.memoria.processos.get(i).getTicket()));
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
    
    public static void atualizaTicketSorteado() {        
        resulTicket.setText(Integer.toString(Main.escalonador.getTicketSorteado()));
        resulTicket.setVisible(true);
    }
    
    public static void atualizarLabelVazaoTempo() {
        labelResulVazao.setText(String.format("%.2f", Main.calculadorTempo.calcularTempoVazao()*60) + " p/min");
    }
    
    public static void atualizarLabelTempoMedioFila() {
        String s = String.format("%.2f", Main.calculadorTempo.calcularTempoMedioDeFilaSegundos()) + " s/p";
        labelResulTempoMedioFila.setText(s);
    }
    
    public static void atualizarLabelUsoCPU() {
        labelResulUsoCPU.setText( String.format("%.2f%%",  (Main.calculadorTempo.getTempoUsoCPU() / (double) Main.calculadorTempo.getTempoExecucaoCriacao())*100 ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Algoritmos;
    private javax.swing.JMenu Editar;
    private javax.swing.JMenuItem FIFO;
    private javax.swing.JMenuItem abreEditaPrioridade;
    private javax.swing.JMenuItem abreEditaTamanho;
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
    private javax.swing.JLabel labelCPU;
    private javax.swing.JLabel labelExecutados;
    public static javax.swing.JLabel labelPrioridade;
    public static javax.swing.JLabel labelResulTempoMedioFila;
    public static javax.swing.JLabel labelResulUsoCPU;
    public static javax.swing.JLabel labelResulVazao;
    public static javax.swing.JLabel labelResultadoExe;
    public static javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTempFila;
    private javax.swing.JLabel labelTempoVazao;
    public static javax.swing.JLabel labelTicket;
    public static javax.swing.JLabel labelTicket2;
    private javax.swing.JLabel nomeAlgoritmo;
    private javax.swing.JPanel panelControle;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JMenuItem proxMenosTempo;
    public static javax.swing.JLabel resulTicket;
    private javax.swing.JMenuItem tarefaMaisCurtaPrimeiro;
    // End of variables declaration//GEN-END:variables
}
