package Model;

import Main.*;
import Interface.*;
import tempo.CalculadorTempo;

public class CPU extends Thread{
    
    private Processo processoExecucao;
    private int velocidade;
    private final int QUANTUM;
    
    public CPU () {
        this.QUANTUM = 2;
        velocidade=500;
    }
     
    public void executa (Processo processo, int tempoExecucao, boolean prioridade, boolean ticket) {
        processoExecucao = processo;
        CalculadorTempo calculatorTempoProcesso = new CalculadorTempo();
        while ( tempoExecucao > 0 ) {
            if (JFramePrincipal.threadFlag) break;
            
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {}
            
            JFramePrincipal.atualizaBarras();
            JFramePrincipal.atualizaTamProcessos();            
            
            if ( prioridade ) 
                JFramePrincipal.atualizaPrioridades();       
            if ( ticket ) {
                JFramePrincipal.atualizaTicket();
                JFramePrincipal.atualizaTicketSorteado();            
            }
            processoExecucao.setTempoExecucao(processoExecucao.getTempoExecucao()-1);
                
            tempoExecucao--;
            processo = processoExecucao;            
        }
        
        Main.calculadorTempo.adicionarTempoUsoCPU( calculatorTempoProcesso.getTempoExecucaoCriacao() );
        if( processo.getPrioridade() <= Main.memoria.getMaxPrioridade() )
            processo.setPrioridade(processo.getPrioridade() + 0.1);
        else
            processo.setPrioridade(1);
        
        if ( processo.getTempoExecucao() <= 0)
            Main.memoria.removeProcesso(processo);
    }    
    
    public void aumentaVelocidade () {       
        if (velocidade != 50 && velocidade > 50) 
            velocidade -= 50;
        else if (velocidade <= 50 && velocidade != 20)
            velocidade -= 10;
    }
    
    public void diminuiVelocidade () {      
        velocidade += 50;
    }
    
    public int getQuantum()
    {
        return this.QUANTUM;
    }
   
}
